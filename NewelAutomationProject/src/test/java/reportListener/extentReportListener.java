package reportListener;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class extentReportListener  {
    public static ExtentTest extentTest;

//    public static void testStepHandle(String testStatus, WebDriver driver) throws IOException {
//        switch (testStatus){
//            case "FAIL":
//                extentTest.fail(MarkupHelper.createLabel("Test case failed", ExtentColor.RED));
//                extentTest.fail(throwable.fillInStackTrace());
//                String logLevel = String.valueOf(generateLog.logger.getContext().getConfiguration().getLoggerConfig(generateLog.logger.getName()).getLevel());
//                generateLog.log(logLevel, String.valueOf(throwable));
//                try{
//                    extentTest.addScreenCaptureFromPath(captureScreenshot(driver));
//                }catch (IOException e){
//                    e.printStackTrace();
//                }

//                if(driver!= null) {
//                    driver.quit();
//                }
//                break;
//            case "PASS":
//                extentTest.pass(MarkupHelper.createLabel("Test case passed", ExtentColor.GREEN));
//                break;
//            default:
//                break;
//        }
//    }
    public static byte[] captureScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] source = ts.getScreenshotAs(OutputType.BYTES);
//        File target = new File("C:\\JavaIntellij\\NewelAutomationProject\\src\\test\\reports\\screenshots\\"+getCurrentDateAndTime()+".png");
//        FileUtils.copyFile(source,target);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//        System.out.println(source.getAbsolutePath());
//        return target.getAbsolutePath();
        return source;
    }
    public static String captureScreenshotAs(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C:\\JavaIntellij\\NewelAutomationProject\\src\\test\\reports\\screenshots\\"+getCurrentDateAndTime()+".png");
//        FileUtils.copyFile(source,target);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//        System.out.println(source.getAbsolutePath());
        return target.getAbsolutePath();

    }
    public static String getCurrentDateAndTime(){
        String str=null;
        try{
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str = dateFormat.format(date);
            str = str.replace(" ","").replaceAll("/","").replaceAll(":","");
        }catch (Exception e){
            System.out.println(e);
        }
        return str;

    }
}
