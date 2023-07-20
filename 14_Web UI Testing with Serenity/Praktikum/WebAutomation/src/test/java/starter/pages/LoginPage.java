package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldUsername = By.id("user-name");
    private By fieldPassword = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("/h3[@data-test = 'error']");
    private By productHeader = By.className("shopping_cart_link");

    @Step
    public void goToLoginPage(){
        open();
        //openAt("/v1/index.html");
    }

    @Step
    public void inputUsername(){
        $(fieldUsername).type("standard_user");

    }

    @Step
    public void inputPassword(){
        $(fieldPassword).type("secret_sauce");

    }

    @Step
    public void clickLoginBtn(){
        $(loginButton).click();

    }

    @Step
    public void verifyProductHeader(){
        $(productHeader).isDisplayed();

    }

//Scenario 2
    @Step
    public void inputInvalidUsername(){
        $(fieldUsername).type("test");

    }
    @Step
    public void inputInvalidPassword(){
        $(fieldPassword).type("test");

    }

    @Step
    public void verifyLoginPage(){
        System.out.println(errorMessage);

    }

    //Scenario 3
    @Step
    public void emptyUsername(){
        $(fieldUsername).type("");

    }

    //Scenario 4
    @Step
    public void emptyPassword(){
        $(fieldPassword).type("");

    }
}
