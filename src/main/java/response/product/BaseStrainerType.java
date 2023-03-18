package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class BaseStrainerType {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("StrainerTypes")
    private ArrayList<Object> strainerTypes;
    @JsonProperty("FilterField")
    private String filterField;
}
