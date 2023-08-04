package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.app.pages.OrderPage;

public class OrderStep {
    OrderPage orderPage = new OrderPage();
    @Given("saya berada di halaman order")
    public void sayaBeradaDiHalamanOrder() throws InterruptedException {
        orderPage.orderPagePosition();

    }

    @When("saya tidak melakukan pemesanan")
    public void sayaTidakMelakukanPemesanan() throws InterruptedException {
        orderPage.orderPagePosition();

    }

    @Then("halaman order menampilkan empty")
    public void halamanOrderMenampilkanEmpty() throws InterruptedException {
        orderPage.showEmptyOrder();
    }

    @When("saya klik beli barang")
    public void sayaKlikBeliBarang() throws InterruptedException {
        orderPage.klikBeliBarang();
        
    }

    @Then("jumlah barang dikeranjang bertambah")
    public void jumlahBarangDikeranjangBertambah() throws InterruptedException {
        orderPage.showSumBarang1();
    }

    @And("saya klik barang lain")
    public void sayaKlikBarangLain() throws InterruptedException {
        orderPage.klikBeliBarang1();

    }

    @Then("jumlah barang dikeranjang bertambah lebih dari satu")
    public void jumlahBarangDikeranjangBertambahLebihDariSatu() throws InterruptedException {
        orderPage.showSumBarang2();
    }
}
