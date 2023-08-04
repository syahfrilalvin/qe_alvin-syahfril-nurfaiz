package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class RegisterPage {
    private By fieldNamaLengkap = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    private By fieldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    private By buttonRegister = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By textRegisterPosition = By.xpath("//android.view.View[@content-desc=\"Register\"]");
    private By messageNamaLengkapEmpty = By.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
    private By messageEmailEmpty = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By messagePasswordEmpty = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");

    public void registerPagePosition() throws InterruptedException {
        Thread.sleep(100);
        WebElement addElement = driver.findElement(textRegisterPosition);
        addElement.isDisplayed();
    }
    public void emptyNamaLengkap() throws InterruptedException {
        Thread.sleep(200);
        WebElement addElement = driver.findElement(fieldNamaLengkap);
        addElement.sendKeys("");
    }
    public void emptyEmail() throws InterruptedException {
        Thread.sleep(300);
        WebElement addElement = driver.findElement(fieldEmail);
        addElement.sendKeys("");
    }
    public void emptyPass() throws InterruptedException {
        Thread.sleep(400);
        WebElement addElement = driver.findElement(fieldPassword);
        addElement.sendKeys("");
    }

    public void noemptyNamaLengkap() throws InterruptedException {
        Thread.sleep(200);
        WebElement addElement = driver.findElement(fieldNamaLengkap);
        addElement.sendKeys("test");
    }
    public void noemptyEmail() throws InterruptedException {
        Thread.sleep(300);
        WebElement addElement = driver.findElement(fieldEmail);
        addElement.sendKeys("test");
    }
    public void noemptyPass() throws InterruptedException {
        Thread.sleep(400);
        WebElement addElement = driver.findElement(fieldPassword);
        addElement.sendKeys("test123");
    }

    public void klikButtonRegister() throws InterruptedException {
        Thread.sleep(800);
        WebElement addElement = driver.findElement(buttonRegister);
        addElement.click();
    }
    public void showMessageNamaLengkapEmpty() throws InterruptedException {
        Thread.sleep(900);
        WebElement addElement = driver.findElement(messageNamaLengkapEmpty);
        addElement.isDisplayed();
    }
    public void showMessageEmailEmpty() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addElement = driver.findElement(messageEmailEmpty);
        addElement.isDisplayed();
    }
    public void showMessagePasswordEmpty() throws InterruptedException {
        Thread.sleep(1100);
        WebElement addElement = driver.findElement(messagePasswordEmpty);
        addElement.isDisplayed();
    }
    public void verifyPagePosition() throws InterruptedException {
        Thread.sleep(100);
        WebElement addElement = driver.findElement(textRegisterPosition);
        addElement.isDisplayed();
    }
}
