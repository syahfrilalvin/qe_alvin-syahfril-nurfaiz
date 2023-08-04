package project;

import static net.serenitybdd.rest.SerenityRest.*;

public class DeleteProductAPI {

    private String url, token;


    public void setUrlAndValidToken(){
        url = "https://altashop-api.fly.dev/api/products/85497";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
    }

    public void requestAllProduct(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void verifyStatusCode(){
        then().statusCode(200);
    }


    public void requestEmptyAuthorized(){
        given()
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void verifyStatusEmptyAuthorized(){
        then().statusCode(401);
    }



    public void setUrlIdInvalid(){
        url = "https://altashop-api.fly.dev/api/products/124324234";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
    }
    public void verifyStatusIdInvalid(){
        then().statusCode(400);
    }

}
