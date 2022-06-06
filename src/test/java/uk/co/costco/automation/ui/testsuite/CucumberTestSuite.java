package uk.co.costco.automation.ui.testsuite;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "uk.co.costco.automation.ui",
        plugin = {"pretty"},
        features = "src/test/resources/features"
)
public class CucumberTestSuite { }
