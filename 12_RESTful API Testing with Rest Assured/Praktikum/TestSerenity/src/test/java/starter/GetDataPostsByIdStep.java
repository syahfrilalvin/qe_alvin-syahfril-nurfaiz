package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import project.GetDataPostsById;

public class GetDataPostsByIdStep {
    @Steps
    GetDataPostsById getDataPostsById;

    @Given("I have url get data post by id")
    public void iHaveUrlGetDataPostById() {
        getDataPostsById.setUrl();
    }

    @When("I request get data post by id with valid request url")
    public void iRequestGetDataPostByIdWithValidRequestUrl() {
        getDataPostsById.requestGetDataPostsById();
        
    }

    @Then("I get status {int} OK")
    public void iGetStatusOK(int arg0) {
        getDataPostsById.verifyStatusCode();
        
    }

    @And("I get list data posts by id")
    public void iGetListDataPostsById() {
        getDataPostsById.verifyCorrectProject();
    }
}
