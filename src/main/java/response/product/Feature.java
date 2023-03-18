package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Feature {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ProductId")
    private int productId;
    @JsonProperty("SubTitle")
    private String subTitle;
    @JsonProperty("TextArea")
    private String textArea;
    @JsonProperty("FeatureContents")
    private ArrayList<FeatureContent> featureContents;
    @JsonProperty("Position")
    private int position;
}
