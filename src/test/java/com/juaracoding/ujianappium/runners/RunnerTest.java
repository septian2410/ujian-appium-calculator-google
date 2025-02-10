package com.juaracoding.ujianappium.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {
                "src/test/resources/features/CalculatorGoogle.feature",
                "src/test/resources/features/CalculatorGoogle2.feature",
        },
        glue = {
                "com.juaracoding.ujianappium.hooks",
                "com.juaracoding.ujianappium.steps",
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reporting-mobile/reporting.html"
        }
)


public class RunnerTest extends AbstractTestNGCucumberTests {
}
