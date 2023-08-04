package project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetDetailUserAPI {


    private String url, token;


    public void setUrlAndValidToken(){
        url = "https://altashop-api.fly.dev/api/auth/info";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";
    }

    public void requestGetUserInfo(){
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

}
