package flocake.flocake.add_item_to_cart.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

//sepete eşya ekleme testi için asıl test sınıfımız
public class Tests extends BaseTest{

    @Test
    @Description("checking for successful item adding to cart")
    public void checkAddingItemToCart(){
        homePage.searchCake();
        searchResultsPage.chooseCake();
        productDetailsPage.clickAddToChart()
                .setReceiverAdress()
                .setReceiverName()
                .setReceiverPhone()
                .submitItem()
                .goToCart();


        Assert.assertEquals(cartPage.getTitle(),searchResultsPage.getCakesTitle());
    }

}
