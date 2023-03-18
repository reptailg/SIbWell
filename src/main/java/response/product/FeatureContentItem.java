package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class FeatureContentItem {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("FeatureContentId")
    private int featureContentId;
    @JsonProperty("FeatureContentItemTypeId")
    private int featureContentItemTypeId;
    @JsonProperty("ContentId")
    private int contentId;
    @JsonProperty("Position")
    private int position;
    @JsonProperty("Content")
    private Content content;
    @JsonProperty("FeatureContentItemType")
    private FeatureContentItemType featureContentItemType;
}