package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.GetAllDataPosts;

public class GetAllDataPostStep {
    @Steps
    GetAllDataPosts getAllDataPosts;


    @Given("I have url get all data post")
    public void iHaveUrlGetAllDataPost() {
        getAllDataPosts.setUrl();

    }

    @When("I request get all data post with valid request url")
    public void iRequestGetAllDataPostWithValidRequestUrl() {
        getAllDataPosts.requestGetAllDataPosts();

    }

    @Then("I get status is {int} OK")
    public void iGetStatusIsOK(int arg0) {
        getAllDataPosts.verifyStatusCode();

    }

    @And("I get list data all post")
    public void iGetListDataAllPost() {
        getAllDataPosts.verifyCorrectProject();
    }
}
