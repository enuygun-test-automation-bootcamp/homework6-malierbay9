package flocake.flocake.common_pages;

import flocake.flocake.util.DriverFactory;
import flocake.flocake.util.Helper;
import org.openqa.selenium.WebDriver;

//diğer sayfalar tarafından inherit edilir
public class BasePage {

    protected static WebDriver driver = DriverFactory.getDriver();//driver ımızı instance ediyoruz
    public Helper helper;

    public BasePage(){
        helper = new Helper(driver);
    }

}
