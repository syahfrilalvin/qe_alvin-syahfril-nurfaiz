package project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class LoginAPI {
    String urlLogin;


    public void setUrl(){
        urlLogin = "https://altashop-api.fly.dev/api/auth/login";
    }
    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        return body;
    }


    public void requestWithValidParams(){
        given().header("Content-Type", "application/json")
                .body(bodyCreateProject().toJSONString());
        when().post(urlLogin);
    }

    public void verifyStatusCode(){
        then().statusCode(200);
    }


    public JSONObject bodyEmptyParams(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        return body;
    }
    public void requestEmptyParams(){
        given().header("Content-Type", "application/json")
                .body(bodyEmptyParams().toJSONString());
        when().post(urlLogin);
    }
    public void verifyStatusCodeEmpty(){
        then().statusCode(400);
    }
    public JSONObject bodyEmptyEmail(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "test");
        return body;
    }
    public void requestEmptyEmail(){
        given().header("Content-Type", "application/json")
                .body(bodyEmptyEmail().toJSONString());
        when().post(urlLogin);
    }

    public JSONObject bodyEmptyPassword(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "test");
        return body;
    }
    public void requestEmptyPassword(){
        given().header("Content-Type", "application/json")
                .body(bodyEmptyPassword().toJSONString());
        when().post(urlLogin);
    }


    public JSONObject bodyEmptyPasswordEmailValid(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "");
        return body;
    }
    public void requestEmptyPasswordEmailValid(){
        given().header("Content-Type", "application/json")
                .body(bodyEmptyPasswordEmailValid().toJSONString());
        when().post(urlLogin);
    }

    public JSONObject bodyEmptyEmailPasswordValid(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "123123");
        return body;
    }
    public void requestEmptyEmailPasswordValid(){
        given().header("Content-Type", "application/json")
                .body(bodyEmptyEmailPasswordValid().toJSONString());
        when().post(urlLogin);
    }

    public JSONObject bodyEmailValidPasswordInvalid(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123134234");
        return body;
    }
    public void requestEmailValidPasswordInvalid(){
        given().header("Content-Type", "application/json")
                .body(bodyEmailValidPasswordInvalid().toJSONString());
        when().post(urlLogin);
    }

    public JSONObject bodyEmailInvalidPasswordValid(){
        JSONObject body = new JSONObject();
        body.put("email", "someone");
        body.put("password", "123123");
        return body;
    }
    public void requestEmailInvalidPasswordValid(){
        given().header("Content-Type", "application/json")
                .body(bodyEmailInvalidPasswordValid().toJSONString());
        when().post(urlLogin);
    }

    public JSONObject bodyEmailInvalidPasswordInvalid(){
        JSONObject body = new JSONObject();
        body.put("email", "someone");
        body.put("password", "123123134234");
        return body;
    }
    public void requestEmailInvalidPasswordInvalid(){
        given().header("Content-Type", "application/json")
                .body(bodyEmailInvalidPasswordInvalid().toJSONString());
        when().post(urlLogin);
    }
}

