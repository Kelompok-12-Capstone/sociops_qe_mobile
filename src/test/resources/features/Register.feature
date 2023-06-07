Feature:  As User
  I have to able registering my account
  So that I can login and access dashboard of the SocioPs apps

  Scenario: Verify register feature
    Given I Open SOCIOPS Apps
    And I am on the login page and scroll down
    When Click Buat Akun
    And Input email and password
    And Click Register
    Then on the login screen

  Scenario: Verify user can't register with invalid email
    Given I Open SOCIOPS Apps
    And I am on the login page and scroll down
    When Click Buat Akun
    And Input invalid email and password
    And Click Register
    Then i get messages registration

  Scenario:  Verify user cannot create account with email that already exist
    Given I Open SOCIOPS Apps
    And I am on the login page and scroll down
    When Click Buat Akun
    And Input already registered email and password
    And Click Register
    Then i get messages registration

  Scenario: Verify user cannot create account with invalid password
    Given I Open SOCIOPS Apps
    And I am on the login page and scroll down
    When Click Buat Akun
    And Input email and 6 char password
    And Click Register
    Then i get messages registration