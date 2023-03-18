package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductList {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("IsActive")
    private boolean isActive;
    @JsonProperty("Code")
    private int code;
    @JsonProperty("RegionId")
    private int regionId;
    @JsonProperty("LanguageId")
    private int languageId;
    @JsonProperty("IsBad")
    private boolean isBad;
    @JsonProperty("Composition")
    private String composition;
    @JsonProperty("Contraindications")
    private String contraindications;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DescriptionShort")
    private String descriptionShort;
    @JsonProperty("GoogleCatId")
    private int googleCatId;
    @JsonProperty("OraId")
    private int oraId;
    @JsonProperty("HasAdvLicense")
    private boolean hasAdvLicense;
    @JsonProperty("IsArchived")
    private boolean isArchived;
    @JsonProperty("Brief")
    private String brief;
    @JsonProperty("CEODescrypt")
    private String cEODescrypt;
    @JsonProperty("CEOHeader")
    private String cEOHeader;
    @JsonProperty("CEOKeywords")
    private String cEOKeywords;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("NameShort")
    private String nameShort;
    @JsonProperty("NStatusId")
    private int nStatusId;
    @JsonProperty("IsOnlyOnline")
    private boolean isOnlyOnline;
    @JsonProperty("ShowBrief")
    private boolean showBrief;
    @JsonProperty("IsSiteShow")
    private boolean isSiteShow;
    @JsonProperty("UrlCode")
    private String urlCode;
    @JsonProperty("Status")
    private boolean status;
    @JsonProperty("Markers")
    private ArrayList<Marker> markers;
    @JsonProperty("NStatus")
    private NStatus nStatus;
    @JsonProperty("Region")
    private Region region;
    @JsonProperty("Language")
    private Language language;
    @JsonProperty("Price")
    private int price;
    @JsonProperty("CurrencyId")
    private int currencyId;
    @JsonProperty("Currency")
    private Currency currency;
    @JsonProperty("Images")
    private ArrayList<Image> images;
    @JsonProperty("Videos")
    private ArrayList<Video> videos;
    @JsonProperty("EnergyValue")
    private int energyValue;
    @JsonProperty("Proteins")
    private int proteins;
    @JsonProperty("Fats")
    private int fats;
    @JsonProperty("Carbohydrates")
    private int carbohydrates;
    @JsonProperty("Packaged")
    private String packaged;
    @JsonProperty("Point")
    private double point;
    @JsonProperty("OldPrice")
    private int oldPrice;
    @JsonProperty("Reviews")
    private Object reviews;
    @JsonProperty("Faqs")
    private ArrayList<Faq> faqs;
    @JsonProperty("Documents")
    private ArrayList<Document> documents;
    @JsonProperty("Advantages")
    private ArrayList<Advantage> advantages;
    @JsonProperty("ProductSaldo")
    private ProductSaldo productSaldo;
    @JsonProperty("ProductIcons")
    private ArrayList<ProductIcon> productIcons;
    @JsonProperty("Ingredients")
    private ArrayList<Ingredients> ingredients;
    @JsonProperty("Strainers")
    private ArrayList<Strainer> strainers;
    @JsonProperty("Discount")
    private int discount;
    @JsonProperty("DiscountPercentage")
    private double discountPercentage;
    @JsonProperty("Chips")
    private int chips;
    @JsonProperty("Weight")
    private int weight;
    @JsonProperty("FullComposition")
    private String fullComposition;
    @JsonProperty("ImageLabel")
    private ImageLabel imageLabel;
    @JsonProperty("ImageLabelId")
    private int imageLabelId;
    @JsonProperty("Stars")
    private double stars;
    @JsonProperty("ProductOptions")
    private ArrayList<ProductOption> productOptions;
    @JsonProperty("Series")
    private ArrayList<Series> series;
    @JsonProperty("UseWayText")
    private String useWayText;
    @JsonProperty("UseWayImageId")
    private int useWayImageId;
    @JsonProperty("UseWayImage")
    private UseWayImage useWayImage;
    @JsonProperty("UseWayVideoId")
    private int useWayVideoId;
    @JsonProperty("UseWayVideo")
    private UseWayVideo useWayVideo;
    @JsonProperty("ChooseGroupId")
    private int chooseGroupId;
    @JsonProperty("SaleEndDate")
    private Date saleEndDate;
    @JsonProperty("SaleStartDate")
    private Date saleStartDate;
    @JsonProperty("FeedbackCount")
    private int feedbackCount;
    @JsonProperty("GarantQualityText")
    private String garantQualityText;
    @JsonProperty("UseWayVideoTitle")
    private String useWayVideoTitle;
    @JsonProperty("UseWayHeaderText")
    private String useWayHeaderText;
    @JsonProperty("AnotherLanguageProduct")
    private Object anotherLanguageProduct;
    @JsonProperty("Model3dId")
    private int model3dId;
    @JsonProperty("Model3d")
    private Model3d model3d;
    @JsonProperty("ImportSourceRegionId")
    private int importSourceRegionId;
    @JsonProperty("ImportSourceRegion")
    private ImportSourceRegion importSourceRegion;
    @JsonProperty("LandingTitle")
    private String landingTitle;
    @JsonProperty("LandingDescription")
    private String landingDescription;
    @JsonProperty("RecipeHeader")
    private String recipeHeader;
    @JsonProperty("QualityAssuranceId")
    private int qualityAssuranceId;
    @JsonProperty("QualityAssurance")
    private QualityAssurance qualityAssurance;
    @JsonProperty("ConsumerTitle")
    private String consumerTitle;
    @JsonProperty("ConsumerDescription")
    private String consumerDescription;
    @JsonProperty("ProvenByScienceTitle")
    private String provenByScienceTitle;
    @JsonProperty("UseWayHackContent")
    private String useWayHackContent;
    @JsonProperty("UseWayVideoUrl")
    private String useWayVideoUrl;
    @JsonProperty("UseWayIsImageVideoPreview")
    private boolean useWayIsImageVideoPreview;
    @JsonProperty("UseWayHackSubTitle")
    private String useWayHackSubTitle;
    @JsonProperty("LandingCompositionTitle")
    private String landingCompositionTitle;
    @JsonProperty("LandingCompositionPromoImageId")
    private int landingCompositionPromoImageId;
    @JsonProperty("LandingCompositionPromoImage")
    private LandingCompositionPromoImage landingCompositionPromoImage;
    @JsonProperty("LandingCompositionDescriptionText")
    private String landingCompositionDescriptionText;
    @JsonProperty("LandingCompositionUseDescriptionText")
    private boolean landingCompositionUseDescriptionText;
    @JsonProperty("ProductLandingSettingsShowOnSite")
    private boolean productLandingSettingsShowOnSite;
    @JsonProperty("ProductLandingSettingsAccentColor")
    private String productLandingSettingsAccentColor;
    @JsonProperty("Features")
    private ArrayList<Feature> features;
    @JsonProperty("ProductLandingCompositions")
    private ArrayList<ProductLandingComposition> productLandingCompositions;
    @JsonProperty("QualityMarks")
    private ArrayList<Object> qualityMarks;
    @JsonProperty("IsShowFullComposition")
    private boolean isShowFullComposition;
    @JsonProperty("IsNotApprovedNew")
    private boolean isNotApprovedNew;
    @JsonProperty("OptionString")
    private String optionString;
    @JsonProperty("AgeId")
    private int ageId;
    @JsonProperty("SexId")
    private int sexId;
    @JsonProperty("PackId")
    private int packId;
    @JsonProperty("GoogleProductType")
    private String googleProductType;
    @JsonProperty("IsNotMedicineWarning")
    private boolean isNotMedicineWarning;
    @JsonProperty("LandingUseWay")
    private String landingUseWay;
    @JsonProperty("NameFull")
    private String nameFull;
    @JsonProperty("IsClub200Exclude")
    private boolean isClub200Exclude;
    @JsonProperty("MaxQtyPerDay")
    private int maxQtyPerDay;
    @JsonProperty("MainCategoryId")
    private int mainCategoryId;
    @JsonProperty("BreadCrumbs")
    private Object breadCrumbs;
}
