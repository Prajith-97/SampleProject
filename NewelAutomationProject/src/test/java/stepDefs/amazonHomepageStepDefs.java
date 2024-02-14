package stepDefs;

import io.cucumber.java.en.*;
import testCode.test_amazonHomepage;

import java.io.IOException;

public class amazonHomepageStepDefs {
    @Given("user launch the amazon website")
    public void user_launch_the_amazon_website() throws Exception {
        test_amazonHomepage.launchWebsite();
    }
    @When("user clicks on dropdown button in the search bar")
    public void user_clicks_on_dropdown_button_in_the_search_bar() throws IOException {
         test_amazonHomepage.clickDropdownButton();
    }
    @Then("dropdown should be displayed")
    public void dropdown_should_be_displayed() {
        test_amazonHomepage.checkDropdownDisplayed();
    }

    @When("user clicks particular category from dropdown")
    public void userClicksParticularCategoryFromDropdown() {
        test_amazonHomepage.selectCategoryDropdown();
    }

    @Then("the category name should be displayed on the top")
    public void theCategoryNameShouldBeDisplayedOnTheTop() {
    }
}
