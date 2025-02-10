package com.juaracoding.ujianappium.steps;

import com.juaracoding.ujianappium.drivers.DriverSingleton;
import com.juaracoding.ujianappium.screens.CalculatorGoogleScreen;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PenjumlahanSteps {

    private AndroidDriver driver;
    private CalculatorGoogleScreen calculatorGoogleScreen;

    @Before
    public void setup() {
        driver = DriverSingleton.getDriver();
        calculatorGoogleScreen = new CalculatorGoogleScreen(driver);
}


    @Given("saya menekan tombol clear pada calculator")
    public void clickButtonClear() {
        calculatorGoogleScreen.clickClear();
    }

    @And("saya menekan tombol nilai pertama")
    public void clickButtonNine() {
        calculatorGoogleScreen.clickNine();
    }

    @And("saya menekan tombol plus pada calculator")
    public void clickButtonPlus() {
        calculatorGoogleScreen.clickPlus();
    }

    @And("saya menekan tombol nilai kedua")
    public void clickButtonFive() {
        calculatorGoogleScreen.clickFive();
    }

    @And("saya menekan tombol sama dengan pada calculator")
    public void clickButtonEqual() {
        calculatorGoogleScreen.clickEqual();
    }

    @Then("saya mendapatkan hasil {string}")
    public void getResult(String expected) {
        Assert.assertEquals(calculatorGoogleScreen.getResult(), expected);
    }


}
