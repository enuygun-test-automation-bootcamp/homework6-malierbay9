package flocake.flocake.signup.tests;



import flocake.flocake.util.PropertyReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

//kayıt olma testi için asıl test sınıfımız
public class Tests extends BaseTest {

    @Test
    @Description("checking for successful sign up")
    public void checkSignup(){
        homePage.clickMyAccount().clickRegisterButton();
        signupPage.setName().setEmail().setPassword().createAccount();

        Assert
                .assertEquals(homePage.clickMyAccount().getAccountName(), PropertyReader.getPropertyFromName("name"));
    }

}
