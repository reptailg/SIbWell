package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class LandingCompositionPercent {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("BaseLandingCompositionPercentId")
    private int baseLandingCompositionPercentId;
    @JsonProperty("BaseLandingCompositionPercent")
    private BaseLandingCompositionPercent baseLandingCompositionPercent;
}
