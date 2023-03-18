package response.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import response.city.CityList;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Type")
    private int type;
    @JsonProperty("EntityId")
    private int entityId;
    @JsonProperty("Countries")
    private Object countries;
    @JsonProperty("FreeDeliveryTotal")
    private int freeDeliveryTotal;
    @JsonProperty("CurrencyId")
    private int currencyId;
    @JsonProperty("IsFreeDelivery")
    private boolean isFreeDelivery;
    @JsonProperty("IsGlobalTotal")
    private boolean isGlobalTotal;
    @JsonProperty("ContactEmailAddress")
    private String contactEmailAddress;
    @JsonProperty("ServerUrl")
    private String serverUrl;
    @JsonProperty("FlagUrl")
    private String flagUrl;
    @JsonProperty("DefaultCityId")
    private int defaultCityId;
    @JsonProperty("BonusPaymentLimit")
    private int bonusPaymentLimit;
    @JsonProperty("Currency")
    private Currency currency;
    @JsonProperty("DefaultCity")
    private CityList defaultCity;
    @JsonProperty("RegistrationTypeId")
    private int registrationTypeId;
    @JsonProperty("ConsultantRegistrationCost")
    private int consultantRegistrationCost;
    @JsonProperty("CityMentorSearchStrategy")
    private CityMentorSearchStrategy cityMentorSearchStrategy;
    @JsonProperty("CityMentorSearchStrategyId")
    private int cityMentorSearchStrategyId;
    @JsonProperty("DefaultMentorContract")
    private String defaultMentorContract;
    @JsonProperty("SeoMetaCreateStrategyId")
    private int seoMetaCreateStrategyId;
    @JsonProperty("IsImportActions")
    private boolean isImportActions;
    @JsonProperty("IsImportProductPrices")
    private boolean isImportProductPrices;
    @JsonProperty("IsImportCountriesFeedbacks")
    private boolean isImportCountriesFeedbacks;
    @JsonProperty("IsSearchEnabled")
    private boolean isSearchEnabled;
    @JsonProperty("CallCenterStartHour")
    private String callCenterStartHour;
    @JsonProperty("CallCenterEndHour")
    private String callCenterEndHour;
    @JsonProperty("CallCenterWeekendStartHour")
    private String callCenterWeekendStartHour;
    @JsonProperty("CallCenterStartWeekendEndHour")
    private String callCenterStartWeekendEndHour;
    @JsonProperty("CallCenterPhoneRegions")
    private Object callCenterPhoneRegions;
    @JsonProperty("LostCartTimeout")
    private int lostCartTimeout;
    @JsonProperty("IsImportAvailable")
    private boolean isImportAvailable;
    @JsonProperty("DefaultPaymentMethod")
    private DefaultPaymentMethod defaultPaymentMethod;
    @JsonProperty("DefaultPaymentMethodId")
    private int defaultPaymentMethodId;
    @JsonProperty("IsConsultantConfirmationRequired")
    private boolean isConsultantConfirmationRequired;
}
