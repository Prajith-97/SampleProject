package stepDefs;


import io.cucumber.java.*;
import io.cucumber.messages.types.Step;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import reportListener.extentReportListener;
import testCode.test_addToProjectFunctionality;
import testCode.test_amazonHomepage;
import testCode.test_contactInformation;
import testCode.test_inquireFunctionality;
import utility.readJsonData;
import utility.screenshot;
import utility.webDriverManager;
import java.io.IOException;
import static utility.webDriverManager.driver;

public class hooks {

    @After
    public static void afterScenario(Scenario scenario) throws IOException {

        //validate if scenario has failed
        if (scenario.isFailed()) {
//            final byte[] screenshot = extentReportListener.captureScreenshot(driver);
            final String screenshotAs = screenshot.takeScreenshot(driver);
            System.out.println(screenshotAs);
            scenario.attach(screenshotAs, "image/png", extentReportListener.getCurrentDateAndTime());

        }
    }
    static test_inquireFunctionality inquire;
    static test_addToProjectFunctionality project;

    static test_contactInformation info;

    static test_amazonHomepage homepage;

    @Before
    public void before() throws Exception {
        String dir = System.getProperty("user.dir");
        webDriverManager.launchDriver(readJsonData.readTestData(dir+"/src/test/testData/browserDetails.json","browser","name"));
        inquire = new test_inquireFunctionality(driver);
        project = new test_addToProjectFunctionality(driver);
        info = new test_contactInformation(driver);
        homepage = new test_amazonHomepage(driver);

    }
//    @After
//    public void after(){
//        driver.close();
//    }
}
