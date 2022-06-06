package uk.co.costco.automation.ui.utility;

import io.cucumber.java.Before;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.util.EnvironmentVariables;

public class GlobalHook extends UIInteractionSteps {

    @Before
    public void enterUsernameAndPassword() {
        getDriver().manage().deleteAllCookies();
    }
}
