package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends UIInteractionSteps {
    private EnvironmentVariables environmentVariables;
    private final By usernameTextbox = By.id("j_username");
    private final By passwordTextbox = By.id("j_password");
    private final By loginButton = By.cssSelector("#loginForm button");
    private final By errorMessage = By.cssSelector(".global-alerts .alert-danger");
    private final By buyMembershipButton = By.xpath("//div[@class='login-register-online']");
    @Step
    public void enterUsernameAndPassword() {
        EnvironmentSpecificConfiguration configuration = EnvironmentSpecificConfiguration.from(environmentVariables);
        String username = configuration.getProperty("username");
        String password = configuration.getProperty("password");
        $(usernameTextbox).type(username);
        $(passwordTextbox).type(password);
    }
    @Step("Enter {0} and {1}")
    public void enterUsernameAndPassword(String username, String password) {
        $(usernameTextbox).type(username);
        $(passwordTextbox).type(password);
    }
    @Step
    public void clickOnLoginButton() {
        $(loginButton).click();
    }
    @Step
    public void clickBuyMembershipLink(){
        $(buyMembershipButton).click();
    }
    public void verifyErrorMessageIsDisplayed() {
        Assertions.assertThat($(errorMessage).isVisible()).isTrue();
    }
}