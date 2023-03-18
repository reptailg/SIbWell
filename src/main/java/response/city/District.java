package response.city;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("OraId")
    private int oraId;
    @JsonProperty("Cities")
    private Object cities;
    @JsonProperty("CountryId")
    private int countryId;
    @JsonProperty("OraParishId")
    private int oraParishId;
}
