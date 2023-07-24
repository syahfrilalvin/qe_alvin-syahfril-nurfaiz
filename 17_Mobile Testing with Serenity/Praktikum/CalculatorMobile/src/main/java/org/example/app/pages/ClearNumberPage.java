package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class ClearNumberPage {
    private By fieldNumber1 = By.xpath("//android.view.View[@content-desc=\"8\"]");
    private By buttonAC = By.xpath("//android.view.View[@content-desc=\"AC\"]");
    private By result = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public void clickButtonNumbers() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addElement = driver.findElement(fieldNumber1);
        addElement.click();


    }
    public void clickButtonAC() throws InterruptedException {
        Thread.sleep(4000);
        WebElement addElement = driver.findElement(buttonAC);
        addElement.click();


    }
    public void verifyResult() throws InterruptedException {
        Thread.sleep(5000);
        WebElement addElement = driver.findElement(result);
        addElement.isDisplayed();


    }
}
