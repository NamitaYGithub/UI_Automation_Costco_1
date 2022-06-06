package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class MembershipTerms extends UIInteractionSteps {
    private final By agreeTermsCheckbox = By.xpath("//span[@class='checkbox-text '][contains(.,'I agree to Terms & Conditions and acknowledge the Member Privileges & Conditions and Privacy Policy.')]");
    private final By acceptAgreementButton = By.xpath("//button[@id='membership-step1-btn-submit']");
    public void verifyThatYouAreOnMembershipTermsPage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Costco UK Annual Subscription & Membership");
    }

    @Step
    public void clickAgreeTermsButton() {
        $(agreeTermsCheckbox).click();
    }
    @Step
    public void acceptAgreement() {
        $(acceptAgreementButton).click();
    }
}