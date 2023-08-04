package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By iconUser = By.className("v-btn v-btn--icon v-btn--round theme--dark v-size--default1");
    private By showPopUp = By.className("v-list v-sheet theme--light");
    private By iconLogout =  By.id("list-item-301");

    public void halamanHome(){
        openAt("https://alta-shop.vercel.app/");
    }
    public void klikIconUser(){
        $(iconUser).click();
    }
    public void showPopUp(){
        $(showPopUp).isDisplayed();

    }
    public void klikIconLogout(){
        $(iconLogout).click();
    }
    public void halamanOrder(){
        openAt("https://alta-shop.vercel.app/order");
    }



}
