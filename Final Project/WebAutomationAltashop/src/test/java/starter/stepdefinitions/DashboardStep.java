package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.DashboardPage;

public class DashboardStep {
    DashboardPage dashboardPage = new DashboardPage();
    @And("saya klik select dropdown list kategori")
    public void sayaKlikSelectDropdownListKategori() {
        dashboardPage.klikButtonDropdown();
        
    }

    @And("saya klik salah satu kategori")
    public void sayaKlikSalahSatuKategori() {
        dashboardPage.klikKategori();
        
    }

    @Then("barang by kategori akan tampil")
    public void barangByKategoriAkanTampil() {
        dashboardPage.displayBarang();
    }

    @And("saya klik select button detail")
    public void sayaKlikSelectButtonDetail() {
        dashboardPage.detailBarang();
        
    }

    @Then("barang detail akan tampil")
    public void barangDetailAkanTampil() {
        dashboardPage.showDetail();

    }

    @When("saya klik button beli salah satu barang")
    public void sayaKlikButtonBeliSalahSatuBarang() {
        dashboardPage.beliBarang();
        
    }

    @Then("saya berhasil menambahkan satu barang ke keranjang")
    public void sayaBerhasilMenambahkanSatuBarangKeKeranjang() {
        dashboardPage.showJumlah();
        
    }

    @And("saya klik lagi button salah satu barang")
    public void sayaKlikLagiButtonSalahSatuBarang() {
        dashboardPage.beliBarang();
        
    }

    @Then("saya berhasil menambahkan lebih dari satu barang")
    public void sayaBerhasilMenambahkanLebihDariSatuBarang() {
        dashboardPage.showJumlah();
        
    }

    @When("saya klik button order \\(keranjang)")
    public void sayaKlikButtonOrderKeranjang() {
        dashboardPage.klikKeranjang();
        
    }

    @Then("saya berhasil ke halaman order")
    public void sayaBerhasilKeHalamanOrder() {
        dashboardPage.redirectOrderPage();
    }
}
