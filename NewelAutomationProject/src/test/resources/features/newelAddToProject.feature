Feature: Add To Project
#  Background:
#    Given user launches the website
#    And click close button in join newel form
#    And clicks on the Add to project button
#    And user clicks on the Create New button
#    And user enter the project name

  Scenario: Validate create new project
    Given user launches the website
    And click close button in join newel form
    And clicks on the Add to project button
    And user clicks on the Create New button
    And user enter the project name
    When user clicks on create new project button
    Then project should get created

#  Scenario: Validate newly created project
#    And user clicks on create new project button
#    When user clicks on the project name
#    Then user should redirected to project page

#  Scenario: Validate check availability button
#    And user clicks on create new project button
#    And user clicks on the project name
#    When user clicks on the check availability button
#    Then user should redirected to contact information screen
