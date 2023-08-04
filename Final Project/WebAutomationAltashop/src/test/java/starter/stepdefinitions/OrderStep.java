package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.OrderPage;

public class OrderStep {
    OrderPage orderPage = new OrderPage();
    @Given("saya berada di halaman order")
    public void sayaBeradaDiHalamanOrder() {
        orderPage.halamanOrderPosisi();
    }

    @When("saya sudah memesan barang")
    public void sayaSudahMemesanBarang() {
        orderPage.selectBarangOrder();
    }

    @Then("nama barang yang saya pesan akan tampil di halaman order")
    public void namaBarangYangSayaPesanAkanTampilDiHalamanOrder() {
        orderPage.showNamaBarang();

    }

    @And("harga barang akan tampil di halaman order")
    public void hargaBarangAkanTampilDiHalamanOrder() {
        orderPage.showHargaBarang();

    }

    @And("total barang akan tampil dihalaman order")
    public void totalBarangAkanTampilDihalamanOrder() {
        orderPage.showJumlahBarang();
    }

    @When("saya tidak melakukan pemesanan")
    public void sayaTidakMelakukanPemesanan() {
        orderPage.halamanOrderPosisi();
        
    }

    @Then("halaman order menampilkan empty")
    public void halamanOrderMenampilkanEmpty() {
        orderPage.showEmptyOrder();
    }

    @When("saya klik icon tambah")
    public void sayaKlikIconTambah() {
        orderPage.klikButtonTambah();
        
    }

    @Then("jumlah barang akan bertambah")
    public void jumlahBarangAkanBertambah() {
        orderPage.showJumlahBarang();
        
    }

    @When("saya klik icon kurang")
    public void sayaKlikIconKurang() {
        orderPage.klikButonKurang();


    }

    @Then("jumlah barang akan berkurang")
    public void jumlahBarangAkanBerkurang() {
        orderPage.showJumlahBarang();
    }
}
