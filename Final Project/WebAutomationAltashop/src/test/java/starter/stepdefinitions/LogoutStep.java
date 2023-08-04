package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.LogoutPage;

public class LogoutStep {
    LogoutPage logoutPage = new LogoutPage();
    @Given("saya berada di halaman dashboard home altashop")
    public void sayaBeradaDiHalamanDashboardHomeAltashop() {
        logoutPage.halamanHome();

    }

    @When("saya klik icon user")
    public void sayaKlikIconUser() {
        logoutPage.klikIconUser();
        
    }

    @And("muncul pop up berisi logout")
    public void munculPopUpBerisiLogout() {
        logoutPage.showPopUp();
        
    }

    @And("saya klik logout")
    public void sayaKlikLogout() {
        logoutPage.klikIconLogout();
    }

    @Then("halaman akan berpindah ke halaman order altashop")
    public void halamanAkanBerpindahKeHalamanOrderAltashop() {
        logoutPage.halamanOrder();
    }
}
