package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void selectDropdown(WebElement dropdown, int index) throws Exception {
        try{
            Select selDropdown = new Select(dropdown);
            selDropdown.selectByIndex(index);
//            List<WebElement> options = selDropdown.getOptions();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
}
