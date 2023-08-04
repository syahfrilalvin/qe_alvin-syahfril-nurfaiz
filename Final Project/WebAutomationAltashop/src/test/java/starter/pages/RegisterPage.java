package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.sql.SQLOutput;

public class RegisterPage extends PageObject {
    private By fieldNamaLengkap = By.id("input-18");
    private By fieldEmail = By.id("input-21");
    private By fieldPassword = By.id("input-24");
    private By loginRegister = By.className("v-btn--is-elevated");

    private By errorMessage = By.className("v-alert__content");
    private By textRegister = By.xpath("//a[@href = '/auth/login']");
    private By verifLogin = By.xpath("//a[@href = '/auth/register']");




    @Step
    public void halamanRegisterPosisi(){
        openAt("https://alta-shop.vercel.app/auth/register");
    }
    @Step
    public void kosongNamaLengkap(){
        $(fieldNamaLengkap).type("");
    }
    @Step
    public void kosongEmail(){
        $(fieldEmail).type("");
    }
    @Step
    public void kosongPassword(){
        $(fieldPassword).type("");
    }
    @Step
    public void isiNamaLengkap(){
        $(fieldNamaLengkap).type("h");
    }
    @Step
    public void isiEmail(){
        $(fieldEmail).type("me@gmail.com");

    }
    @Step
    public void isiPassword(){
        $(fieldPassword).type("h");
    }
    @Step
    public void klikButtonRegister(){

        $(loginRegister).click();
    }

    @Step

    public void errorMessage(){
        $(errorMessage).isDisplayed();
    }
    @Step

    public void stayRegisterPage(){
        $(textRegister).isDisplayed();
    }

    @Step
    public void invalidFormatEmail(){
        $(fieldEmail).type("a");

    }
    @Step
    public void stayLoginPage(){
        $(verifLogin).isDisplayed();

    }
    @Step
    public void klikButtonLogin(){
        $(textRegister).isDisplayed();

    }
    @Step
    public void isiNamaLengkapBaru(){
        $(fieldNamaLengkap).type("n");
    }
    @Step
    public void isiEmailBaru(){
        $(fieldEmail).type("n");
    }
    @Step
    public void isiPasswordBaru(){
        $(fieldPassword).type("n");
    }
}
