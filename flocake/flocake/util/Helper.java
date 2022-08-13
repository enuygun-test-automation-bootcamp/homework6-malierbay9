package flocake.flocake.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//bu sınıfta page object sınıflarında kolayca kullanmak için bazı metotlar vardır

public class Helper {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public Helper(WebDriver driver){
        this.driver = driver;
        actions = new Actions(this.driver);
        wait = new WebDriverWait(this.driver, 5L);
    }

    public void hoverToElement(By element){ //imleci elemanın üstüne getirme
        actions.moveToElement(driver.findElement(element)).perform();
    }

    public void waitElementVisible(By element){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public void clickAndSendKeys(By element,String keysToSend){
        WebElement element1 = driver.findElement(element);
        element1.click();
        element1.sendKeys(keysToSend);
    }



}
