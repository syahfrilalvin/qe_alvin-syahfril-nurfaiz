package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    private By buttonDropdownKategori = By.className("v-select__selections");
    private By pilihKategori = By.id("list-item-109-1");
    private By displayBarang = By.className("v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top");

    private By buttonDetail = By.xpath("//button[@div[@id='85376']");
    private By buttonBeli = By.xpath("//button[@div[@id='85376']");

    private By buttonKeranjang = By.className("v-icon notranslate fas fa-shopping-cart theme--dark");

    private By showDetailBarang = By.className("v-rating v-rating--dense");

    private By showJumlahBarang = By.className("v-badge__wrapper");


    public void klikButtonDropdown(){
        $(buttonDropdownKategori).click();
    }
    public void klikKategori(){
        $(pilihKategori).click();
    }
    public void displayBarang(){
        $(displayBarang).isDisplayed();
    }
    public void detailBarang(){
        $(buttonDetail).click();
    }

    public void showDetail(){
        $(showDetailBarang).isDisplayed();
    }

    public void beliBarang(){
        $(buttonBeli).click();
    }
    public void showJumlah(){
        $(showJumlahBarang).isDisplayed();
    }
    public void klikKeranjang(){
        $(buttonKeranjang).click();
    }
    public void redirectOrderPage(){
        openAt("https://alta-shop.vercel.app/order");
    }

}
