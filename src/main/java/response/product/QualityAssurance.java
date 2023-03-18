package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class QualityAssurance {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Html")
    private String html;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("BaseQualityAssuranceId")
    private int baseQualityAssuranceId;
    @JsonProperty("BaseQualityAssurance")
    private BaseQualityAssurance baseQualityAssurance;
}
