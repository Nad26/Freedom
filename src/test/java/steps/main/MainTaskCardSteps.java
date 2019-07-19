package steps.main;

import base.BaseDriver;
import base.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.BeforeClass;
import pages.mainportal.MainTaskCardPage;

import java.io.IOException;

public class MainTaskCardSteps extends BaseDriver {

    BasePage page = new BasePage();


    public MainTaskCardSteps() throws IOException {
    }

    @BeforeClass
    public void logTask (){


    }




    @Given("^i am on the events screen of logged task$")
    public void iAmOnTheEventsScreenOfLoggedTask() throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .isEventTabOpened();
    }


    @When("^i add and save the Event Note details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iAddAndSaveTheEventNoteDetails(String arg0, String arg1, String arg2, String arg4) throws Throwable {
        page.getInstance(MainTaskCardPage.class)
                .iClickCreateEventNoteButton()
                .iSetEventSpokeTo(arg0)
                .iSetEventDescription(arg4)
                .iClickSaveEventNote()
                .isEventNoteSaved(arg4);
    }


    @Then("^The note \"([^\"]*)\" is saved and appears on the screen$")
    public void theNoteIsSavedAndAppearsOnTheScreen(String arg4) throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .isEventNoteSaved(arg4);
    }


    @When("^i edit the description with description: \"([^\"]*)\"$")
    public void iEditTheDescriptionWithDescription(String arg0) throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .iClickEditDescriptionButton()
                .iEditTaskDescription(arg0)
                .iClickUpdateButton();
    }

    @Then("^the description is saved successfully as \"([^\"]*)\"$")
    public void theDescriptionIsSavedSuccessfully(String arg0) throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .isTaskDescriptionSaved(arg0);
    }


    @When("^i go to Actions tab$")
    public void iGoToActionsTab() throws IOException, InterruptedException {
        page.getInstance(MainTaskCardPage.class)
                .iClickActionsLink();
    }

    @Then("^the task is assigned to the contractor \"([^\"]*)\"$")
    public void theTaskIsAssignedToTheContractor(String arg0) throws Exception{
        page.getInstance(MainTaskCardPage.class)
                .verifySuccessTaskassignedNotificationDisplayed(arg0);
    }


    @And("^i click Assign Contractor$")
    public void iClickAssignContractor() throws IOException, InterruptedException {

        page.getInstance(MainTaskCardPage.class)
                .iClickAssignContractor()
                ;
    }

    @Then("^The Step One of the contract Assignment \"([^\"]*)\" is opened$")
    public void theStepOneOfTheContractAssignmentIsOpened(String arg0) throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .isContractorAssignCorrectStepOpened(arg0);

    }


    @And("^i Navigate through the assignment verification steps \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iNavigateThroughTheAssignmentVerificationSteps(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {

        page.getInstance(MainTaskCardPage.class)
                .iGoToNextContractorAssignScreen(arg1)
                .iGoToNextContractorAssignScreen(arg2)
                .iGoToNextContractorAssignScreen(arg3)
                .iGoToNextContractorAssignScreen(arg4)
                .iGoToNextContractorAssignScreen(arg5)
                .iGoToNextContractorAssignScreen(arg6)
                .iGoToNextContractorAssignScreen(arg7)
                ;
    }


    @And("^ i update discipline selections if required$")
    public void iUpdateDisciplineSelectionsIfRequired() {

    }


    @And("^i Select and Assign Contractor to be assigned as \"([^\"]*)\"$")
    public void iSelectContractorToBeAssigned(String arg0) throws Throwable {
        page.getInstance(MainTaskCardPage.class)
            .iSelectContractor(arg0)
                .iClickAssign();

    }


    @And("^the task is available to the contractor to pick up$")
    public void theTaskIsAvailableToTheContractorToPickUp() {
    }
}