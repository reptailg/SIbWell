package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Language {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("NameRu")
    private String nameRu;
    @JsonProperty("FlagImageId")
    private int flagImageId;
    @JsonProperty("FlagImage")
    private FlagImage flagImage;
}
