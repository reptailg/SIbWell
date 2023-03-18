package response.city;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityList {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("CountryId")
    private int countryId;
    @JsonProperty("OraId")
    private int oraId;
    @JsonProperty("DistrictId")
    private int districtId;
    @JsonProperty("Lat")
    private double lat;
    @JsonProperty("Long")
    private double lon;
    @JsonProperty("GoogleGeoId")
    private String googleGeoId;
    @JsonProperty("TimezoneId")
    private int timezoneId;
    @JsonProperty("AreaId")
    private int areaId;
    @JsonProperty("District")
    private District district;
    @JsonProperty("Area")
    private Area area;
    @JsonProperty("IsShowArea")
    private boolean isShowArea;
    @JsonProperty("StoreId")
    private int storeId;
    @JsonProperty("DeliveryPointsNumber")
    private int deliveryPointsNumber;
    @JsonProperty("MajorOrder")
    private int majorOrder;

}
