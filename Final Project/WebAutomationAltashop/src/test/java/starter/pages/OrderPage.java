package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage  extends PageObject {

    private By barangOrder = By.id("order-85376");

    private By nmBarang = By.className("v-list-item__title label-name");

    private By hargaBarang = By.className("label-price");

    private By jumlahBarang = By.id("label-total-quantity");
    private By showEmpty = By.className("v-alert__content");

    private By buttonTambah = By.id("v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default");

    private By buttonKurang = By.id("v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default");

    @Step
    public void halamanOrderPosisi(){
        openAt("https://alta-shop.vercel.app/order");
    }


    @Step
    public void selectBarangOrder(){
        $(barangOrder).isDisplayed();

    }
    @Step
    public void showNamaBarang(){
        $(nmBarang).isDisplayed();

    }
    @Step
    public void showHargaBarang(){
        $(hargaBarang).isDisplayed();

    }
    @Step
    public void showJumlahBarang(){
        $(jumlahBarang).isDisplayed();

    }
    @Step
    public void showEmptyOrder(){
        $(showEmpty).isDisplayed();

    }
    @Step
    public void klikButtonTambah(){
        $(buttonTambah).click();
    }
    @Step
    public void klikButonKurang(){
        $(buttonKurang).click();
    }
}
