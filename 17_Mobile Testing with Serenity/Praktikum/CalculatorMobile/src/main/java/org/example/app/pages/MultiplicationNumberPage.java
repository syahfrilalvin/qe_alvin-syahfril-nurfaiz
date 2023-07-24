package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class MultiplicationNumberPage {
    private By buttonMultiplication = By.xpath("//android.view.View[@content-desc=\" x \"]");
    private By result = By.xpath("//android.view.View[@content-desc=\"32\"]");
    public void clickButtonMultiplication() throws InterruptedException {
        Thread.sleep(4000);
        WebElement addElement = driver.findElement(buttonMultiplication);
        addElement.click();
    }
    public void verifyResult() throws InterruptedException {
        Thread.sleep(6000);
        WebElement addElement = driver.findElement(result);
        addElement.isDisplayed();

    }
}
