package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class Membership extends UIInteractionSteps {
    public void verifyThatYouAreOnMembershipPage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Costco UK Annual Subscription & Membership");
    }
    private final By addToCartButtonForIndividualMembership = By.xpath("(//div[@id='button'])[3]");
    @Step
    public void clickOnAddToCartButton() {
        $(addToCartButtonForIndividualMembership).click();
    }
}