Feature: Contact Information
  Background:
    Given user launches the website
    And click close button in join newel form
    And clicks on the Add to project button
    And user clicks on the Create New button
    And user enter the project name
    And user clicks on create new project button
    And user clicks on the project name
    And user clicks on the check availability button

  Scenario: Validate Next button after entering valid details
    And user enter valid details
      | FirstName | LastName | Email          | Telephone    | Country Index | State Index |
      | Demo      | D        | demo@gmail.com | 984522123637 | 5             | 3           |
    When user clicks on Next button
    Then review order page should be displayed

  Scenario: Validate submit request functionality
    And user enter valid details
      | FirstName | LastName | Email          | Telephone    | Country Index | State Index |
      | Demo      | D        | demo@gmail.com | 984522123637 | 5             | 3           |
    And user clicks on Next button
    When user clicks submit request
    Then request should get submitted successfully



