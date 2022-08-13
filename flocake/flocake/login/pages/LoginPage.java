package flocake.flocake.login.pages;

import flocake.flocake.common_pages.BasePage;
import flocake.flocake.util.PropertyReader;
import org.openqa.selenium.By;

//login sayfasındaki elementlerve metotlar
public class LoginPage extends BasePage {

    By loginMailField = By.id("loginEmail");
    By passwordField = By.id("loginPass");
    By loginButton = By.xpath("//button[text()='LOGIN']");

    public LoginPage setEmail(){    //mail,şifre yi properties dosyasından PropertyReader sınıfı yardımıyla alıyoruz
        helper.clickAndSendKeys(loginMailField, PropertyReader.getPropertyFromName("email"));
        return this;
    }

    public LoginPage setPassword(){
        helper.clickAndSendKeys(passwordField,PropertyReader.getPropertyFromName("password"));
        return this;
    }

    public void login(){
        driver.findElement(loginButton).click();
    }

}
