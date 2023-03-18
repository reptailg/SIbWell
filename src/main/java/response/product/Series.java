package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Series {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("CategoryId")
    private int categoryId;
    @JsonProperty("TypeId")
    private int typeId;
    @JsonProperty("SourceId")
    private int sourceId;
    @JsonProperty("Position")
    private int position;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("ComponentCode")
    private String componentCode;
    @JsonProperty("Type")
    private Type type;
    @JsonProperty("IsDefaultCategory")
    private boolean isDefaultCategory;
    @JsonProperty("IsDynamic")
    private boolean isDynamic;
    @JsonProperty("IsCheckedDynamically")
    private boolean isCheckedDynamically;
    @JsonProperty("Volume")
    private int volume;
}
