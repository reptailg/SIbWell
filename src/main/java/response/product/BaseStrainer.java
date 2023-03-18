package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class BaseStrainer {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("BaseStrainerTypeId")
    private int baseStrainerTypeId;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("BaseStrainerType")
    private BaseStrainerType baseStrainerType;
    @JsonProperty("Strainers")
    private Object strainers;
    @JsonProperty("EntityId")
    private int entityId;
}
