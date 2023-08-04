package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.GetAllProductAPI;

public class GetAllProductStep {
    GetAllProductAPI getAllProductAPI = new GetAllProductAPI();


    @Given("saya mempunyai url get all product")
    public void sayaMempunyaiUrlGetAllProduct() {
        getAllProductAPI.setUrlAndValidToken();
    }
    @When("saya request url dan header valid")
    public void sayaRequestUrlDanHeaderValid() {
        getAllProductAPI.requestAllProduct();
    }


    @Then("berhasil mendapatkan all product dengan status {int} OK")
    public void berhasilMendapatkanAllProductDenganStatusOK(int arg0) {
        getAllProductAPI.verifyStatusCode();
    }

    @When("request tanpa authorization token")
    public void requestTanpaAuthorizationToken() {
        getAllProductAPI.requestEmptyAuthorized();

    }

    @Then("gagal mendapatkan all product status {int}")
    public void gagalMendapatkanAllProductStatus(int arg0) {
        getAllProductAPI.verifyStatusEmptyAuthorized();
    }
}
