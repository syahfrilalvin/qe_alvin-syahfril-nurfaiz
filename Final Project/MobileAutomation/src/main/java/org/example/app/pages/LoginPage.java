package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class LoginPage {

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fieldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    private By buttonLogin = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By textLoginPosition = By.xpath("//android.view.View[@content-desc=\"Login\"]");

    private By messageEmailEmpty = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By messagePasswordEmpty = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");

    private By messageRecordNotFound = By.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");

    private By showProductPage = By.xpath("//android.widget.Button[@content-desc=\"0\"]");

    public void loginPagePosition() throws InterruptedException {
        Thread.sleep(100);
        WebElement addElement = driver.findElement(textLoginPosition);
        addElement.isDisplayed();
    }

    public void emptyEmail() throws InterruptedException {
        Thread.sleep(200);
        WebElement addElement = driver.findElement(fieldEmail);
        addElement.sendKeys("");
    }
    public void emptyPass() throws InterruptedException {
        Thread.sleep(300);
        WebElement addElement = driver.findElement(fieldPassword);
        addElement.sendKeys("");
    }

    public void emailInvalid() throws InterruptedException {
        Thread.sleep(400);
        WebElement addElement = driver.findElement(fieldEmail);
        addElement.sendKeys("test");
    }

    public void emailValid() throws InterruptedException {
        Thread.sleep(500);
        WebElement addElement = driver.findElement(fieldEmail);
        addElement.sendKeys("n");
    }

    public void passwordInvalid() throws InterruptedException {
        Thread.sleep(600);
        WebElement addElement = driver.findElement(fieldPassword);
        addElement.sendKeys("test");
    }
    public void passwordValid() throws InterruptedException {
        Thread.sleep(700);
        WebElement addElement = driver.findElement(fieldPassword);
        addElement.sendKeys("n");
    }
    public void klikButtonLogin() throws InterruptedException {
        Thread.sleep(800);
        WebElement addElement = driver.findElement(buttonLogin);
        addElement.click();
    }
    public void showMessageEmailEmpty() throws InterruptedException {
        Thread.sleep(900);
        WebElement addElement = driver.findElement(messageEmailEmpty);
        addElement.isDisplayed();
    }
    public void messagePasswordEmpty() throws InterruptedException {
        Thread.sleep(100);
        WebElement addElement = driver.findElement(messagePasswordEmpty);
        addElement.isDisplayed();
    }
    public void messageNotFound() throws InterruptedException {
        Thread.sleep(1100);
        WebElement addElement = driver.findElement(messageRecordNotFound);
        addElement.isDisplayed();
    }
    public void verifyLoginPage() throws InterruptedException {
        Thread.sleep(1200);
        WebElement addElement = driver.findElement(textLoginPosition);
        addElement.isDisplayed();
    }
    public void verifyProductPage() throws InterruptedException {
        Thread.sleep(1300);
        WebElement addElement = driver.findElement(showProductPage);
        addElement.isDisplayed();
    }
}
