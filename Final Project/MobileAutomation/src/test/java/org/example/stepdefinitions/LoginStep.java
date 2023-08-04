package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.LoginPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    @Given("saya berada di halaman login altashop")
    public void sayaBeradaDiHalamanLoginAltashop() throws InterruptedException {
        loginPage.loginPagePosition();
        
    }

    @When("saya mengosongkan field email")
    public void sayaMengosongkanFieldEmail() throws InterruptedException {
        loginPage.emptyEmail();
        
    }

    @And("saya mengosongkan field password")
    public void sayaMengosongkanFieldPassword() throws InterruptedException {
        loginPage.emptyPass();
        
    }

    @And("saya klik button login")
    public void sayaKlikButtonLogin() throws InterruptedException {
        loginPage.klikButtonLogin();
        
    }

    @Then("muncul pesan email required")
    public void munculPesanEmailRequired() throws InterruptedException {
        loginPage.showMessageEmailEmpty();
        
    }

    @And("saya tetap berada dihalaman login")
    public void sayaTetapBeradaDihalamanLogin() throws InterruptedException {
        loginPage.verifyLoginPage();
    }

    @When("saya mengisi email invalid")
    public void sayaMengisiEmailInvalid() throws InterruptedException {
        loginPage.emailInvalid();
        
    }

    @Then("muncul pesan password required")
    public void munculPesanPasswordRequired() throws InterruptedException {
        loginPage.messagePasswordEmpty();
    }

    @When("saya mengisi password invalid")
    public void sayaMengisiPasswordInvalid() throws InterruptedException {
        loginPage.passwordInvalid();
    }

    @When("saya mengisi email valid")
    public void sayaMengisiEmailValid() throws InterruptedException {
        loginPage.emailValid();
    }

    @When("saya mengisi password valid")
    public void sayaMengisiPasswordValid() throws InterruptedException {
        loginPage.passwordValid();
    }

    @Then("muncul pesan record not found")
    public void munculPesanRecordNotFound() throws InterruptedException {
        loginPage.messageNotFound();
    }

    @Then("halaman akan berpindah ke dashboard altashop")
    public void halamanAkanBerpindahKeDashboardAltashop() throws InterruptedException {
        loginPage.verifyProductPage();
    }
}
