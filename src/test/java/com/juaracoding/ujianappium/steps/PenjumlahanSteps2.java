package com.juaracoding.ujianappium.steps;

import com.juaracoding.ujianappium.drivers.DriverSingleton;
import com.juaracoding.ujianappium.screens.CalculatorGoogleScreen;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PenjumlahanSteps2 {

    private AndroidDriver driver;
    private CalculatorGoogleScreen calculatorGoogleScreen;

    @Before
    public void setup() {
        driver = DriverSingleton.getDriver();
        calculatorGoogleScreen = new CalculatorGoogleScreen(driver);
    }


    @Given("saya menekan tombol clear")
    public void clickButtonClear() {
        calculatorGoogleScreen.clickClear();
    }

    @And("saya menekan tombol {int}")
    public void clickButtonNumber(Integer angka) {
        // Konversi angka menjadi klik tombol yang sesuai
        String angkaStr = angka.toString();
        for (char digit : angkaStr.toCharArray()) {
            switch (digit) {
                case '0': calculatorGoogleScreen.clickZero(); break;
                case '1': calculatorGoogleScreen.clickOne(); break;
                case '2': calculatorGoogleScreen.clickTwo(); break;
                case '3': calculatorGoogleScreen.clickThree(); break;
                case '5': calculatorGoogleScreen.clickFive(); break;
                case '9': calculatorGoogleScreen.clickNine(); break;
                default: throw new IllegalArgumentException("Tombol angka tidak dikenali: " + digit);
            }
        }
    }

    @And("saya menekan tombol plus")
    public void clickButtonPlus() {
        calculatorGoogleScreen.clickPlus();
    }

    @When("saya menekan tombol sama dengan")
    public void clickButtonEqual() {
        calculatorGoogleScreen.clickEqual();
    }

    @Then("saya mendapatkan hasil {int}")
    public void getResult(Integer expectedResult) {
        String resultText = calculatorGoogleScreen.getResult();
        Integer actualResult = Integer.parseInt(resultText);
        Assert.assertEquals(expectedResult, actualResult);
    }


}
