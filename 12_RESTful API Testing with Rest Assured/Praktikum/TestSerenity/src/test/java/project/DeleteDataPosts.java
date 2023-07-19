package project;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class DeleteDataPosts {
    String url, token;


    public void setUrl(){
        url = "https://jsonplaceholder.typicode.com/posts/1";
    }

    public void requestDeleteDataPosts(){
//        given().header("Authorization", "Bearer" + token);
        given().delete(url);

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
