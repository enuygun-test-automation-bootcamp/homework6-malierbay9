package flocake.flocake.add_item_to_cart.pages;


import flocake.flocake.common_pages.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {    //sepet sayfasındaki kullanılan elemanlar ve metotlar

    private By itemTitle = By.cssSelector("h2.tt-title a");

    public String getTitle(){   //sepetteki elemanın title ını alan metot
        return driver.findElement(itemTitle).getText();
    }

}
