package starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.CreateCategoryAPI;

public class CreateCategoryStep {
    CreateCategoryAPI createCategoryAPI = new CreateCategoryAPI();
    @Given("saya mempunyai url create category")
    public void sayaMempunyaiUrlCreateCategory() {
        createCategoryAPI.setUrl();


    }

    @When("saya request url dan header serta parameter")
    public void sayaRequestUrlDanHeaderSertaParameter() {
        createCategoryAPI.requestWithValidParams();

    }

    @Then("berhasil menambahkan kategori dengan status {int} OK")
    public void berhasilMenambahkanKategoriDenganStatusOK(int arg0) {
        createCategoryAPI.verifyStatusCode();
    }

    @When("saya request url dan header serta emtpy parameter")
    public void sayaRequestUrlDanHeaderSertaEmtpyParameter() {
        createCategoryAPI.requestWithEmptyParams();
        
    }

    @Then("gagal menambahkan category dengan status code {int}")
    public void gagalMenambahkanCategoryDenganStatusCode(int arg0) {
        createCategoryAPI.verifyStatusCodeEmpty();

    }

    @When("saya request url dan header serta mengosongkan parameter name dan mengisi description")
    public void sayaRequestUrlDanHeaderSertaMengosongkanParameterNameDanMengisiDescription() {
        createCategoryAPI.requestWithEmptyName();

    }

    @When("saya request url dan header serta mengosongkan parameter description dan mengisi name")
    public void sayaRequestUrlDanHeaderSertaMengosongkanParameterDescriptionDanMengisiName() {
        createCategoryAPI.requestWithEmptyDesc();
    }

    @When("saya request url dan header serta parameter tanpa token")
    public void sayaRequestUrlDanHeaderSertaParameterTanpaToken() {
        createCategoryAPI.requestWithEmptyToken();

    }

    @Then("berhasil menambahkan kategori dengan status {int} Unauthorized")
    public void berhasilMenambahkanKategoriDenganStatusUnauthorized(int arg0) {
        createCategoryAPI.verifyStatusCodeEmptyToken();
    }
}
