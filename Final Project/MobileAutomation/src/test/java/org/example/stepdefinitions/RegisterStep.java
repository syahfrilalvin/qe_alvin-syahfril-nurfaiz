package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.RegisterPage;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();
    @Given("saya berada di halaman register altashop")
    public void sayaBeradaDiHalamanRegisterAltashop() throws InterruptedException {
        registerPage.registerPagePosition();
    }

    @When("saya mengosongkan inputan nama lengkap")
    public void sayaMengosongkanInputanNamaLengkap() throws InterruptedException {
        registerPage.emptyNamaLengkap();
        
    }

    @And("saya mengosongkan inputan email")
    public void sayaMengosongkanInputanEmail() throws InterruptedException {
        registerPage.emptyEmail();
        
    }

    @And("saya mengosongkan inputan password")
    public void sayaMengosongkanInputanPassword() throws InterruptedException {
        registerPage.emptyPass();
        
    }

    @And("saya klik button register")
    public void sayaKlikButtonRegister() throws InterruptedException {
        registerPage.klikButtonRegister();
        
    }

    @Then("muncul alert pesan email required")
    public void munculAlertPesanEmailRequired() throws InterruptedException {
        registerPage.showMessageEmailEmpty();
        
    }

    @And("saya tetap berada dihalaman register")
    public void sayaTetapBeradaDihalamanRegister() throws InterruptedException {
        registerPage.verifyPagePosition();
    }

    @And("saya mengisi inputan email")
    public void sayaMengisiInputanEmail() throws InterruptedException {
        registerPage.noemptyEmail();
        
    }

    @And("saya mengisi inputan password")
    public void sayaMengisiInputanPassword() throws InterruptedException {
        registerPage.noemptyPass();
        
    }

    @Then("muncul alert pesan nama lengkap required")
    public void munculAlertPesanNamaLengkapRequired() throws InterruptedException {
        registerPage.showMessageNamaLengkapEmpty();
        
    }

    @And("saya mengisi inputan nama lengkap")
    public void sayaMengisiInputanNamaLengkap() throws InterruptedException {
        registerPage.noemptyNamaLengkap();
        
    }

    @Then("muncul alert pesan password required")
    public void munculAlertPesanPasswordRequired() throws InterruptedException {
        registerPage.showMessagePasswordEmpty();
    }
}
