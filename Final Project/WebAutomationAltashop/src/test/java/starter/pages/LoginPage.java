package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By fieldEmail = By.id("input-18");
    private By fieldPassword = By.id("input-21");
    private By loginButton = By.className("v-btn--is-elevated");
    private By errorMessage = By.className("v-alert__content");
    private By elementHeader = By.className("v-input__slot");

    private By orderButton = By.className("v-badge--bottom");

    private By logoButton = By.className("v-toolbar__title");

    private By linkRegister = By.xpath("//a[@href = '/auth/register']");


    private By verifRegister = By.className("v-card__title");

    private By verifOrder = By.className("v-alert__wrapper");



    public void halamanLoginPosisi(){
        openAt("https://alta-shop.vercel.app/auth/login");
    }

    public void kosongEmail(){

        $(fieldEmail).type("");
    }

    public void kosongPassword(){
        $(fieldPassword).type("");
    }

    public void emailInvalid(){
        $(fieldEmail).type("b");
    }

    public void passwordInvalid(){
        $(fieldPassword).type("b");
    }
    public void emailValid(){
        $(fieldEmail).type("a");
    }

    public void passwordValid(){
        $(fieldPassword).type("a");
    }
    public void klikButtonLogin(){
        $(loginButton).click();
    }

    public void errorMessage(){
        $(errorMessage).isDisplayed();

    }

    public void displayDashboard(){
        $(elementHeader).isDisplayed();

    }

    public void klikOrderButton(){
        $(orderButton).click();
    }
    public void klikLogoButton(){
        $(logoButton).click();
    }
    public void klikLinkRegister(){
        $(linkRegister).click();
    }
    public void verifOrder(){
        $(verifOrder).isDisplayed();

    }
    public void verifRegister(){
        $(verifRegister).isDisplayed();

    }
}
