package search_api.search_api.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

//bu sınıfta page object sınıflarında kolayca kullanmak için bazı metotlar vardır
public class Helper {

    WebDriver driver;
    WebDriverWait wait;

    public Helper(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
    }

    public void checkElementVisible(By elementName) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementName)));
    }

    public void typeForInput(String kw, WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getTagName(),"input");
        element.sendKeys(kw);
    }



}
