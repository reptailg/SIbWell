package request;

import io.restassured.specification.RequestSpecification;

public class RequestProductSpec extends RequestCitySpec {
    private RequestProductSpec() {
        super();
    }

    public static RequestSpecification requestSpec(int perPage, int cityId, int languageId) {
        return requestSpec(perPage)
                .params("CityId", cityId,
                "LanguageId", languageId);
    }

    public static RequestSpecification requestSpec(int perPage, int cityId) {
        return requestSpec(perPage, cityId, 9);
    }

}
