package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import testCode.test_inquireFunctionality;
import utility.readJsonData;

public class inquireStepDefs {
    @Given("user launches the website")
    public void user_launches_the_website() throws Exception {
        try{
            test_inquireFunctionality.launchBrowser();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @And("click close button in join newel form")
    public void click_close_button_in_join_newel_form() throws Exception {
        try{
            test_inquireFunctionality.clickCloseButton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks on the inquire button")
    public void user_clicks_on_the_inquire_button() throws Exception {
        try{
            test_inquireFunctionality.clickInquireButton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("inquire form should be displayed")
    public void inquire_form_should_be_displayed() throws Exception {
        try{
            test_inquireFunctionality.verifyInquireDialogBox();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @And("user enter the details in the form")
    public void userEnterTheDetailsInTheForm(DataTable dataTable) throws Exception {
        try{
            test_inquireFunctionality.enterDetails(dataTable);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks on the submit button")
    public void userClicksOnTheSubmitButton() throws Exception {
        try{
            test_inquireFunctionality.clickSubmitButton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("user should redirected to Thank you screen")
    public void userShouldRedirectedToThankYouScreen() throws Exception {
        try{
            test_inquireFunctionality.checkErrorMessage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @And("clicks on the Add to project button")
    public void clicksOnTheAddToProjectButton() throws Exception {
        try{
            test_inquireFunctionality.clickAddToProject();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks on the Create New button")
    public void userClicksOnTheCreateNewButton() throws Exception {
        try{
            test_inquireFunctionality.clickCreateNewButton();
        }catch (Exception e){
            e.printStackTrace();
        }
    }@Then("user should redirected to My Projects page")
    public void userShouldRedirectedToMyProjectsPage() throws Exception {
        try{
            test_inquireFunctionality.myProjectPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
