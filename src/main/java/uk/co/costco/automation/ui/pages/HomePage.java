package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends UIInteractionSteps {
    private final By acceptCookies = By.xpath("//button[@class='btn btn-primary gdpr-accept']");
    public void verifyThatYouAreOnHomePage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Join the club & start saving! | Costco UK");
    }

    @Step
    public void acceptAllCookies() {
        $(acceptCookies).click();
    }


}