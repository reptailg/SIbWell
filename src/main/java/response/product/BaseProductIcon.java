package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class BaseProductIcon {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ImageId")
    private int imageId;
    @JsonProperty("Image")
    private Image image;
    @JsonProperty("AdminName")
    private String adminName;
    @JsonProperty("IsMarker")
    private boolean isMarker;
    @JsonProperty("OraId")
    private int oraId;
}
