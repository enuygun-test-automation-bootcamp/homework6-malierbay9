package flocake.flocake.add_item_to_cart.pages;

import flocake.flocake.common_pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

//arama sonuçlarının olduğu sayfadaki elementler ve metotlar
public class SearchResultsPage extends BasePage {

    private By allRedCakes = By.xpath("//div[@class='tt-description mb-2']/span");
    private String cakesTitle;

    public SearchResultsPage(){

    }

    public void chooseCake(){   //arama sonucları sonrası gelen elemanlardan rastgele birini seçer

        List<WebElement> cakes = driver.findElements(allRedCakes);
        double i = Math.floor(Math.random()*cakes.size());  //0 ile arama sonuçlarının sayısı arasında bir sayı üretir
        this.cakesTitle = cakes.get((int)i).getText();
        cakes.get((int)i).click();

    }

    public String getCakesTitle() { //seçeceğimiz elemanın title ını aldırma
        return cakesTitle;
    }

}
