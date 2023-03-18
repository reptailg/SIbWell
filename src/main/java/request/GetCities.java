package request;

import io.restassured.response.Response;

public class GetCities {
    private GetCities() {
    }

    public static Response getCities(int perPage){
        return RequestCitySpec.requestSpec(perPage)
                .when()
                .get("/city");
    }
}
