package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.LoginAPI;

public class LoginStep {
    LoginAPI loginAPI = new LoginAPI();
    @Given("saya mempunyai url login")
    public void sayaMempunyaiUrlLogin() {
        loginAPI.setUrl();
        
    }
    @When("saya mengisi email dan password valid")
    public void sayaMengisiEmailDanPasswordValid() {
        loginAPI.requestWithValidParams();
    }
    @Then("login sukses dengan keterangan {int} OK")
    public void loginSuksesDenganKeteranganOK(int arg0) {
        loginAPI.verifyStatusCode();
    }


    @When("saya mengosongkan email dan password")
    public void sayaMengosongkanEmailDanPassword() {
        loginAPI.requestEmptyParams();

    }

    @Then("gagal login dengan status {int} Bad Request")
    public void gagalLogoinDenganStatusBadRequest(int arg0) {
        loginAPI.verifyStatusCodeEmpty();
    }

    @When("saya mengosongkan email dan mengisi password")
    public void sayaMengosongkanEmailDanMengisiPassword() {
        loginAPI.requestEmptyEmail();
    }

    @When("saya mengosongkan password dan mengisi email")
    public void sayaMengosongkanPasswordDanMengisiEmail() {
        loginAPI.requestEmptyPassword();
    }

    @When("saya mengosongkan password dan mengisi email valid")
    public void sayaMengosongkanPasswordDanMengisiEmailValid() {
        loginAPI.requestEmptyPasswordEmailValid();
    }

    @When("saya mengosongkan email dan mengisi password valid")
    public void sayaMengosongkanEmailDanMengisiPasswordValid() {
        loginAPI.requestEmptyEmailPasswordValid();
    }

    @When("saya mengisi email valid dan mengisi password invalid")
    public void sayaMengisiEmailValidDanMengisiPasswordInvalid() {
        loginAPI.requestEmailValidPasswordInvalid();
    }

    @When("saya mengisi password valid dan mengisi email invalid")
    public void sayaMengisiPasswordValidDanMengisiEmailInvalid() {
        loginAPI.requestEmailInvalidPasswordValid();
    }

    @When("saya mengosongkan  mengisi email dan password invalid")
    public void sayaMengosongkanMengisiEmailDanPasswordInvalid() {
        loginAPI.requestEmailInvalidPasswordInvalid();
    }
}
