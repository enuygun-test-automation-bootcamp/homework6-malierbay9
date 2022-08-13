package search_api.search_api.model;

import lombok.Data;

//response için kullandığımız model sınıfı
@Data
public class Airport {
    public String label;
    public String slug;
    public String id;
    public String country_code;
    public String country_name;
    public String city_code;
    public String city_name;
    public boolean is_city;
    public String airport;
    public Object ghost_label;
}
