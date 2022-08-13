package flocake.flocake.login.tests;

import flocake.flocake.util.PropertyReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

// login testi için asıl test sınıfımız
public class Tests extends BaseTest {

    @Test
    @Description("checking for successful login")
    public void checkLogin(){
        homePage.clickMyAccount().clickSigninButton();
        loginPage.setEmail().setPassword().login();

        Assert.assertEquals(PropertyReader.getPropertyFromName("name"),homePage.clickMyAccount().getAccountName());
    }
}
