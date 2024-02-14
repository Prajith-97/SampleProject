package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addToProject {
    @FindBy(xpath = "//input[@name='project']")
    public static WebElement projectNameTextBox;

    @FindBy(xpath = "//button[@type='sub']")
    public static WebElement createNewProjectButton;

    @FindBy(xpath = "//div[@class='button-desktop']//child::a")
    public static WebElement projectNameLink;

    @FindBy(xpath = "//div[@class='desktop-project-page']//span[@class='project-name']")
    public static WebElement verifyProjectName;

    @FindBy(xpath = "//div[@class='desktop-project-page']//table[@class='table']//b")
    public static WebElement itemNumber;

    @FindBy(xpath = "//div[@class='desktop-project-page']//div//span//following-sibling::a//child::button")
    public static WebElement checkAvailability;

    @FindBy(xpath = "//div[@style='margin-bottom: 1em;']//span[@style='font-size: 18px;']")
    public static WebElement informationPageDetails;
}
