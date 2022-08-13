package flocake.flocake.add_item_to_cart.tests;


import flocake.flocake.add_item_to_cart.pages.CartPage;
import flocake.flocake.add_item_to_cart.pages.ProductDetailsPage;
import flocake.flocake.add_item_to_cart.pages.SearchResultsPage;
import flocake.flocake.common_pages.HomePage;
import flocake.flocake.util.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//sayfa objelerini instance ettiğimiz asıl test class ı tarafından inherit edilen sınıf
public class BaseTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;

    @BeforeClass
    public void setup(){
        this.homePage = new HomePage();
        this.searchResultsPage = new SearchResultsPage();
        this.productDetailsPage = new ProductDetailsPage();
        this.cartPage = new CartPage();
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
