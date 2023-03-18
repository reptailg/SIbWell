package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ProductRootResponse {
    @JsonProperty("List")
    private List<ProductList> list;
    @JsonProperty("Total")
    private int total;

    public List<ProductList> getList() {
        return list;
    }

    public int getTotal() {
        return total;
    }
}
