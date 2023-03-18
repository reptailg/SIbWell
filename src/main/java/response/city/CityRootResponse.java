package response.city;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityRootResponse {

    @JsonProperty("List")
    private List<CityList> list;
    @JsonProperty("Total")
    private int total;

}
