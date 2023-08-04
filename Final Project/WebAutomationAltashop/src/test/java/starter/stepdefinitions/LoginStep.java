package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.LoginPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    @Given("saya berada di halaman login altashop")
    public void sayaBeradaDiHalamanLoginAltashop() {
        loginPage.halamanLoginPosisi();
        
    }

    @When("saya klik button login")
    public void sayaKlikButtonLogin() {
        loginPage.klikButtonLogin();
        
    }

    @Then("muncul pesan email required")
    public void munculPesanEmailRequired() {
        loginPage.errorMessage();
        
    }

    @And("saya tetap berada dihalaman login")
    public void sayaTetapBeradaDihalamanLogin() {
        loginPage.halamanLoginPosisi();


    }

    @When("saya mengisi email invalid")
    public void sayaMengisiEmailInvalid() {
        loginPage.emailInvalid();
        
    }

    @Then("muncul pesan password required")
    public void munculPesanPasswordRequired() {
        loginPage.errorMessage();
        
    }

    @When("saya mengisi password invalid")
    public void sayaMengisiPasswordInvalid() {
        loginPage.passwordInvalid();
        
    }

    @When("saya mengisi email valid")
    public void sayaMengisiEmailValid() {
        loginPage.emailValid();
        
    }

    @When("saya mengisi password valid")
    public void sayaMengisiPasswordValid() {
        loginPage.passwordValid();
        
    }

    @Then("muncul pesan record not found")
    public void munculPesanRecordNotFound() {
        loginPage.errorMessage();
        
    }

    @Then("halaman akan berpindah ke dashboard altashop")
    public void halamanAkanBerpindahKeDashboardAltashop() {
        loginPage.displayDashboard();
    }

    @When("saya mengosongkan field email")
    public void sayaMengosongkanFieldEmail() {
        loginPage.kosongEmail();
    }

    @And("saya mengosongkan field password")
    public void sayaMengosongkanFieldPassword() {
        loginPage.kosongPassword();
    }

    @When("saya klik button order")
    public void sayaKlikButtonOrder() {
        loginPage.klikOrderButton();
        
    }

    @Then("halaman akan berpindah ke order altashop")
    public void halamanAkanBerpindahKeOrderAltashop() {
        loginPage.verifOrder();
        
    }

    @When("saya klik link register")
    public void sayaKlikLinkRegister() {
        loginPage.klikLinkRegister();
        
    }

    @Then("halaman akan berpindah ke halaman register")
    public void halamanAkanBerpindahKeHalamanRegister() {
        loginPage.verifRegister();
        
    }

    @When("saya klik logo altashop")
    public void sayaKlikLogoAltashop() {
        loginPage.klikLogoButton();
    }
}
