package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class amazonHomepage {
    @FindBy(id="searchDropdownBox")
    protected static WebElement dropdown;

    @FindBy(xpath="//select[@id='searchDropdown']//child::option")
    protected static WebElement dropdownElement;

    @FindBy(xpath="//select[@id='searchDropdown']//child::option")
    protected static List<WebElement> dropdownElements;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchTextBox;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchButton;
}
