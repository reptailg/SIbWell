package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Model3d {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Images")
    private ArrayList<Object> images;
    @JsonProperty("UpdatedAt")
    private Date updatedAt;
    @JsonProperty("CreatedAt")
    private Date createdAt;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("Products")
    private Object products;
}
