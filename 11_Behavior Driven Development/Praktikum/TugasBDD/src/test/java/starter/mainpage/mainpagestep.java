package starter.mainpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainpagestep {
    @Given("I in main page linkedin")
    public void iInMainPageLinkedin() {
    }

    @When("I clicked button jaringan saya")
    public void iClickedButtonJaringanSaya() {

    }

    @Then("I will go to my network page")
    public void iWillGoToMyNetworkPage() {
        System.out.println("This is my network page");
    }

    @When("I clicked button pekerjaan")
    public void iClickedButtonPekerjaan() {

    }

    @Then("I will go to jobs page")
    public void iWillGoToJobsPage() {

    }

    @When("I clicked button pesan")
    public void iClickedButtonPesan() {

    }

    @Then("I will go to messaging page")
    public void iWillGoToMessagingPage() {
        System.out.println("This is messaging page");

    }

    @When("I clicked button notifikasi")
    public void iClickedButtonNotifikasi() {

    }

    @Then("I will go to notifications page")
    public void iWillGoToNotificationsPage() {
        System.out.println("This is notifications page");

    }

    @When("I clicked button halaman utama")
    public void iClickedButtonHalamanUtama() {

    }

    @Then("I will go to feed page")
    public void iWillGoToFeedPage() {
        System.out.println("This is feed page");

    }

    @When("I clicked button ikuti")
    public void iClickedButtonIkuti() {

    }

    @Then("Text on button wil change to {string}")
    public void textOnButtonWilChangeTo(String arg0) {
        System.out.println("Text on button change is mengikuti");

    }

    @And("Icons will change to a checklist")
    public void iconsWillChangeToAChecklist() {
        System.out.println("Icons change is a checklist");
    }

    @When("I clicked search feature")
    public void iClickedSearchFeature() {
        
    }

    @And("I type keywoard")
    public void iTypeKeywoard() {
        
    }

    @And("I press enter")
    public void iPressEnter() {
        
    }

    @Then("Display the results that the user is looking for in the company")
    public void displayTheResultsThatTheUserIsLookingForInTheCompany() {
        System.out.println("This is bank mandiri");
        
    }

    @And("I type keywoard {string}")
    public void iTypeKeywoard(String arg0) {
        
    }

    @Then("Show message no results found")
    public void showMessageNoResultsFound() {
        System.out.println("No results found");
    }
}
