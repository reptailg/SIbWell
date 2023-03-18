package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class ProductOption {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("ProductId")
    private int productId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("OraOptionId")
    private int oraOptionId;
    @JsonProperty("ProductOptionType")
    private ProductOptionType productOptionType;
    @JsonProperty("ProductOptionBaseTypeId")
    private int productOptionBaseTypeId;
    @JsonProperty("ProductOptionBaseValueId")
    private int productOptionBaseValueId;
    @JsonProperty("IsSpecialName")
    private boolean isSpecialName;
    @JsonProperty("IsSpecialValue")
    private boolean isSpecialValue;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("IsSpecialShowInCatalog")
    private boolean isSpecialShowInCatalog;
    @JsonProperty("IsSpecialShowInCatalogValue")
    private boolean isSpecialShowInCatalogValue;
    @JsonProperty("IsPartOfProductName")
    private boolean isPartOfProductName;
}
