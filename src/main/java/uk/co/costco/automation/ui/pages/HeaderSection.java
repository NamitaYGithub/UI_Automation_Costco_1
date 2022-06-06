package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
public class HeaderSection extends UIInteractionSteps {
    protected final By login = By.id("loginRegisterLink");
    protected final By ShopAllDepartmentsNavbar = By.xpath("//span[@class='menu-font-size desktop-message']");
    protected final By HoyBuysOption = By.xpath("(//a[@title='Hot Buys'])[1]");
    public void clickOnLoginLink() {

        $(login).click();
    }
    @Step
    public void SelectShopAllDepartmentsNavbar()
    {
        withAction().moveToElement(element(ShopAllDepartmentsNavbar)).moveToElement(element(HoyBuysOption)).click().build().perform();
    }
}