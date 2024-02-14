package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import reportListener.extentReportListener;

import java.io.File;
import java.io.IOException;

public class screenshot {
    static String dir = System.getProperty("user.dir");

    public static String takeScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(dir+"/src/test/reports/screenshots/"+ extentReportListener.getCurrentDateAndTime()+".png");
        FileUtils.copyFile(source,target);
        return target.getAbsolutePath();
    }
}
