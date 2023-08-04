package org.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidInitiation {
    public static AndroidDriver driver;

    public static void initialize(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("org/example/app", "D:\\Alterra Academy\\Final Project\\MobileAutomation\\src\\test\\java\\resources\\app\\app-release.apk");


        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
        } catch(MalformedURLException e){
            e.printStackTrace();

        }

    }

    public static void quit(){
        driver.quit();
    }

}
