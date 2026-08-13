@Login
Feature: Login

  @valid-login
  Scenario: Login using valid username and password
    Given the user is on the login page
    And the user enters "standard_user" in the email field
    And the user enters "secret_sauce" in the password field
    When the user clicks the login button
    Then the user is redirected to the homepage

  @invalid-login
  Scenario: Login using invalid username and password
    Given the user is on the login page
    And the user enters "standard_user" in the email field
    And the user enters "invalid" in the password field
    When the user clicks the login button
    Then the user see the error message "Epic sadface: Username and password do not match any user in this service"

  @empty-username
  Scenario: Attempt login without entering username
    Given the user is on the login page
    And the user enters "" in the email field
    And the user enters "secret_sauce" in the password field
    When the user clicks the login button
    Then the user see the error message "Epic sadface: Username is required"

  @empty-password
  Scenario: Attempt login without entering username
    Given the user is on the login page
    And the user enters "standard_user" in the email field
    And the user enters "" in the password field
    When the user clicks the login button
    Then the user see the error message "Epic sadface: Password is required"