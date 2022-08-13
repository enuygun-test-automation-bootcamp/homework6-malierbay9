package flocake.flocake.login.tests;

import flocake.flocake.common_pages.HomePage;
import flocake.flocake.login.pages.LoginPage;
import flocake.flocake.util.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

//sayfa objelerini instance ettiğimiz asıl test class ı tarafından inherit edilen sınıf
public class BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
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
