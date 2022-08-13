package search_api.search_api.tests;


import org.testng.annotations.BeforeClass;
import search_api.search_api.api.FlightTicketRequest;
import search_api.search_api.pages.HomePage;

//sayfa objelerini instance ettiğimiz asıl test class ı tarafından inherit edilen sınıf
public class BaseTest {

    HomePage homePage;
    FlightTicketRequest flightTicketRequest;

    @BeforeClass
    public void setUp(){
        this.homePage = new HomePage();
        this.flightTicketRequest = new FlightTicketRequest();
    }



}
