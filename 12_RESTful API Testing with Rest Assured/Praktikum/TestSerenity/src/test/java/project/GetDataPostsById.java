package project;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetDataPostsById {


    String url;
//    String token;

    @Step
    public void setUrl(){
        //token = ".........";
        url = "https://jsonplaceholder.typicode.com/posts/2";
    }

    @Step
    public void requestGetDataPostsById(){
        given().get(url);
    }

    @Step
    public void verifyStatusCode(){
        then().statusCode(200);
    }

    @Step
    public void verifyCorrectProject(){
        System.out.println("2");
    }


}
