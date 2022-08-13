package search_api.search_api.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import search_api.search_api.model.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class FlightTicketRequest {

    private Response response;
    private ObjectMapper mapper;
    private List<Airport> airportList;
    private List<String> airportListString;

    public FlightTicketRequest() {
        mapper = new ObjectMapper();
        airportList = new ArrayList<>();
    }

    //arama sonucu attığımız request
    public List<String> airportsFromRequest(String keyword){

        response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("https://www.enuygun.com/ucak-bileti/trip-autocomplete/?term="+keyword)
                .then()
                .statusCode(200)
                .extract().response();

        try {   //response umuzu airport modeline çeviriyoruz
            airportList = mapper.readValue(response.getBody().asString(), new TypeReference<>(){}); //bir airport listesi elde ediyoruz
        }
        catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        //yukarıda aldığımız airport listesini string bir listeye çeviriyoruz
        //bu string listeyi, sayfada elemanlardan aldığımız gelen listeyle aynı formatta oluşturuyoruz
        //böylece 2 listeyi kıyaslayabiliriz

        //listenin her bir elemanı {  (şehir ismi), (ülke ismi)
        //                            (havaalanı)
        //                            (ID)                    } formatında olacak şekilde stream kullanarak alıyoruz

        airportListString =
                airportList.stream().map(airport->airport.getCity_name()+", "
                                +airport.getCountry_name()+"\n"
                                +airport.getAirport()+"\n"
                                +airport.getId()).collect(Collectors.toList());


            return airportListString;
    }

}
