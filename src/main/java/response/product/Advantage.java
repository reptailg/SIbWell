package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Advantage {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("BaseId")
    private int baseId;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("ImageUrl")
    private String imageUrl;
    @JsonProperty("ComponentTemplateName")
    private String componentTemplateName;
    @JsonProperty("ImageId")
    private int imageId;
    @JsonProperty("Image")
    private Image image;
}
