package flocake.flocake.add_item_to_cart.pages;


import flocake.flocake.common_pages.BasePage;
import flocake.flocake.util.PropertyReader;
import org.openqa.selenium.By;

//ürün detayları sayfasında kullanacağımız elementler ve metotlar
public class ProductDetailsPage extends BasePage {

    private By addToCart = By.id("addToCart");
    private By receiverAdress = By.id("full_address");
    private By receiverName = By.id("receiver_name");
    private By receiverPhone = By.id("receiverPhone");
    private By submit = By.xpath("//button[@class='btn add-to-cart']");
    private By viewCart = By.xpath("//div[@id='desc']/a");

    public ProductDetailsPage clickAddToChart(){
        driver.findElement(addToCart).click();

        return this;
    }

    public ProductDetailsPage setReceiverAdress(){  //ürünün gönderileceği adresi doldurma
        helper.clickAndSendKeys(receiverAdress, PropertyReader.getPropertyFromName("receiver_adress"));
        return this;
    }

    public ProductDetailsPage setReceiverName(){    //ürünün gönderileceği alıcı kısmını doldurma
        helper.clickAndSendKeys(receiverName,PropertyReader.getPropertyFromName("receiver_name"));
        return this;
    }

    public ProductDetailsPage setReceiverPhone(){   //alıcının numarası kısmını doldurma
        helper.clickAndSendKeys(receiverPhone,PropertyReader.getPropertyFromName("receiver_phone"));
        return this;
    }

    public ProductDetailsPage submitItem(){     //formu doldurduktan sonra sepete ekleme
        driver.findElement(submit).click();
        return this;
    }

    public void goToCart(){     //sepete gitme
        helper.waitElementVisible(viewCart);
        driver.findElement(viewCart).click();
    }

}
