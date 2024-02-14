package testCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.amazonHomepage;
import utility.readJsonData;
import utility.screenshot;

import java.io.IOException;


public class test_amazonHomepage extends amazonHomepage {
static WebDriver driver;

public test_amazonHomepage(WebDriver driver){
    test_amazonHomepage.driver =driver;
    PageFactory.initElements(driver, amazonHomepage.class);
    }

    public static void launchWebsite() throws Exception {
        String dir = System.getProperty("user.dir");
        String url = readJsonData.readTestData(dir+"/src/test/testData/browserDetails.json","browser","url");
        driver.get(url);
//        screenshot.takeScreenshot(driver);
    }
    public static void clickDropdownButton() throws IOException {
        dropdown.click();
//        screenshot.takeScreenshot(driver);
    }
    public static void checkDropdownDisplayed(){
        Assert.assertTrue(dropdownElement.isDisplayed());
    }
    public static void selectCategoryDropdown(){
      for(WebElement ele:dropdownElements){
          String categoryName = ele.getText();
          if(categoryName.equalsIgnoreCase("Alexa Skills")){
              ele.click();
          }
      }
    }
}
