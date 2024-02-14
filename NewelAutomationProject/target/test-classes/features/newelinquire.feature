Feature: Inquire Functionality

  Background:
  Given user launches the website
  And click close button in join newel form

  Scenario: Validate inquire button
    When user clicks on the inquire button
    Then inquire form should be displayed

  Scenario: Validate inquiry form
    And user clicks on the inquire button
    And user enter the details in the form
      | FirstName | LastName | Email          | Telephone    | Message   |
      | Demo      | D        | demo@gmail.com | 984522123637 | Hi, Thank You|
    When user clicks on the submit button
    Then user should redirected to Thank you screen

  Scenario: Validate add to project button
    And clicks on the Add to project button
    When user clicks on the Create New button
    Then user should redirected to My Projects page