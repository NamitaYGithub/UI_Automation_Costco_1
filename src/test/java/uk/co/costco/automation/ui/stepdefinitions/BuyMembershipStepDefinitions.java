package uk.co.costco.automation.ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import uk.co.costco.automation.ui.pages.CartPage;
import uk.co.costco.automation.ui.pages.Membership;
import uk.co.costco.automation.ui.pages.MembershipTerms;
import uk.co.costco.automation.ui.pages.NewMembershipForm;

public class BuyMembershipStepDefinitions {
    @Steps
    Membership membership;
    MembershipTerms membershipTerms;
    NewMembershipForm newMembershipForm;
    CartPage cartPage;
    @Given("I click individual membership link")
    public void i_click_individual_membership_link() {
        membership.verifyThatYouAreOnMembershipPage();
        membership.clickOnAddToCartButton();
    }
    @Given("I accept terms and conditions")
    public void i_accept_terms_and_conditions() {
        membershipTerms.clickAgreeTermsButton();
        membershipTerms.acceptAgreement();
    }
    @And("I type {string} and {string} on membership form")
    public void i_enter_John_and_Smith_on_membership_form(String firstName, String lastName) {
        newMembershipForm.verifyThatYouAreOnMembershipFormPage();
        newMembershipForm.enterFirstNameAndLastName(firstName,lastName);
    }
    @And("I select {string} on membership form")
    public void i_select_on_membership_form(String employmentType) {
        newMembershipForm.selectEmploymentType(employmentType);
    }
    @And("I enter {string} and {string} and {string} on membership form")
    public void i_enter_and_and_on_membership_form(String addressLine1, String city, String postCode) {
        newMembershipForm.clickEnterAddressManuallyButton();
        newMembershipForm.enterPostalAddress(addressLine1,city,postCode);
    }
    @And("I enter {string} and {string} on membership form")
    public void i_enter_email_address_and_password_on_membership_form(String emailAddress, String password) {
        newMembershipForm.emailAddress(emailAddress);
        newMembershipForm.password(password);
    }
    @And("I enter {string} on membership form")
    public void i_enter_on_membership_form(String mobileNumber) {
        newMembershipForm.mobilePhoneNumber(mobileNumber);
    }
    @When("I click add to cart button")
    public void i_click_add_to_cart_button() {
        newMembershipForm.clickAddToCartButton();
    }
    @Then("I find my membership {string} is added into cart")
    public void i_find_my_membership_with_is_added_into_cart(String membershipName) {
        cartPage.verifyCartStateForMembership(membershipName);
    }
}