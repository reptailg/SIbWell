package request;

import io.restassured.response.Response;

public class GetProduct {
    private GetProduct() {
    }
    public static Response getProduct(int perPage,  int cityId){
        return RequestProductSpec.requestSpec(perPage, cityId)
                .when()
//                .log().all()
                .get("/product");
    }
}
