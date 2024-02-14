package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testCode.test_addToProjectFunctionality;
import testCode.test_inquireFunctionality;
import utility.readJsonData;
import utility.webDriverManager;
import static utility.webDriverManager.driver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/amazonHomepage.feature",
        glue = "stepDefs",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                  "html:C:\\JavaIntellij\\NewelAutomationProject\\src\\test\\reports\\cucumberReport.html"})

public class runner  {

//    static test_addToProjectFunctionality addToProj;
//
//    static test_inquireFunctionality inquire;
//
//    @BeforeTest
//    @Parameters({"browserName"})
//    public void beforeTest(String browser) throws Exception {
//       webDriverManager.launchDriver(browser);
//    }
//
//
//    @BeforeClass
//    public void beforeClass() throws Exception {
//        inquire = new test_inquireFunctionality(driver);
//        addToProj = new test_addToProjectFunctionality(driver);
//    }

}
