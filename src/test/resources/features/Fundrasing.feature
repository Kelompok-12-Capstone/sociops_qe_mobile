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

  # Scenario: I want to search fundraising from filter
  #   Given I on the home screen
  #   When I click fundraising button
  #   And I on the fundraising screen
  #   And I click filter button
  #   And I choose for filter fundraising
  #   Then I click apply button

  # Scenario: I want to bookmark a fundraising program
  #   Given I on the home screen
  #   When I click fundraising button
  #   And I on the fundraising screen
  #   And I click donasi sekarang button
  #   And I on the detail fundraising screen
  #   Then I click bookmark button

  # Scenario: I can write nominal for fundraising
  #   Given I on the home screen
  #   When I click fundraising button
  #   And I on the fundraising screen
  #   And I click donasi sekarang button
  #   And I on the detail fundraising screen
  #   And I click donasi sekarang button1
  #   And I on the pilih jumlah pembayaran screen
  #   And I type nominal for fundraising
  #   And I click pilih pembayaran button
  #   Then I on the konfirmasi donasi screen

  # Scenario: I can't continue paying if I don't choose or write down the nominal
  #   Given I on the home screen
  #   When I click fundraising button
  #   And I on the fundraising screen
  #   And I click donasi sekarang button
  #   And I on the detail fundraising screen
  #   And I click donasi sekarang button1
  #   And I on the pilih jumlah pembayaran screen
  #   Then I click pilih pembayaran button without choose or type nominal

  # Scenario: I can't continue paying if i don't choose payment method
  #   Given I on the home screen
  #   When I click fundraising button
  #   And I on the fundraising screen
  #   And I click donasi sekarang button
  #   And I on the detail fundraising screen
  #   And I click donasi sekarang button1
  #   And I on the pilih jumlah pembayaran screen
  #   And I choose nominal for fundraising
  #   And I click pilih pembayaran button
  #   And I on the konfirmasi donasi screen
  #   And I click bayar button without choose payment method