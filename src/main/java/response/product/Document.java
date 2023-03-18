package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("BaseId")
    private int baseId;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("Caption")
    private String caption;
    @JsonProperty("DocumentTypeId")
    private int documentTypeId;
    @JsonProperty("DocumentType")
    private DocumentType documentType;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("ExpiresAt")
    private Date expiresAt;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("BaseDocument")
    private BaseDocument baseDocument;
    @JsonProperty("CountryId")
    private int countryId;
    @JsonProperty("ImageId")
    private int imageId;
    @JsonProperty("Image")
    private Image image;
}
