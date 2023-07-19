package project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.core.IsEqual.equalTo;

public class UpdateDataPosts {
    String url, token;


    public void setUrl(){
        url = "https://jsonplaceholder.typicode.com/posts/1";
    }

    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("title", "coba");
        body.put("body", "Test");
        body.put("userId", true);

        return body;
    }
    public void requestWithValidParams(){
        given().header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().put(url);

    }

    public void verifyStatusCode(){
        then().statusCode(200);
    }


    public void verifyDetailResponse(){
        then().body("title", equalTo("coba"));
    }

}
