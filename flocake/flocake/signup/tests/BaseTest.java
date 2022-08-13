package flocake.flocake.signup.tests;


import flocake.flocake.common_pages.HomePage;
import flocake.flocake.signup.pages.SignupPage;
import flocake.flocake.util.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//sayfa objelerini instance ettiğimiz asıl test class ı tarafından inherit edilen sınıf
public class BaseTest {

    HomePage homePage;
    SignupPage signupPage;

    @BeforeClass
    public void setUp(){
        homePage = new HomePage();
        signupPage = new SignupPage();
    }

    @AfterClass
    public void tearDown(){
        try {
            DriverFactory.quitDriver();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
