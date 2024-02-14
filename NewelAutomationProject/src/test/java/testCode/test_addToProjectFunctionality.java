package testCode;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.addToProject;
import pageObjects.inquire;
import utility.readJsonData;

import java.io.IOException;
import java.time.Duration;

public class test_addToProjectFunctionality {

    public static WebDriver driver;
    static String projectName;

    public static String itemRefNo;
    static String dir = System.getProperty("user.dir");

    public test_addToProjectFunctionality(WebDriver driver) {
       test_addToProjectFunctionality.driver = driver;
       PageFactory.initElements(driver, addToProject.class);
    }
    public static void enterProjectName() throws Exception {
        try{
            projectName = readJsonData.readTestData(dir+"\\src\\test\\testData\\addToProjectTestData.json","createNewProject","projectName");
            addToProject.projectNameTextBox.sendKeys(projectName);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickCreateProjectButton() throws Exception {
        try{
            addToProject.createNewProjectButton.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyProjectName() throws Exception {
        try{
            String fetchProjectName = addToProject.projectNameLink.getText();
            Assert.assertEquals(fetchProjectName,projectName);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickProjectLink() throws Exception {
        try{
            addToProject.projectNameLink.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyProjectDetails() throws Exception {
        try{
            String getProjectName = addToProject.verifyProjectName.getText();
            itemRefNo = addToProject.itemNumber.getText();
            Assert.assertEquals(getProjectName,projectName);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void clickCheckAvailability() throws Exception {
        try{
            addToProject.checkAvailability.click();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    public static void verifyInformationPage() throws Exception {
        try{
          String expectedPageName = readJsonData.readTestData(dir+"\\src\\test\\testData\\addToProjectTestData.json","informationPage","pageName");
          String informationPageName = addToProject.informationPageDetails.getText();
          Assert.assertEquals(informationPageName,expectedPageName);
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
