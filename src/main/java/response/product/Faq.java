package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Faq {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("BaseId")
    private int baseId;
    @JsonProperty("Answer")
    private String answer;
    @JsonProperty("Question")
    private String question;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("BaseFaq")
    private BaseFaq baseFaq;
    @JsonProperty("FaqTypeId")
    private int faqTypeId;
    @JsonProperty("Sort")
    private int sort;
}
