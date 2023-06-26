Feature: Login
    As a user
    I want to login
    So that i can access homepage


    Scenario Outline: As a user i want to login form my account
        Given I am on the login screen
        When I input correct email
        And I input correct password
        When I click button login
        Then I get result the message