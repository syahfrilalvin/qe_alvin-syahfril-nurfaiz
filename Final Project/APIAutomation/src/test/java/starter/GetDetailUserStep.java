package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.GetDetailUserAPI;

public class GetDetailUserStep {
    GetDetailUserAPI getDetailUserAPI = new GetDetailUserAPI();
    @Given("saya mempunyai url get user detail")
    public void sayaMempunyaiUrlGetUserDetail() {
        getDetailUserAPI.setUrlAndValidToken();
        
    }

    @When("saya request dengan valid request")
    public void sayaRequestDenganValidRequest() {
        getDetailUserAPI.requestGetUserInfo();
        
    }

    @Then("berhasil mendapatkan user detail dengan status {int} OK")
    public void berhasilMendapatkanUserDetailDenganStatusOK(int arg0) {
        getDetailUserAPI.verifyStatusCode();
    }

    @When("saya request tanpa authorization token")
    public void sayaRequestTanpaAuthorizationToken() {
        getDetailUserAPI.requestEmptyAuthorized();

    }

    @Then("gagal mendapatkan user detail status {int} Unauthorized")
    public void gagalMendapatkanUserDetailStatusUnauthorized(int arg0) {
        getDetailUserAPI.verifyStatusEmptyAuthorized();
    }
}
