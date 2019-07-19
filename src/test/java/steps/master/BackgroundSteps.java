package steps.master;

import base.BaseDriver;
import base.BasePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.buildingportal.BuildingHomePage;
import pages.buildingportal.BuildingListPage;
import pages.commons.LoginPage;
import pages.mainportal.MainHomePage;
import pages.mainportal.MainTaskCardPage;

import java.io.IOException;

import static base.BasePage.getPassword;
import static org.assertj.core.api.Assertions.assertThat;

public class BackgroundSteps extends BaseDriver {

    BasePage page = new BasePage();
    public BackgroundSteps() throws Exception {
    }
    
    String user = read.getUserName();
    String pass = getPassword();
    

    @Given("^i login to the main portal \"([^\"]*)\"$")
    public void iLoginToTheMainPortal(String strArg1) throws Throwable {
        getDriver().get(read.getAppUrl(""));
        page.getInstance(LoginPage.class)
                .iLogInToMainPortal(user, pass)
                .isClientListDisplayed();

    }
    @When("^i search and open the required client \"([^\"]*)\" logged task \"([^\"]*)\"$")
    public void iSearchAndOpenTheRequiredClientLoggedTask(String arg0, String arg1) throws Throwable {

        page.getInstance(MainHomePage.class)
                .iSelectAClient(arg0)
                .iClickHelpDesk()
                .iClickAllTasksLink()
                .iSearchForTaskUsingName("154867")
                .iSelectTask("154867");

    }

    @Given("^User logs in to \"([^\"]*)\" portal$")
    public void userLogsInToPortal(String arg0) throws Throwable {
        getDriver().get(read.getAppUrl(arg0));
        page.getInstance(LoginPage.class)
                .iLogInToMainPortal(user, pass);
    }

    @And("^User Logs in$")
    public void userLogsIn() throws Exception {
        page.getInstance(LoginPage.class)
                .iLogInToBuildingPortal(user, pass);
        Thread.sleep(2000);
    }

    @When("^User select the Building \"([^\"]*)\"$")
    public void userSelectTheBuilding(String arg) throws Exception {
        page.getInstance(BuildingListPage.class).selectBuilding("Accrington DT");
        Thread.sleep(2000);
    }

    @And("^The Actions center modal is displayed$")
    public void theActionsCenterModalIsDisplayed() {
        assertThat(page.getInstance(BuildingHomePage.class)
                .isSiteActionsModalDisplayed())
                .isTrue();

    }

    @And("^User closes the Action Center Modal$")
    public void userClosesTheActionCenterModal() throws InterruptedException, IOException {
        page.getInstance(BuildingHomePage.class)
                .clickCloseActionCenterButton();
        Thread.sleep(2000);
    }


    @Then("^the task is displayed$")
    public void theTaskIsDisplayed() throws Exception {
        page.getInstance(MainTaskCardPage.class)
                .isTaskOpened("221212");
    }


}
