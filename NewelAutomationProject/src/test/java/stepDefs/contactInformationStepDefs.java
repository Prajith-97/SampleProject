package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import testCode.test_contactInformation;

public class contactInformationStepDefs {
    @And("user enter valid details")
    public void userEnterValidDetails(DataTable dataTable) throws Exception {
        try{
            test_contactInformation.enterValidDetails(dataTable);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks on Next button")
    public void userClicksOnNextButton() throws Exception {
        try{
            test_contactInformation.clickNextButton();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Then("review order page should be displayed")
    public void reviewOrderPageShouldBeDisplayed() throws Exception {
        try{
            test_contactInformation.verifyReviewPage();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks submit request")
    public void userClicksSubmitRequest() throws Exception {
        try{
            test_contactInformation.clickSubmit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("request should get submitted successfully")
    public void requestShouldGetSubmittedSuccessfully() throws Exception {
        try{
            test_contactInformation.verifyRequest();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
