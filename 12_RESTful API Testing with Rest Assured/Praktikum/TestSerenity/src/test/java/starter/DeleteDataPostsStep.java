package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.DeleteDataPosts;

public class DeleteDataPostsStep {
    @Steps
    DeleteDataPosts deleteDataPosts;


    @Given("I have url delete data posts")
    public void iHaveUrlDeleteDataPosts() {
        deleteDataPosts.setUrl();
        
    }

    @When("I request paramater id data post with valid request url")
    public void iRequestParamaterIdDataPostWithValidRequestUrl() {
        deleteDataPosts.requestDeleteDataPosts();


    }

    @Then("I get status {int} Ok")
    public void iGetStatusOk(int arg0) {
        deleteDataPosts.verifyStatusCode();
        
    }

    @And("I can delete data posts")
    public void iCanDeleteDataPosts() {
        deleteDataPosts.verifyCorrectProject();
    }
}
