Feature: Amazon Homepage
  Scenario: Validate dropdown
    Given user launch the amazon website
    When user clicks on dropdown button in the search bar
    Then dropdown should be displayed

    Scenario: Validate dropdown contents
      When user clicks particular category from dropdown
      Then the category name should be displayed on the top