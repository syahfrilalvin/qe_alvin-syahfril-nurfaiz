package project;

import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateDataPosts {

    String url, token;

    public void setUrl(){
        url = "https://jsonplaceholder.typicode.com/posts";
    }

    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("title", "coba");
        body.put("body", 30);
        body.put("userId", true);

        return body;
    }


    public void requestWithValidParams(){
        given().header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().post(url);

    }


    public void verifyStatusCode(){
        then().statusCode(201);
    }


    public void verifyDetailResponse(){
        then().body("title", equalTo("coba"));
    }

}
