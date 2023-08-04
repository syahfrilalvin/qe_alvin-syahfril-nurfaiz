package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.DeleteProductAPI;

public class DeleteProductStep {
    DeleteProductAPI deleteProductAPI = new DeleteProductAPI();
    @Given("saya mempunyai url delete product")
    public void sayaMempunyaiUrlDeleteProduct() {
        deleteProductAPI.setUrlAndValidToken();
    }

    @When("saya request url dan header serta id valid")
    public void sayaRequestUrlDanHeaderSertaIdValid() {
        deleteProductAPI.requestAllProduct();

    }

    @Then("berhasil menghapus product by id  dengan status {int} OK")
    public void berhasilMenghapusProductByIdDenganStatusOK(int arg0) {
        deleteProductAPI.verifyStatusCode();
    }

    @When("request API delete product tanpa authorization token")
    public void requestAPIDeleteProductTanpaAuthorizationToken() {
        deleteProductAPI.requestEmptyAuthorized();

    }

    @Then("gagal delete product status {int}")
    public void gagalDeleteProductStatus(int arg0) {
        deleteProductAPI.verifyStatusEmptyAuthorized();
    }



    @When("saya request url dan header serta id invalid")
    public void sayaRequestUrlDanHeaderSertaIdInvalid() {
        deleteProductAPI.setUrlIdInvalid();
    }

    @Then("data tidak ditemukan dengan status {int}")
    public void dataTidakDitemukanDenganStatus(int arg0) {
        deleteProductAPI.verifyStatusIdInvalid();
    }
}
