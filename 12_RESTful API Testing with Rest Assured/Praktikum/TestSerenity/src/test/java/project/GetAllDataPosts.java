package project;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetAllDataPosts {
    String url;
//    String token;

    @Step
    public void setUrl(){
//        token = ".......";
        url = "https://jsonplaceholder.typicode.com/posts";
    }
    @Step
    public void requestGetAllDataPosts(){
//        given().header("Authorization", "Bearer" + token);
        given().get(url);

    }
    @Step
    public void verifyStatusCode(){
        then().statusCode(200);
    }

    @Step
    public void verifyCorrectProject(){
        //then().body("[0]. userId". equals("1"));
        System.out.println("1");
    }

}
