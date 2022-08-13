package flocake.flocake.signup.pages;

import flocake.flocake.common_pages.BasePage;
import flocake.flocake.util.PropertyReader;
import org.openqa.selenium.By;

//kayıt ol sayfasındaki elementler ve metotlar
public class SignupPage extends BasePage {

    By nameField = By.id("loginInputName");
    By emailField = By.id("loginInputEmail");
    By passwordField = By.id("loginInputPassword");
    By confirmPassField = By.id("loginInputPasswordConfirm");
    By createBtn = By.cssSelector("div.row div.col-auto button[type='submit']");

    public SignupPage setName(){    //isim,mail,şifre yi properties dosyasından PropertyReader sınıfı yardımıyla alıyoruz
        helper.clickAndSendKeys(nameField, PropertyReader.getPropertyFromName("name"));

        return this;
    }

    public SignupPage setEmail(){
        helper.clickAndSendKeys(emailField,PropertyReader.getPropertyFromName("email"));

        return this;
    }

    public SignupPage setPassword(){
        String password = PropertyReader.getPropertyFromName("password");
        helper.clickAndSendKeys(passwordField,password);
        helper.clickAndSendKeys(confirmPassField,password);

        return this;
    }

    public void createAccount(){
        driver.findElement(createBtn).click();
    }

}
