package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class ProductIcon {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("ProductId")
    private int productId;
    @JsonProperty("BaseProductIconId")
    private int baseProductIconId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("DateStart")
    private Date dateStart;
    @JsonProperty("DateEnd")
    private Date dateEnd;
    @JsonProperty("OraId")
    private int oraId;
    @JsonProperty("BaseProductIcon")
    private BaseProductIcon baseProductIcon;
}
