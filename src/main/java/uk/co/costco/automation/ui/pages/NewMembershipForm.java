package uk.co.costco.automation.ui.pages;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class NewMembershipForm extends UIInteractionSteps {
    private final By enterAddressManuallyButton = By.xpath("//button[@class='btn btn-link js-toggle-validation-form-btn']");
    private final By addToCartButton = By.xpath("//button[@id='membership-step2-btn-submit']");
    private final By firstNameTextField = By.xpath("//input[@id='firstName']");
    private final By lastNameTextField = By.xpath("//input[@id='lastName']");
    private final By employmentTypeDropdown = By.xpath("(//select[@id='employmentType'])[1]");
    private final By addressLine1TextField = By.xpath("//input[@id='homeAddress11']");
    private final By cityTextField = By.xpath("//input[@id='city1']");
    private final By postCodeTextField = By.xpath("//input[@id='postalCode1']");
    private final By emailTextField = By.xpath("//input[@id='email']");
    private final By confirmEmailTextField = By.xpath("//input[@id='emailConfirm']");
    private final By passwordTextField = By.xpath("//input[@id='password']");
    private final By confirmPasswordTextField = By.xpath("//input[@id='passwordConfirm']");
    private final By mobilePhoneTextField = By.xpath("  //input[@id='mobilePhone']");
    @Step
    public void enterFirstNameAndLastName(String firstName, String lastName){
        $(firstNameTextField).type(firstName);
        $(lastNameTextField).type(lastName);
    }
    @Step
    public void selectEmploymentType(String employmentType){
        $(employmentTypeDropdown).select().byVisibleText(employmentType);
    }
    @Step
    public void clickEnterAddressManuallyButton() {
        $(enterAddressManuallyButton).click();
    }
    @Step
    public void enterPostalAddress(String addressLine1, String city, String postCode) {
        $(addressLine1TextField).type(addressLine1);
        $(cityTextField).type(city);
        $(postCodeTextField).type(postCode);
    }
    @Step
    public void emailAddress(String emailAddress) {
        $(emailTextField).type(emailAddress);
        $(confirmEmailTextField).type(emailAddress);
    }
    @Step
    public void password(String password) {
        $(passwordTextField).type(password);
        $(confirmPasswordTextField).type(password);
    }
    public void verifyThatYouAreOnMembershipFormPage() {
        assertThat((String) evaluateJavascript("return document.title")).
                isEqualTo("Costco Membership & Online Only Annual Subscription | Costco UK");
    }
    @Step
    public void mobilePhoneNumber(String mobileNumber) {
        $(mobilePhoneTextField).type(String.valueOf(mobileNumber));
    }
    @Step
    public void clickAddToCartButton() {
        //waitForCondition().until(ExpectedConditions.(addToCartButton));
        MoveMouse.to(addToCartButton);
        withAction().moveToElement(element(addToCartButton)).click().build().perform();
    }
}