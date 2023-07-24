package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class DistributionNumberPage {
    private By buttonDistribution = By.xpath("//android.view.View[@content-desc=\" ÷ \"]");
    private By result = By.xpath("//android.view.View[@content-desc=\"2\"]");
    public void clickButtonMDistribution() throws InterruptedException {
        Thread.sleep(4000);
        WebElement addElement = driver.findElement(buttonDistribution);
        addElement.click();
    }
    public void verifyResult() throws InterruptedException {
        Thread.sleep(6000);
        WebElement addElement = driver.findElement(result);
        addElement.isDisplayed();

    }
}
