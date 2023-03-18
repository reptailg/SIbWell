package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class DefaultPaymentMethod {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("ImageId")
    private int imageId;
    @JsonProperty("Image")
    private Image image;
    @JsonProperty("IsOnline")
    private boolean isOnline;
}
