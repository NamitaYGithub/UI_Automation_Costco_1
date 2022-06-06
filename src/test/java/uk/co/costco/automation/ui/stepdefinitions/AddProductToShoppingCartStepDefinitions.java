package uk.co.costco.automation.ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import uk.co.costco.automation.ui.pages.*;

public class AddProductToShoppingCartStepDefinitions {
    @Steps
    HeaderSection headerSection;
    @Steps
    HotBuysPage hotBuysPage;
    @Steps
    CartPage cartPage;
    @Steps
    SelectedProductPage selectedProductPage;

    @When("I select Hot Buys option within Shop All Departments")
    public void iSelectHotBuysOptionWithinShopAllDepartments()
    {
        headerSection.SelectShopAllDepartmentsNavbar();
    }
    @And("I select the first product in the list")
    public void iSelectTheFirstProductInTheList()
    {
        hotBuysPage.verifyThatYouAreOnHotBuysPage();
        hotBuysPage.SelectTheProduct();
    }
    @And("I add the selected product to the cart")
    public void iAddTheSelectedProductToTheCart()
    {
        selectedProductPage.verifyThatYouAreOnSelectedProductPage();
        selectedProductPage.ClickAddToCartButton();
    }
    @When("I click the view cart button")
    public void i_click_the_view_cart_button() {
        selectedProductPage.ViewCartButton();
    }
    @Then("I am able to verify that I am on the cart page")
    public void verifyThatIAmOnTheCartPage()
    {
        cartPage.verifyCartStateForProduct();
    }
}