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
        caps.setCapability("app", "E:\\Explore\\Quality Engineer\\QA Automation\\CalculatorMobile\\src\\test\\resources\\app\\calculator-alta-qe.apk");


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
