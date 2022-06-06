package uk.co.costco.automation.ui.stepdefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import uk.co.costco.automation.ui.pages.HeaderSection;
import uk.co.costco.automation.ui.pages.HomePage;
import uk.co.costco.automation.ui.pages.LoginPage;

public class LoginStepDefinitions {
    @Steps
    HomePage homePage;
    @Steps
    LoginPage loginPage;
    @Steps
    HeaderSection headerSection;
    @Given("I'm on the Costco home page")
    public void i_am_on_the_home_page() {
        homePage.open();
        homePage.acceptAllCookies();
    }
    @Given("I click on Login or Register link")
    public void i_click_on_Login_Register_link() {
        headerSection.clickOnLoginLink();
    }
    @Given("I select buy membership option")
    public void i_select_buy_membership_option(){
        loginPage.clickBuyMembershipLink();
    }
}