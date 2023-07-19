package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.CreateDataPosts;

public class CreateDataPostsStep {
    @Steps
    CreateDataPosts createDataPosts;

    @Given("I have url create data posts")
    public void iHaveUrlCreateDataPosts() {
        createDataPosts.setUrl();

        
    }

    @When("I request parameter data post with valid request url")
    public void iRequestParameterDataPostWithValidRequestUrl() {
        createDataPosts.requestWithValidParams();
        
    }

    @Then("I get status {int} Created")
    public void iGetStatusCreated(int arg0) {
        createDataPosts.verifyStatusCode();
        
    }

    @And("I can create data posts")
    public void iCanCreateDataPosts() {
        createDataPosts.verifyDetailResponse();
    }
}
