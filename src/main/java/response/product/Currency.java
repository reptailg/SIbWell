package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Symbol")
    private String symbol;
    @JsonProperty("Logo")
    private String logo;
    @JsonProperty("IsoCode")
    private int isoCode;
    @JsonProperty("LocalName")
    private String localName;
    @JsonProperty("LimitBonusPayment")
    private int limitBonusPayment;
}
