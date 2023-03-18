package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class BaseDocument {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("GroupId")
    private int groupId;
    @JsonProperty("OraId")
    private String oraId;
    @JsonProperty("DocumentTypeId")
    private int documentTypeId;
    @JsonProperty("DocumentType")
    private DocumentType documentType;
    @JsonProperty("RegionIds")
    private Object regionIds;
    @JsonProperty("LanguageIds")
    private Object languageIds;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("ExpiresAt")
    private Date expiresAt;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("OraUrl")
    private String oraUrl;
}
