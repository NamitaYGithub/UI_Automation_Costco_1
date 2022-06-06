package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class CartPage extends UIInteractionSteps {
    private final By cartStateLink = By.xpath("//a[contains(.,'Warehouse Individual Membership')]");
    private final By checkoutButton = By.xpath("(//button[@id='chkoutButton'])[2]");
    protected final By CartIcon = By.linkText("Cart");
    public void verifyCartStateForMembership(String membershipName)
    {
        assertThat($(cartStateLink).isPresent()).isTrue();
        assertThat($(cartStateLink).getText()).isEqualTo(membershipName);
        assertThat($(checkoutButton).isPresent()).isTrue();
    }
    public void verifyCartStateForProduct()
    {
        assertThat($(checkoutButton).isPresent()).isTrue();
        assertThat($(CartIcon).isPresent()).isTrue();
        assertThat($(CartIcon).getText()).isEqualTo("Cart");
    }
}