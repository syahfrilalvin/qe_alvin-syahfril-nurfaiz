package org.example.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.app.drivers.AndroidInitiation.driver;

public class OrderPage {
    private By textOrderPosition = By.xpath("//android.view.View[@content-desc=\"Products\"]");
    private By emptyOrder = By.xpath("//android.widget.Button[@content-desc=\"0\"]");
    private By oneOrder = By.xpath("//android.widget.Button[@content-desc=\"1\"]");
    private By twoOrder = By.xpath("//android.widget.Button[@content-desc=\"2\"]");
    private By beliBarang = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    private By beliBarang1 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");

    public void orderPagePosition() throws InterruptedException {
        Thread.sleep(100);
        WebElement addElement = driver.findElement(textOrderPosition);
        addElement.isDisplayed();
    }
    public void showEmptyOrder() throws InterruptedException {
        Thread.sleep(200);
        WebElement addElement = driver.findElement(emptyOrder);
        addElement.isDisplayed();
    }
    public void klikBeliBarang() throws InterruptedException {
        Thread.sleep(300);
        WebElement addElement = driver.findElement(beliBarang);
        addElement.click();
    }
    public void klikBeliBarang1() throws InterruptedException {
        Thread.sleep(300);
        WebElement addElement = driver.findElement(beliBarang1);
        addElement.click();
    }
    public void showSumBarang1() throws InterruptedException {
        Thread.sleep(400);
        WebElement addElement = driver.findElement(oneOrder);
        addElement.isDisplayed();
    }
    public void showSumBarang2() throws InterruptedException {
        Thread.sleep(400);
        WebElement addElement = driver.findElement(twoOrder);
        addElement.isDisplayed();
    }
}
