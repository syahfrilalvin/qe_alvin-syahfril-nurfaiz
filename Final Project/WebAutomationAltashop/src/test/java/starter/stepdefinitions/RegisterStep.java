package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {
    @Steps
    RegisterPage registerPage = new RegisterPage();
    @Given("saya berada di halaman register altashop")
    public void sayaBeradaDiHalamanRegisterAltashop() {
        registerPage.halamanRegisterPosisi();
    }

    @When("saya mengosongkan inputan nama lengkap")
    public void sayaMengosongkanInputanNamaLengkap() {
        registerPage.kosongNamaLengkap();
        
    }

    @And("saya mengosongkan inputan email")
    public void sayaMengosongkanInputanEmail() {
        registerPage.kosongEmail();
        
    }

    @And("saya mengosongkan inputan password")
    public void sayaMengosongkanInputanPassword() {
        registerPage.kosongPassword();
        
    }

    @And("saya klik button register")
    public void sayaKlikButtonRegister() {
        registerPage.klikButtonRegister();
        
    }

    @Then("muncul alert pesan email required")
    public void munculAlertPesanEmailRequired() {
        registerPage.errorMessage();
        
    }

    @And("saya tetap berada dihalaman register")
    public void sayaTetapBeradaDihalamanRegister() {
        registerPage.stayRegisterPage();
        
    }

    @And("saya mengisi inputan email")
    public void sayaMengisiInputanEmail() {
        registerPage.isiEmail();
        
    }

    @And("saya mengisi inputan password")
    public void sayaMengisiInputanPassword() {
        registerPage.isiPassword();
    }

    @Then("muncul alert pesan nama lengkap required")
    public void munculAlertPesanNamaLengkapRequired() {
        registerPage.errorMessage();
        
    }

    @And("saya mengisi inputan nama lengkap")
    public void sayaMengisiInputanNamaLengkap() {
        registerPage.isiNamaLengkap();
    }

    @Then("muncul alert pesan password required")
    public void munculAlertPesanPasswordRequired() {
        registerPage.errorMessage();
    }

    @And("saya mengisi inputan email invalid format")
    public void sayaMengisiInputanEmailInvalidFormat() {
        registerPage.invalidFormatEmail();
    }

    @Then("halaman akan berpindah ke login altashop")
    public void halamanAkanBerpindahKeLoginAltashop() {
        registerPage.stayLoginPage();
    }

    @When("saya klik link login")
    public void sayaKlikLinkLogin() {
        registerPage.klikButtonLogin();
    }

    @When("saya mengisi inputan nama lengkap baru")
    public void sayaMengisiInputanNamaLengkapBaru() {
        registerPage.isiNamaLengkapBaru();
    }

    @And("saya mengisi inputan password baru")
    public void sayaMengisiInputanPasswordBaru() {
        registerPage.isiPasswordBaru();
    }

    @And("saya mengisi inputan email baru")
    public void sayaMengisiInputanEmailBaru() {
        registerPage.isiEmailBaru();
    }
}
