package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class FlagImage {
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
}
