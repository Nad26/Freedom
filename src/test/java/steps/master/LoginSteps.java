package steps.master;



import base.BaseDriver;
import config.PropertyReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.buildingportal.BuildingHomePage;
import pages.commons.LoginPage;
import pages.mainportal.MainHomePage;

import java.io.IOException;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class LoginSteps extends BaseDriver {


    public LoginSteps() throws IOException {
    }


    @Given("^User goes to Main URL \"([^\"]*)\"$")
    public void userGoesToMainURL(String arg0) throws Throwable {
        getDriver().get(read.getAppUrl(""));
    }

    @When("^User is on the login screen$")
    public void User_is_on_the_login_screen() throws Throwable {
        System.out.println("user is on the login Screen and URL is ");
    }

    @And("^User enters mobile number$")
    public void User_enters_mobile_number() throws Throwable {
      getInstance(LoginPage.class).enterUserId(read.getData("user"));
    }

    @And("^User enters password$")
    public void User_enters_password() throws Throwable {
      getInstance(LoginPage.class).enterPassword(read.getData("pass"));
    }

    @And("^User clicks sign in$")
    public void User_clicks_sign_in() throws Throwable {
       getInstance(LoginPage.class).clickSignInButton();
    }

    @Then("^The freedom home screen should be displayed$")
    public void the_freedom_home_screen_should_be_displayed() throws Throwable {
       getInstance(MainHomePage.class).isPageLoaded();
    }

    @Then("^User clicks logout$")
    public void User_clicks_logout() throws Throwable {
       getInstance(BuildingHomePage.class).clickLogOutLink();
    }

    @And("^User enters incorrect password$")
    public void User_enters_incorrect_password() throws Throwable {
       getInstance(LoginPage.class).enterPassword("0000");
    }

    @Then("^The freedom home screen should not be displayed$")
    public void the_freedom_home_screen_should_not_be_displayed() throws Throwable {
        assertFalse(getInstance(MainHomePage.class).isPageLoaded());
    }


}
