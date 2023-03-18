package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Strainer {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("StrainerTypeId")
    private int strainerTypeId;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("BaseStrainerId")
    private int baseStrainerId;
    @JsonProperty("BaseStrainer")
    private BaseStrainer baseStrainer;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
}
