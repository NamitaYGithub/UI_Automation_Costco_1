@Membership
Feature: Apply for New Membership

  Scenario Outline: Verify user is able to add new membership to cart
    Given I'm on the Costco home page
    And I click on Login or Register link
    And I select buy membership option
    And I click individual membership link
    And I accept terms and conditions
    And I type <firstname> and <lastname> on membership form
    And I select <employmenttype> on membership form
    And I enter <addressline1> and <city> and <postcode> on membership form
    And I enter <emailaddress> and <password> on membership form
    And I enter <mobilephonenumber> on membership form
    When I click add to cart button
    Then I find my membership <membershipname> is added into cart
    Examples:
      | firstname | lastname | employmenttype  | addressline1        | city     | postcode  | emailaddress   | password   | mobilephonenumber | membershipname                    |
      | "John"    | "Smith"  | "MERCHANT NAVY" | "34, Regent Street" | "London" | "LA1 2HB" | "test@nai.com" | "Test@123" | "7777777777"      | "Warehouse Individual Membership" |
