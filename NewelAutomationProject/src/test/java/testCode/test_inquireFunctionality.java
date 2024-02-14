package testCode;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.inquire;
import utility.readJsonData;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class test_inquireFunctionality {

    public static WebDriver driver;
    public test_inquireFunctionality(WebDriver driver) {
       test_inquireFunctionality.driver = driver;
        PageFactory.initElements(driver, inquire.class);
    }

    public static void launchBrowser() throws Exception {
        try{
            String dir = System.getProperty("user.dir");
            driver.get(readJsonData.readTestData(dir+"\\src\\test\\testData\\browserDetails.json","browserConfig","url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickCloseButton() throws Exception {
        try{
            inquire.closeButton.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickInquireButton() throws Exception {
        try{
            WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(50));
            inquire.inquireButton.click();
            wait.until(ExpectedConditions.visibilityOf(inquire.inquireDialogBox));

        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyInquireDialogBox() throws Exception {
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            String dialogBoxTitle = inquire.inquireDialogBox.getText();
            Assert.assertEquals(dialogBoxTitle, "INQUIRE");
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void enterDetails(DataTable table) throws Exception {
        try{
            List<Map<String, String>> userDetails = table.asMaps(String.class, String.class);
            for(Map<String,String>entry:userDetails){
                inquire.firstName.sendKeys(entry.get("FirstName"));
                inquire.lastName.sendKeys(entry.get("LastName"));
                inquire.email.sendKeys(entry.get("Email"));
                inquire.telephone.sendKeys(entry.get("Telephone"));
                inquire.message.sendKeys(entry.get("Message"));
            }
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickSubmitButton() throws Exception {
        try{
            inquire.submitButton.click();
            WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOf(inquire.errorMessage));
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void checkErrorMessage() throws Exception {
        try{
            String errorMsg = inquire.errorMessage.getText();
            Assert.assertEquals(errorMsg, "The checkbox on reCaptcha is required.");
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickAddToProject() throws Exception {
        try{
            inquire.addToProjectButton.click();

        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickCreateNewButton() throws Exception {
        try{
            inquire.createNewButton.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void myProjectPage() throws Exception {
        try{
            String projectTitle = inquire.projectPage.getText();
            Assert.assertEquals(projectTitle, "MY PROJECTS");
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
