Feature: Fundraising
  As a user
  I want to fundraising a campaign

  Scenario: I want to Fundraising
    Given I on the home screen
    When I click fundraising button
    And I click donasi sekarang button
    And I click donasi sekarang button1
    And I choose nominal for fundraising
    And I click pilih pembayaran button
    And I click payment method field
    And I choose payment method field
    And I click bayar button
    And I click pergi ke mitrans after success payment
    Then I on the payments success screen

