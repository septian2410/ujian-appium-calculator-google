package com.juaracoding.ujianappium.drivers.strategies;

import com.juaracoding.ujianappium.drivers.managers.AndroidEcommerceManager;
import com.juaracoding.ujianappium.drivers.managers.AndroidGoogleCalculatorManager;
import com.juaracoding.ujianappium.drivers.utils.TargetEnvironment;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class DriverStrategyImplementer {

    public AndroidDriver setStrategy(String strategy) throws MalformedURLException {
        switch (strategy) {
            case TargetEnvironment.ECOMMERCE:
                return AndroidEcommerceManager.make();
            case TargetEnvironment.GOOGLE_CALCULATOR:
                return AndroidGoogleCalculatorManager.make();
            default:
                return AndroidGoogleCalculatorManager.make();
        }
    }

}
