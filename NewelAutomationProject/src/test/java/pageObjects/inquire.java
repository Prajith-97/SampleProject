package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class inquire {
    @FindBy(xpath = "//div[@class='_close']//child::i")
    public static WebElement closeButton;

    @FindBy(xpath = "//div[@class='col-md-6 pr-1']/child::button[@class='cust-btn cust-inq']")
    public static WebElement inquireButton;

    @FindBy(xpath = "//div[@class='modal fade in']//div[@class='modal-header']//child::h2[@class='modal-title']")
    public static WebElement inquireDialogBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public static WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public static WebElement lastName;

    @FindBy(xpath = "//form[@id='form-inquire']//input[@id='email']")
    public static WebElement email;

    @FindBy(xpath = "//form[@id='form-inquire']//input[@id='telephone']")
    public static WebElement telephone;

    @FindBy(xpath = "//form[@id='form-inquire']//textarea[@id='message']")
    public static WebElement message;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//span[@id='recaptcha-error']")
    public static WebElement errorMessage;

    @FindBy(xpath = "//div[@class='col-md-6 pr-1']//button//child::span")
    public static WebElement addToProjectButton;

    @FindBy(xpath = "//div[@class='col-md-4 product-body-desk']//a[text()='Create New']")
    public static WebElement createNewButton;

    @FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-sm-12']//span[@class='title-pages']")
    public static WebElement projectPage;

}
