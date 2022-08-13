package search_api.search_api.tests;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest{
    String keyword ;

    public Tests(){
        keyword = "ada";
    }

    @Test
    @Description("checks search results and request results are same")
    public void checkListForSearch(){

        homePage.searchForFlightTicket(keyword);

        //assertEquals ile 2 listeyi karşılaştırabiliyoruz
        //1. liste ana sayfada search sonrası gelen elementlerden elde ettiğimiz liste
        //2. liste request attığımız gelen response tan aldığımız liste

        Assert.assertEquals(homePage.listForFlightTicketSearchByStream(),flightTicketRequest.airportsFromRequest(keyword));

    }


}
