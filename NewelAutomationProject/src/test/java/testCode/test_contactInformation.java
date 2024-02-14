package testCode;

import io.cucumber.datatable.DataTable;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.addToProject;
import pageObjects.contactInformation;
import pageObjects.inquire;
import utility.datePicker;
import utility.dropDown;
import utility.readJsonData;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class test_contactInformation {
    static WebDriver driver;

    static String dir = System.getProperty("user.dir");

    public test_contactInformation(WebDriver driver) {
        test_contactInformation.driver = driver;
        PageFactory.initElements(driver, contactInformation.class);
    }
    public static void enterValidDetails(DataTable table) throws Exception {
        try{
            //Date of pickup. Data is reading from json file
            String pickUpMonth = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","pickUpDate","month");
            String pickUpYear = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","pickUpDate","year");
            String pickUpDate = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","pickUpDate","date");

            //Date for return. Data is reading from json file
            String returnMonth = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","returnDate","month");
            String returnYear = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","returnDate","year");
            String returnDate = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","returnDate","date");

            List<Map<String, String>> userDetails = table.asMaps(String.class, String.class);
            for(Map<String,String>entry:userDetails){
                contactInformation.firstNameTextBox.sendKeys(entry.get("FirstName"));
                contactInformation.lastNameTextBox.sendKeys(entry.get("LastName"));
                contactInformation.emailTextBox.sendKeys(entry.get("Email"));
                contactInformation.telephoneTextBox.sendKeys(entry.get("Telephone"));
                dropDown.selectDropdown(contactInformation.countryDropDown,Integer.parseInt(entry.get("Country Index")));
                dropDown.selectDropdown(contactInformation.stateDropDown,Integer.parseInt(entry.get("State Index")));
            }
            datePicker.selectDate(contactInformation.pickUpDate, contactInformation.currentPickUpMonth, contactInformation.currentPickUpYear,contactInformation.forwardArrow, contactInformation.backwardArrow,  contactInformation.reqDate, pickUpMonth, pickUpYear, pickUpDate);
            datePicker.selectDate(contactInformation.returnDatePicker, contactInformation.currentPickUpMonth, contactInformation.currentPickUpYear,contactInformation.forwardArrow, contactInformation.backwardArrow,  contactInformation.reqDate, returnMonth, returnYear, returnDate);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickNextButton() throws Exception {
        try{
            contactInformation.nextButton.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyReviewPage() throws Exception {
        try{
            String reviewPageHeader = contactInformation.reviewOrderPage.getText();
            String expectedHeader = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","reviewOrderPageScenario1","reviewHeader");
            Assert.assertEquals(reviewPageHeader, expectedHeader);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickSubmit() throws Exception {
        try{
            contactInformation.submitRequestButton.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyRequest() throws Exception {
        try{
            String expectedTitle = readJsonData.readTestData(dir+"\\src\\test\\testData\\contactInformationTestData.json","submitRequestUrlScenario2","expectedUrl");
            String thankYouScreenTitle = driver.getCurrentUrl();
            Assert.assertEquals(thankYouScreenTitle, expectedTitle);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
