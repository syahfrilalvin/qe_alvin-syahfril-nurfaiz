package project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class CreateCategoryAPI {
    private String url, token;


    public void setUrl(){

        url = "https://altashop-api.fly.dev/api/categories";
        token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

    }
    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("name", "Fashion");
        body.put("description", "Kumpulan fashion");
        return body;
    }


    public void requestWithValidParams(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().post(url);
    }

    public void verifyStatusCode(){
        then().statusCode(200);
    }

    public JSONObject bodyCreateEmptyParams(){
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "");
        return body;
    }


    public void requestWithEmptyParams(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(bodyCreateEmptyParams().toJSONString());
        when().post(url);
    }

    public void verifyStatusCodeEmpty(){
        then().statusCode(500);
    }

    public JSONObject bodyCreateEmptyName(){
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "test");
        return body;
    }


    public void requestWithEmptyName(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(bodyCreateEmptyName().toJSONString());
        when().post(url);
    }

    public JSONObject bodyCreateEmptyDesc(){
        JSONObject body = new JSONObject();
        body.put("name", "test");
        body.put("description", "");
        return body;
    }


    public void requestWithEmptyDesc(){
        given().header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(bodyCreateEmptyDesc().toJSONString());
        when().post(url);
    }

    public void requestWithEmptyToken(){
        given()
                .header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().post(url);
    }


    public void verifyStatusCodeEmptyToken(){
        then().statusCode(401);
    }
}
