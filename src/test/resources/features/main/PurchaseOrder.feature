Feature: Login

  Background:
    Given User goes to Main URL "url"

  @smoke
  Scenario: Successful Login with correct Credentials

    When User enters mobile number
    And User enters password
    And User clicks sign in
    Then The freedom home screen should be displayed



  Scenario: UnSuccessful Login with incorrect Credentials

    When User enters mobile number
    And User enters incorrect password
    And User clicks sign in
    Then The freedom home screen should not be displayed




