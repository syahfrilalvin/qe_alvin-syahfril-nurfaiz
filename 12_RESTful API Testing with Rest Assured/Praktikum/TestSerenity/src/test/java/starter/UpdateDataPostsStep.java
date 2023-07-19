package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.UpdateDataPosts;

public class UpdateDataPostsStep {
    @Steps
    UpdateDataPosts updateDataPosts;
    @Given("I have url update data posts")
    public void iHaveUrlUpdateDataPosts() {
        updateDataPosts.setUrl();


    }

    @When("I request parameter update data posts with valid request url")
    public void iRequestParameterUpdateDataPostsWithValidRequestUrl() {
        updateDataPosts.requestWithValidParams();
    }

    @Then("I get status code {int} OK")
    public void iGetStatusCodeOK(int arg0) {
        updateDataPosts.verifyStatusCode();
    }


    @And("I can update data posts")
    public void iCanUpdateDataPosts() {
        updateDataPosts.verifyDetailResponse();

    }

}
