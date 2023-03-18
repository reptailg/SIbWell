package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Content {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("TinyUrl")
    private String tinyUrl;
    @JsonProperty("SmallUrl")
    private String smallUrl;
    @JsonProperty("MediumUrl")
    private String mediumUrl;
    @JsonProperty("LargeUrl")
    private String largeUrl;
    @JsonProperty("TypeId")
    private int typeId;
    @JsonProperty("Size")
    private int size;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("BaseIngredientId")
    private int baseIngredientId;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("ImageId")
    private int imageId;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DescriptionShort")
    private String descriptionShort;
    @JsonProperty("IngredientGroupId")
    private int ingredientGroupId;
    @JsonProperty("Image")
    private Image image;
}
