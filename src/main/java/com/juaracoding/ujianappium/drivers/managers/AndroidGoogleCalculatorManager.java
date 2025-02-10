package com.juaracoding.ujianappium.drivers.managers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidGoogleCalculatorManager {

    public static AndroidDriver make() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("platformName", "Android");
        options.setCapability("appium:deviceName", "137178a8");
        options.setCapability("appium:automationName", "UiAutomator2");
        options.setCapability("appium:appPackage", "com.google.android.calculator");
        options.setCapability("appium:appActivity", "com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        return driver;
    }

}
