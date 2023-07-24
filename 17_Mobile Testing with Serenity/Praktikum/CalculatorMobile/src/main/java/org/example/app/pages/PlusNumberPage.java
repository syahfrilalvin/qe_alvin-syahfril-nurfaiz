package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class PlusNumberPage {
    private By fieldNumber1 = By.xpath("//android.view.View[@content-desc=\"8\"]");
    private By buttonAdd = By.xpath("//android.view.View[@content-desc=\" + \"]");

    private By fieldNumber2 = By.xpath("//android.view.View[@content-desc=\"4\"]");
    private By result = By.xpath("//android.view.View[@content-desc=\"12\"]");

    public void addNumber1() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addElement = driver.findElement(fieldNumber1);
        addElement.click();


    }

    public void clickButtonAdd() throws InterruptedException {
        Thread.sleep(4000);
        WebElement addElement = driver.findElement(buttonAdd);
        addElement.click();
    }

    public void addNumber2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement addElement = driver.findElement(fieldNumber2);
        addElement.click();
    }

    public void verifyResult() throws InterruptedException {
        Thread.sleep(6000);
        WebElement addElement = driver.findElement(result);
        addElement.isDisplayed();

    }
}
