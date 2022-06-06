package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectedProductPage extends UIInteractionSteps
{
    private final By AddToCartButton = By.xpath("//button[@id='add-to-cart-button']");
    private final By viewCartButton = By.id("addToCartPopupCheckoutBtn");

    public void verifyThatYouAreOnSelectedProductPage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Blue Whale Spa Royal Beach 110-Jet 6 Person Hot Tub - Delivered an...");
    }
    @Step
    public void ClickAddToCartButton()
    {
        // This page is flaky and does not load correctly in time
        withTimeoutOf(Duration.ofSeconds(60)).find(AddToCartButton).click();
    }
    @Step
    public void ViewCartButton()
    {
        withTimeoutOf(Duration.ofSeconds(60)).find(viewCartButton).click();
    }
}