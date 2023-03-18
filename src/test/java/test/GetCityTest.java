package test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import request.GetCities;
import request.GetProduct;
import response.city.CityRootResponse;
import response.product.ProductList;
import response.product.ProductRootResponse;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


class GetCityTest{

    private final String CHECKED_CITY = "Алматы";

    @Description("Check weight all products in city")
    @Test
    void checkWeightForAllProductsInCity(){
//        @Step("Get count of cities")
        int totalCities = getFromCities(1).getTotal();
        int idCity = getFromCities(totalCities).getList()
               .stream().filter(p->p.getName().equals(CHECKED_CITY)).findFirst()
                .get().getId();
//        @Step("Get count of products")
        int totalProduct = getFromProduct(1, idCity).getTotal();

//        @Step("Get product from city")
        List<ProductList> products =getFromProduct(totalProduct,idCity).getList();

        products.forEach(x-> assertTrue(x.getWeight() > 0,"Product weight must be not 0"));


    }
    @Step("Get info from cities request")
    @Attachment(value = "CityResponse", type = "text/plain")
    private CityRootResponse getFromCities(int perPage){
        return GetCities.getCities(perPage)
                .then()
                .statusCode(200)
                .extract().as(CityRootResponse.class);
    }

    @Step("Get info from  products request")
    private ProductRootResponse getFromProduct(int perPage, int idCity){
        return GetProduct.getProduct(perPage, idCity)
                .then()
//                .log().all()
                .statusCode(200)
                .extract().as(ProductRootResponse.class);
    }

}
