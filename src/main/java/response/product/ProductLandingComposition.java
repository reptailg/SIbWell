package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class ProductLandingComposition {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("ProductId")
    private int productId;
    @JsonProperty("Position")
    private int position;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("LandingCompositionPercentId")
    private int landingCompositionPercentId;
    @JsonProperty("LandingCompositionPercent")
    private LandingCompositionPercent landingCompositionPercent;
    @JsonProperty("LandingCompositionUnitId")
    private int landingCompositionUnitId;
    @JsonProperty("LandingCompositionUnit")
    private LandingCompositionUnit landingCompositionUnit;
    @JsonProperty("Value")
    private String value;
}
