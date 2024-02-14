package utility;

import org.openqa.selenium.WebElement;

import java.util.List;

public class datePicker {

    public static void selectDate(WebElement datePicker, WebElement existMonth, WebElement existYear, WebElement forward, WebElement backwardArrow, List<WebElement> reqDate, String month, String year, String date) throws Exception {
        try{
            datePicker.click();
            while (true){
                String mm= existMonth.getText();
                String yy = existYear.getText();
                if(mm.equalsIgnoreCase(month) && yy.equalsIgnoreCase(year)){
                    break;
                }else{
                    forward.click();
                }
            }
            for(WebElement ele:reqDate){
                String dt = ele.getText();
                if(dt.equalsIgnoreCase(date)){
                    ele.click();
                    break;
                }

            }
        }catch (Exception e){
            throw new Exception(e);
        }


    }
}
