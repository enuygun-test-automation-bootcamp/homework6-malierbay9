package flocake.flocake.common_pages;

import org.openqa.selenium.By;

//flocake ana sayfasındaki elementler ve metotlar
public class HomePage extends BasePage{

    private By langText = By.xpath("//span[@class='text-uppercase'][1]");
    private By cakesBtn = By.xpath("//li[@class='dropdown megamenu tt-submenu'][4]");
    private By redVelvetCakeBtn = By.xpath("//ul[@class='tt-megamenu-submenu']/li/a[starts-with(text(),'Red')]");

    private By myAccountBtn = By.cssSelector("button[data-tooltip='My account']");
    private By registerButton = By.xpath("//div[@class='tt-dropdown-inner']/ul/li[3]/a");
    private By accountName = By.xpath("//div[@class='tt-dropdown-inner']/ul/li[1]/a");
    private By signinButton = By.xpath("//div[@class='tt-dropdown-inner']/ul/li[2]/a");

    public void searchCake(){
        helper.hoverToElement(cakesBtn);
        helper.waitElementVisible(redVelvetCakeBtn);
        driver.findElement(redVelvetCakeBtn).click();
    }

    public HomePage clickMyAccount(){
        driver.findElement(myAccountBtn).click();

        return this;
    }

    public void clickRegisterButton(){
        helper.waitElementVisible(registerButton);
        driver.findElement(registerButton).click();
    }

    public void clickSigninButton(){
        helper.waitElementVisible(signinButton);
        driver.findElement(signinButton).click();
    }

    public String getAccountName(){
        helper.waitElementVisible(accountName);

        return driver.findElement(accountName).getText();
    }



}
