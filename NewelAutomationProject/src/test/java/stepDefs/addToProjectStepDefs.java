package stepDefs;

import io.cucumber.java.en.*;
import reportListener.extentReportListener;
import testCode.test_addToProjectFunctionality;
import static testCode.test_addToProjectFunctionality.driver;

public class addToProjectStepDefs {
    @And("user enter the project name")
    public void userEnterTheProjectName() throws Exception {
        try{
            test_addToProjectFunctionality.enterProjectName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @When("user clicks on create new project button")
    public void userClicksOnCreateNewProjectButton() throws Exception {
        try{
            test_addToProjectFunctionality.clickCreateProjectButton();
        }catch (Exception e){
//            extentReportListener.testStepHandle("FAIL", driver);
            throw new Exception(e);
        }
    }
    @Then("project should get created")
    public void projectShouldGetCreated() throws Exception {
        try{
            test_addToProjectFunctionality.verifyProjectName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("user clicks on the project name")
    public void userClicksOnTheProjectName() throws Exception {
        try{
            test_addToProjectFunctionality.clickProjectLink();
        }catch (Exception e){
            throw new Exception(e);
        }

    }
    @Then("user should redirected to project page")
    public void userShouldRedirectedToProjectPage() throws Exception {
        try{
            test_addToProjectFunctionality.verifyProjectDetails();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    @When("user clicks on the check availability button")
    public void userClicksOnTheCheckAvailabilityButton() throws Exception {
        try{
            test_addToProjectFunctionality.clickCheckAvailability();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    @Then("user should redirected to contact information screen")
    public void userShouldRedirectedToContactInformationScreen() throws Exception {
      try{
          test_addToProjectFunctionality.verifyInformationPage();
      }catch (Exception e){
          throw new Exception(e);
      }
    }
}
