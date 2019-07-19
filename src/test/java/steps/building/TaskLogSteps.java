package steps.building;

import base.BaseDriver;
import base.BasePage;
import config.Log;
import config.PropertyReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.buildingportal.BuildingHomePage;
import pages.buildingportal.TaskLogPage;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskLogSteps extends BaseDriver {

    BasePage page = new BasePage();
    PropertyReader read = new PropertyReader();
    public String reactiveTaskNbr;



    public TaskLogSteps() throws IOException {
    }


    @Given("^i have logged a task$")
    public void iHaveLoggedATask() throws IOException, InterruptedException {
        page.getInstance(BuildingHomePage.class)
                .clickLogATaskLink();
                //.iLogATask()
    }


    @And("^User clicks Log task$")
    public void userClicksLogTask() throws InterruptedException, IOException {
        page.getInstance(BuildingHomePage.class)
                .clickLogATaskLink();
        Thread.sleep(2000);
    }

    @Then("^The task log screen returns$")
    public void theTaskLogScreenReturns() {
        assertThat(page.getInstance(BuildingHomePage.class)
                .isSiteNotificationModalDisplayed())
                .isTrue();
    }

    @And("^User answers the task log dialog with No$")
    public void userAnswersTheTaskLogDialogWithNo() throws Exception {
        page.getInstance(TaskLogPage.class).clickNo();
        Thread.sleep(5000);
    }


    @And("^User selects an asset$")
    public void userSelectAnAsset() throws IOException, InterruptedException {
        page.getInstance(TaskLogPage.class)
                .setAssetlabel();
        Thread.sleep(5000);
    }

    @And("^User selects manual log with required Disciplines \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSelectsManualLogWithRequiredDisciplinesAnd(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .iClickManualLog()
                .setDisciplineOne(arg0);
        page.getInstance(TaskLogPage.class).setDisciplineTwo(arg1);
        page.getInstance(TaskLogPage.class).setDisciplineThree(arg2);
        page.getInstance(TaskLogPage.class).setDisciplineFour(arg3);
    }

    @Then("^The success notification is displayed to the user$")
    public void theSuccessNotificationIsDisplayedToTheUser() throws Exception {
        page.waitFor(10);
        assertThat(page.getInstance(TaskLogPage.class)
                .isTaskLogSuccessDisplayed()).isTrue();
    }

    @And("^User closes the notification$")
    public void userClosesTheNotification() throws Exception {
        page.waitFor(2);
        assertThat(page.getInstance(TaskLogPage.class)
                .acceptTaskLogNotification());
    }

    @And("^The task is logged$")
    public void theTaskIsLogged() throws Exception {
        page.getInstance(TaskLogPage.class).acceptTaskLogNotification();
        page.waitFor(5);
        reactiveTaskNbr = page.getInstance(BuildingHomePage.class)
                .getTaskNbr();

        Log.info("The reactive task: " + reactiveTaskNbr + " is successfully logged and displayed");
    }


    @And("^User selects \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userSelectsDisciplines(String arg0, String arg1) throws Exception {
        page.getInstance(TaskLogPage.class)
                .setDisciplineThree(arg0);
        page.getInstance(TaskLogPage.class).setDisciplineFour(arg1);
        page.waitFor(10);
    }

    @And("^User selects the task details \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void userSelectsTheTaskDetails(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .selectTaskType(arg0)
                .selectRecallOption(arg1)
                .selectWarantyOption(arg2)
                .selectHsOption(arg3)
                .selectRoccInstructionOption(arg4);
    }


    @And("^User selects \"([^\"]*)\" and \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userSelects(String arg0, String arg1, String arg2, String arg3) throws Throwable {

        page.getInstance(TaskLogPage.class)
                .setDisciplineThree(arg0);
        page.getInstance(TaskLogPage.class).setDisciplineFour(arg1);
        page.getInstance(TaskLogPage.class).selectJobTitle(arg2).selectLocation(arg3);
        page.waitFor(5);
    }

    @And("^User add task description and trading status \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
    public void userAddTaskDescriptionAndTradingStatus(String arg0, String arg1, String arg2) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .setTaskDescription(arg0)
                .selectTradingRestrictionOption(arg1);
    }

    @And("^User select trading status confirmation if displayed$")
    public void userSelectTradingStatusConfirmationIfDisplayed() throws Exception {
        page.getInstance(TaskLogPage.class)
                .confirmTradingStatusIfDisplayed();
    }


    @And("^User selects the Job title and Location details \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void userSelectsTheJobTitleAndLocationDetails(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .selectJobTitle(arg0)
                .selectLocation(arg1)
                .selectAccessDifficultyOption(arg2, arg3);
        page.waitFor(5);

    }

    @And("^User saves and log task with details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" if required$")
    public void userSavesAndLogTaskWithDetailsIfRequired(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .clickSaveAndLogTask()
                .clickAcceptBudgetWarningIfDisplayed(arg0, arg1, arg2)
                .waitFor(5);
        page.getInstance(TaskLogPage.class).acceptOutOfOfficeNotificationIfDisplayed(arg3);
    }


    @And("^User selects Disc three as: \"([^\"]*)\" and Disc four as: \"([^\"]*)\"$")
    public void userSelectsDiscThreeAsAndDiscFourAs(String arg0, String arg1) throws Throwable {
        page.getInstance(TaskLogPage.class)
                .setDisciplineThree(arg0);
        page.getInstance(TaskLogPage.class).setDisciplineFour(arg1);
        page.waitFor(10);
    }


    @When("^i Open the logged task$")
    public void iOpenTheLoggedTask() throws Throwable {
        throw new PendingException();
    }

    @And("^ i Assign a Contractor$")
    public void iAssignAContractor() throws Throwable {
        throw new PendingException();
    }

    @And("^ i Create a Engineer Visit$")
    public void iCreateAEngineerVisit() throws Throwable {
        throw new PendingException();
    }

    @And("^ i Check in to the building$")
    public void iCheckInToTheBuilding() throws Throwable {
        throw new PendingException();
    }

    @And("^ i Upload Worksheet Document after work completion$")
    public void iUploadWorksheetDocumentAfterWorkCompletion() throws Throwable {
        throw new PendingException();
    }



}