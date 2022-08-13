package search_api.search_api.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import search_api.search_api.exceptions.WrongDriverTypeException;
import search_api.search_api.util.DriverFactory;
import search_api.search_api.util.Helper;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

//enuygun homepage
public class HomePage{

    //WebDriver setups
    WebDriver driver;
    Helper helper;

    By gdpr = By.xpath("//div[@id='CookieAlert']/button");
    By fromSearchBox = By.id("OriginInput");
    By searchResults =By.xpath("//*/ul[@role='listbox']/li");
    By searchResultTab = By.id("react-autowhatever-OriginInput");

    //login page constructor
    public HomePage() {
        try {
            this.driver = DriverFactory.getDriver();
        }
        catch (WrongDriverTypeException e){
            System.out.println(e.getMessage());
        }

        this.helper = new Helper(driver);
    }

    public void searchForFlightTicket(String kw){   //search

        WebElement flightSearch =  driver.findElement(fromSearchBox);

        try{
            driver.findElement(gdpr).isEnabled();
            driver.findElement(gdpr).click();

        }catch (NoSuchElementException e){
            System.out.println("gdpr is not visible");
        }

        this.helper.typeForInput(kw,flightSearch);

    }

    public List<String> listForFlightTicketSearchByStream(){    //getting elements from search results

        helper.checkElementVisible(searchResultTab);

        return  driver
                .findElements(searchResults)
                .stream().map(e->e.getText()).collect(Collectors.toList());

    }



}

