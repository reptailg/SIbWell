package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    @JsonProperty("Id")
    private int id;
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
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DescriptionShort")
    private String descriptionShort;
    @JsonProperty("IngredientGroupId")
    private int ingredientGroupId;
    @JsonProperty("Image")
    private Image image;
}
