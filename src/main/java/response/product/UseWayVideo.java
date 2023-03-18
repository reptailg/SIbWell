package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class UseWayVideo {
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
    @JsonProperty("Name")
    private String name;
    @JsonProperty("VideoTypeId")
    private int videoTypeId;
    @JsonProperty("OraId")
    private String oraId;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("Preview")
    private Object preview;
}
