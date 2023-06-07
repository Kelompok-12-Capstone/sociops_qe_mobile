Feature: Login
    As a user
    I want to login
    So that i can access dashboard


    Scenario : Verify Email field outline when user feeling without email type or incomplete email
        Given I am open app socioPs
        When on the login screen
        And I input incomplete email
        Then I get result the message

    Scenario: Verify Email field outline when user feeling with email type
        Given I am open app socioPs
        When on the login screen
        And I input email
        Then I get result the message

    Scenario: Verify password field outline when user feeling password
        Given I am open app socioPs
        When on the login screen
        And I input password
        Then I get result the message

    Scenario: User can type a text, symbol, and number in email field
        Given I am open app socioPs
        When on the login screen
        And Click login with email field
        And Input email field
        Then I get result the message

    Scenario: User can type a text, symbol, and number in password field
        Given I am open app socioPs
        When on the login screen
        And Click login with password field
        And Input password field
        Then I get result the message

    Scenario: Verify user can login with account SOCIOPS
        Given I am open app socioPs
        When on the login screen
        And I input email
        And I input password
        And I click Login Button
        Then I am on dashboard page

    Scenario: Verify user can't login without input password
        Given I am open app socioPs
        When on the login screen
        And I input email
        And I input blank password
        And I click Login Button
        Then I get message

    Scenario: Verify user can't login without input email
        Given I am open app socioPs
        When on the login screen
        And I input blank email
        And I input  password
        And I click Login Button
        Then I get message

    Scenario: Verify User can't login with unregister email
        Given I am open app socioPs
        When on the login screen
        And I input unregister email
        And I input unregister password
        And I click Login Button
        Then I get message

    Scenario: Verify user can't login with inccorect password
        Given I am open app socioPs
        When on the login screen
        And I input email
        And I input incorrect password
        And I click Login Button
        Then I get message
