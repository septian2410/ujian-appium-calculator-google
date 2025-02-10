package com.juaracoding.ujianappium.hooks;

import com.juaracoding.ujianappium.drivers.DriverSingleton;
import com.juaracoding.ujianappium.drivers.utils.TargetEnvironment;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class Hook {

    @BeforeAll
    public static void initialize() throws MalformedURLException {
        DriverSingleton.getDriver(TargetEnvironment.GOOGLE_CALCULATOR);
    }

    @AfterAll
    public static void finalTeardown() {
        DriverSingleton.closeDriver();
    }

}
