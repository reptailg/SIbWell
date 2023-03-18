package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class ProductSaldo {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("ProductId")
    private int productId;
    @JsonProperty("ScladId")
    private int scladId;
    @JsonProperty("Volume")
    private int volume;
}
