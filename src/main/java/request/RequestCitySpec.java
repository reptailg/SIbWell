package request;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class RequestCitySpec {
    protected RequestCitySpec() {
    }

    public static RequestSpecification requestSpec(int perPage, int currentPage, int regionId) {
        return given()
                .baseUri("https://kz.siberianwellness.com/api/v1")
                .header("token", "fd49d3cd-789c-4d00-912d-3382ca4f3968")
                .contentType(ContentType.JSON)
                .params("RegionId", regionId, "PerPage", perPage,
                        "CurrentPage", currentPage);
    }

    public static RequestSpecification requestSpec(int perPage, int currentPage){
        return requestSpec(perPage, currentPage, 22);
    }
    public static RequestSpecification requestSpec(int perPage){
        return requestSpec(perPage, 1, 22);
    }

    public static RequestSpecification requestSpec(){
        return requestSpec(10, 1,22);
    }
}
