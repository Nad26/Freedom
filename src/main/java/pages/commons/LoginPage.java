package pages.commons;

import base.BasePage;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.buildingportal.BuildingHomePage;
import pages.buildingportal.BuildingListPage;
import pages.mainportal.MainHomePage;
import pages.quotesportal.QuotesHomePage;


import java.io.IOException;

import static org.awaitility.Awaitility.await;

public class LoginPage extends BasePage {

    private final String pageUrl = "/#";
    private final String pageLoadedText = "Reset password";
    @FindBy(id = "txtGlobalSearch")
    @CacheLookup
    private WebElement developmentDevf1Apollosql1;
    @FindBy(id = "txtGlobalSearch")
    @CacheLookup
    private WebElement developmentDevf1Apollosql2;
    @FindBy(name = "mobile")
    @CacheLookup
    private WebElement txt_id;
    @FindBy(name = "password")
    @CacheLookup
    private WebElement txt_password;
    @FindBy(id = "resetMobile")
    @CacheLookup
    private WebElement developmentDevf1Apollosql5;
    @FindBy(css = "a.link.list-group-item")
    @CacheLookup
    private WebElement logOut;
    @FindBy(css = "a[href='logout']")
    @CacheLookup
    private WebElement logout;
    @FindBy(name = "MainProfile")
    @CacheLookup
    private WebElement profile;
    @FindBy(id = "resendPass")
    @CacheLookup
    private WebElement resendPincode;
    @FindBy(id = "resetPassword")
    @CacheLookup
    private WebElement resetPassword;
    @FindBy(name = "MainSetup")
    @CacheLookup
    private WebElement setup2;
    @FindBy(id = "login-btn")
    @CacheLookup
    private WebElement signIn;

    public LoginPage() throws Exception {
    }

    /**
     * Verify that the page loaded completely.
     */
    @Override
    public boolean isPageLoaded() {
        try {
            (new WebDriverWait(driver, 15)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return d.getPageSource().contains(pageLoadedText);
                }});
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPageDisplayed() {
        return signIn.isDisplayed();
    }

    /**
     * Click on Log Out Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Log in Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickSignInButton() throws IOException, InterruptedException {
        clickWhenReady(signIn);
        return this;
    }

    /**
     * Click on Profile Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickProfileLink() throws IOException, InterruptedException {
        clickWhenReady(profile);
        return this;
    }


    /**
     * Click on Resend Pincode Button.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickResendPincodeButton() throws IOException, InterruptedException {
        clickWhenReady(resendPincode);
        return this;
    }

    /**
     * Click on Reset Password Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickResetPasswordLink() throws IOException, InterruptedException {
        clickWhenReady(resetPassword);
        return this;
    }


    /**
     * Click on Sign In Button.
     *
     * @return the Main Home page class instance.
     */
    public MainHomePage iLogInToMainPortal(String id, String pass) throws Exception {
        setValue(txt_id, id);
        setValue(txt_password, pass);
        clickWhenReady(signIn);
        return getInstance(MainHomePage.class);
    }

    /**
     * Click on Sign In Button.
     *
     * @return the Building Home page class instance.
     */
    public BuildingHomePage iLogInToBuildingPortal(String id, String pass) throws Exception {
        setValue(txt_id, id);
        setValue(txt_password, pass);
        clickWhenReady(signIn);
        return getInstance(BuildingHomePage.class);
    }


    /**
     * Enter userName
     *
     * @return the LoginPage class instance.
     */
    public LoginPage enterUserId(String id) throws Exception {
        setValue(txt_id, id);
        return this;
    }

    /**
     * Enter password
     *
     * @return the LoginPage class instance.
     */
    public LoginPage enterPassword(String pass) throws Exception {
        setValue(txt_password, pass);
        return this;
    }

    /**
     * User logs in
     *
     * @return the LoginPage class instance.
     */
    public BuildingListPage userLogsIn(String id, String pass) throws Exception {
        setValue(txt_id, id);
        setValue(txt_password, pass);
        clickWhenReady(signIn);
        return getInstance(BuildingListPage.class);
    }





}
