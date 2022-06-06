package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class HotBuysPage extends UIInteractionSteps
{
    protected final By firstHotBuy = By.xpath("(//span[@class='notranslate'])[1]");
    public void verifyThatYouAreOnHotBuysPage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Hot buys | Discover Latest Deals & Bargains");
    }

    @Step
    public void SelectTheProduct()
    {
        $(firstHotBuy).click();
    }
}