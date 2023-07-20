package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage loginPage;


    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.goToLoginPage();

    }

    @When("I input correct username and correct password")
    public void iInputCorrectUsernameAndCorrectPassword() {
        loginPage.inputUsername();
        loginPage.inputPassword();

    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will go to product page")
    public void iWillGoToProductPage() {
        loginPage.verifyProductHeader();
    }

    //Scenario 2

    @When("I input invalid username and password")
    public void iInputInvalidUsernameAndPassword() {
        loginPage.inputInvalidUsername();
        loginPage.inputInvalidPassword();

    }

    @Then("I still on login page")
    public void iStillOnLoginPage() {
        loginPage.verifyLoginPage();
    }

    //Scenario 3
    @When("I input empty username and filled valid password")
    public void iInputEmptyUsernameAndFilledValidPassword() {
        loginPage.emptyUsername();
        loginPage.inputPassword();
    }


    @Then("I still on login page and show error message")
    public void iStillOnLoginPageAndShowErrorMessage() {
        loginPage.verifyLoginPage();
    }

    //Scenario 4

    @When("I input empty username and password")
    public void iInputEmptyUsernameAndPassword() {
        loginPage.emptyUsername();
        loginPage.emptyPassword();
    }

    //Scenario 5
    @When("I input username and empty password")
    public void iInputUsernameAndEmptyPassword() {
        loginPage.inputUsername();
        loginPage.emptyPassword();
    }
}
