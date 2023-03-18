package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class FeatureContent {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("FeatureId")
    private int featureId;
    @JsonProperty("FeatureContentTypeId")
    private int featureContentTypeId;
    @JsonProperty("Position")
    private int position;
    @JsonProperty("FeatureContentType")
    private FeatureContentType featureContentType;
    @JsonProperty("FeatureContentItems")
    private ArrayList<FeatureContentItem> featureContentItems;
}
