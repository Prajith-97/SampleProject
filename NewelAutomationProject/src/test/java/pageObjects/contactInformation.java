package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class contactInformation {

    @FindBy(xpath = "//input[@name='first_name']")
    public static WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='last_name']")
    public static WebElement lastNameTextBox;

    @FindBy(xpath = "//div[@class='col-md-12 col-sm-12 col-xs-12']//input[@name='email']")
    public static WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='telephone']")
    public static WebElement telephoneTextBox;

    @FindBy(xpath = "//select[@id='country']")
    public static WebElement countryDropDown;

    @FindBy(xpath = "//select[@id='state']")
    public static WebElement stateDropDown;

    @FindBy(xpath = "//input[@id='pick-up']")
    public static WebElement pickUpDate;

    @FindBy(xpath = " //input[@id='return-date']")
    public static WebElement returnDatePicker;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    public static WebElement currentPickUpMonth;

    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    public static WebElement currentPickUpYear;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    public static WebElement forwardArrow;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
    public static WebElement backwardArrow;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr//td")
    public static List<WebElement> reqDate;

    @FindBy(xpath = "//div[@class='button-desktop'] //button[@class='btn btn-next']")
    public static WebElement nextButton;

    @FindBy(xpath = "//div[@style='margin-bottom: 1em;']//span")
    public static WebElement reviewOrderPage;

    @FindBy(xpath = "//table[@style='border-collapse: separate !important; border-spacing: 15px 20px !important;']//td//following-sibling::b[1]")
    public static WebElement inventoryNumber;

    @FindBy(xpath = "//button[@class='btn btn-request']")
    public static WebElement submitRequestButton;
}
