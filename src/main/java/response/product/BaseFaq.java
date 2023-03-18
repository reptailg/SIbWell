package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class BaseFaq {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("GroupId")
    private int groupId;
    @JsonProperty("FaqTypeId")
    private int faqTypeId;
    @JsonProperty("Sort")
    private int sort;
}
