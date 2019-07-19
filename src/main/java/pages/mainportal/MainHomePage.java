package pages.mainportal;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import base.BasePage;
import com.google.protobuf.DescriptorProtos;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.buildingportal.TaskLogPage;
import pages.commons.TaskListPage;
import pages.mainportal.MainTaskCardPage;

public class MainHomePage extends BasePage {


    @FindBy(id = "myTasks")
    @CacheLookup
    private WebElement link_myTasks;

    @FindBy(id = "myBuildings")
    @CacheLookup
    private WebElement link_myBuildings;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/acceptedToday']")
    @CacheLookup
    private WebElement link_accepted;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/evAckToday']")
    @CacheLookup
    private WebElement link_ackToday;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/eventActionRequired']")
    @CacheLookup
    private WebElement link_actionRequired;

    @FindBy(linkText = "All Tasks")
    @CacheLookup
    private WebElement link_allTasks;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/approvedGnfr']")
    @CacheLookup
    private WebElement link_approvedGnfrs;

    @FindBy(id = "39C628BD-293A-41D8-A4EA-DAA7CE1CA70C")
    @CacheLookup
    private WebElement link_ask;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unacknowledgedAudits']")
    @CacheLookup
    private WebElement link_audits;

    @FindBy(id = "990D0F18-44C0-484A-9F6D-BD21DE1DB802")
    @CacheLookup
    private WebElement link_axa;

    @FindBy(id = "9E0D02A6-2993-4BB9-A7EE-1615AC7531BB")
    @CacheLookup
    private WebElement link_bpp;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/breachedTasks']")
    @CacheLookup
    private WebElement link_breachedTasks;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/businessCritical']")
    @CacheLookup
    private WebElement link_businessCritical;

    @FindBy(css = "#divHelpdesk div:nth-of-type(11) ul.list-group a:nth-of-type(3)")
    @CacheLookup
    private WebElement link_callBacks;

    @FindBy(css = "#divHelpdesk div:nth-of-type(3) ul.list-group a:nth-of-type(2)")
    @CacheLookup
    private WebElement link_callbacks;

    @FindBy(id = "70A4C400-EFCB-4E13-A402-5DCA0CC8B21D")
    @CacheLookup
    private WebElement link_centralHall;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/PPM_certificateAge']")
    @CacheLookup
    private WebElement link_certificateAge;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/cleanseBay']")
    @CacheLookup
    private WebElement link_cleanseBay;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/cleanseBayInProgress']")
    @CacheLookup
    private WebElement link_cleanseBayInProgress;

    @FindBy(css = "#portalHeader div div.mobileSlidingMenu div.expanded section.bp-menu.mobile-menu-sliding.off.out.ps ul.menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement link_clientPortal1;

    @FindBy(css = "#mainNavBar div.container-fluid nav.navbar-collapse.bs-navbar-collapse.menulinks.hidden-phone ul.nav.navbar-nav.unfloat-tablet li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement link_clientPortal2;

    @FindBy(css = "#showPhotoModal div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement link_close1;

    @FindBy(css = "#showPhotoModal div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement link_close2;

    @FindBy(id = "848F19CB-ECFD-4989-871B-256D39B49331")
    @CacheLookup
    private WebElement link_cloudfmProperty;

    @FindBy(id = "F3247638-ADBA-4973-B5E4-D3715DE970DD")
    @CacheLookup
    private WebElement link_coast;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/completedToday']")
    @CacheLookup
    private WebElement link_completed;

    @FindBy(xpath = "//a[contains(text(),'Contractor Portal')]")
    @CacheLookup
    private WebElement link_contractorPortal;

    @FindBy(xpath = "//li[3]/ul/li")
    @CacheLookup
    private List<WebElement> list_portalList;

    @FindBy(id = "774D0384-7DF3-42C2-911A-A365546465E2")
    @CacheLookup
    private WebElement link_demo;

    @FindBy(id = "txtGlobalSearch")
    @CacheLookup
    private WebElement link_dragHereToAddToWatch1;

    @FindBy(id = "txtGlobalSearch")
    @CacheLookup
    private WebElement link_dragHereToAddToWatch2;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/EHO']")
    @CacheLookup
    private WebElement link_ehoqs;

    @FindBy(css = "#divHelpdesk div:nth-of-type(2) ul.list-group a:nth-of-type(8)")
    @CacheLookup
    private WebElement link_evRed;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unackEventsPPM']")
    @CacheLookup
    private WebElement link_events;

    @FindBy(name = "FACTReporting")
    @CacheLookup
    private WebElement link_factReporting;

    @FindBy(id = "FF603CA8-9743-4FE0-8CD7-7E25931FEB12")
    @CacheLookup
    private WebElement link_guardian;

    @FindBy(id = "0CDA095B-BFD9-4AF4-BDC3-1B1C882BB240")
    @CacheLookup
    private WebElement link_herbert;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/highVolumeEvents']")
    @CacheLookup
    private WebElement link_highVolumeEvents;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/taskHolding']")
    @CacheLookup
    private WebElement link_holdingBay;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/home']")
    @CacheLookup
    private WebElement link_home;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/4hUnattended']")
    @CacheLookup
    private WebElement link_hrUnattended4;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/healthAndSafety']")
    @CacheLookup
    private WebElement link_hsIssue;

    @FindBy(id = "5AAFB63B-F0B2-43C5-ACEE-C5FC461E6D1E")
    @CacheLookup
    private WebElement link_inchcape;

    @FindBy(id = "4C03D7C5-B99B-4C8D-8441-CB76621863AF")
    @CacheLookup
    private WebElement link_karenMillen;

    @FindBy(id = "F051AD19-72FF-4559-86B8-09D16A5411B2")
    @CacheLookup
    private WebElement link_kefco;

    @FindBy(css = "div.panel-body.panel-body-lesspadding > #EC1FBCA0-7CA9-4380-A070-D90A3514508D")
    @CacheLookup
    private WebElement link_kfc;

    @FindBy(id = "6B4798C9-5B97-4A02-80D9-54AA5C1613AD")
    @CacheLookup
    private WebElement link_krispyKreme;

    @FindBy(css = "a.link.list-group-item")
    @CacheLookup
    private WebElement link_logOut;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/logtask']")
    @CacheLookup
    private WebElement link_logTask;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/loggedToday']")
    @CacheLookup
    private WebElement link_logged;

    @FindBy(css = "a[href='logout']")
    @CacheLookup
    private WebElement link_logout1;

    @FindBy(css = "a[href='#logOut']")
    @CacheLookup
    private WebElement link_logout2;

    @FindBy(css = "#mainNavBar div.container-fluid nav.navbar-collapse.bs-navbar-collapse.menulinks.hidden-phone ul.nav.navbar-nav.unfloat-tablet li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    private WebElement link_mainPortal;

    @FindBy(css = "#portalHeader div div.mobileSlidingMenu div.expanded section.bp-menu.mobile-menu-sliding.off.out.ps ul.menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement link_monitor1;

    @FindBy(name = "MainMonitor")
    @CacheLookup
    private WebElement link_monitor2;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/qrNoAlt']")
    @CacheLookup
    private WebElement link_noInvite;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/qrNoEnquiry']")
    @CacheLookup
    private WebElement link_noRequests;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/notTrading']")
    @CacheLookup
    private WebElement link_notTrading;

    @FindBy(id = "B3462C96-76A0-4169-9257-1CA1BEEEF3BE")
    @CacheLookup
    private WebElement link_oasis;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unackClipboard']")
    @CacheLookup
    private WebElement link_oddJobsUnack;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/openTasks']")
    @CacheLookup
    private WebElement link_openTasks;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/paymentHold']")
    @CacheLookup
    private WebElement link_paymentHold;

    @FindBy(id = "255F0CB7-AE58-4BF6-B4D4-D870DEC1AA9F")
    @CacheLookup
    private WebElement link_pizzaExpress;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/poDocPending']")
    @CacheLookup
    private WebElement link_poVerify;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/PPM_wipMonth']")
    @CacheLookup
    private WebElement link_ppmCurrent;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/PPM_overdue']")
    @CacheLookup
    private WebElement link_ppmOverdue;

    @FindBy(id = "F029EA30-5227-4BB6-BBDB-995A56A433A0")
    @CacheLookup
    private WebElement link_prezzo;

    @FindBy(name = "MainProfile")
    @CacheLookup
    private WebElement link_profile;

    @FindBy(id = "89B00AA5-EFE3-479C-B34B-F6724EBFC43E")
    @CacheLookup
    private WebElement link_queensway;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/loggedTodayQuoteRequest']")
    @CacheLookup
    private WebElement link_quoteRequest;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/loggedTodayQuotedWorks']")
    @CacheLookup
    private WebElement link_quoted;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/restrictedTrading']")
    @CacheLookup
    private WebElement link_restrictedTrading;

    @FindBy(css = "#showPhotoModal div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement link_rotate1;

    @FindBy(css = "#showPhotoModal div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement link_rotate2;

    @FindBy(css = "#portalHeader div div.mobileSlidingMenu div.expanded section.bp-menu.mobile-menu-sliding.off.out.ps ul.menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement link_setup1;

    @FindBy(name = "MainSetup")
    @CacheLookup
    private WebElement link_setup2;

    @FindBy(id = "CFB04299-82D3-49E9-906F-EF2D52C7C9A5")
    @CacheLookup
    private WebElement link_shelter;

    @FindBy(id = "D5C7E192-A7C6-4370-9203-80C8C658FAFB")
    @CacheLookup
    private WebElement link_splendid;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/technicalChallenge']")
    @CacheLookup
    private WebElement link_tech;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/technicalReview']")
    @CacheLookup
    private WebElement link_technicalReview;

    @FindBy(id = "FDB5E09F-6625-43D7-A455-7639F2DA14B6")
    @CacheLookup
    private WebElement link_theRange;

    @FindBy(css = "a.darkTheme")
    @CacheLookup
    private WebElement link_toggleLightDarkTheme;

    @FindBy(id = "199BD65C-31B0-4D6E-B43C-DC9415E72410")
    @CacheLookup
    private WebElement link_tui;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/acceptAlarm']")
    @CacheLookup
    private WebElement link_unaccepted;

    @FindBy(css = "#divHelpdesk div:nth-of-type(2) ul.list-group a:nth-of-type(9)")
    @CacheLookup
    private WebElement link_unacknowledged1;

    @FindBy(css = "#divHelpdesk div:nth-of-type(11) ul.list-group a:nth-of-type(2)")
    @CacheLookup
    private WebElement link_unacknowledged2;

    @FindBy(css = "#divHelpdesk div:nth-of-type(11) ul.list-group a:nth-of-type(1)")
    @CacheLookup
    private WebElement link_unacknowledgedRed;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unreleased']")
    @CacheLookup
    private WebElement link_unassigned;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unreleasedHolding']")
    @CacheLookup
    private WebElement link_unassignedOnHold;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/unattended']")
    @CacheLookup
    private WebElement link_unattended;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/PPM_compliancyTasksUncheckedContractor']")
    @CacheLookup
    private WebElement link_uncheckedContractor;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/PPM_unverifiedCerts']")
    @CacheLookup
    private WebElement link_unverifiedCerts;

    @FindBy(css = "a[href='#774D0384-7DF3-42C2-911A-A365546465E2/helpdesk/stat/upliftEvents']")
    @CacheLookup
    private WebElement link_upliftEvents;

    @FindBy(id = "2CB01ED9-B8A9-41F5-A7E4-339F812A0684")
    @CacheLookup
    private WebElement link_warehouse;

    @FindBy(id = "73ECA69F-2012-46BD-9536-87C0B27B2376")
    @CacheLookup
    private WebElement link_wolseley;

    @FindBy(id = "D074D4DA-E16C-4585-9662-B468557EC16A")
    @CacheLookup
    private WebElement link_wolseleyRetail;

    @FindBy(id = "C1E9F083-9CF9-47FD-8A7F-6017921499FD")
    @CacheLookup
    private WebElement link_zizzi;

    public MainHomePage() throws IOException {
    }

    @FindBy(xpath = "(//img[@id='imgSelectedClient'])[8]")
    @CacheLookup
    private List<WebElement> clientImg;

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Select a Client'])[1]/following::div[1]")
    @CacheLookup
    private WebElement panel_clientList;

    @FindBy(linkText = "Client Helpdesk")
    @CacheLookup
    private WebElement btn_ClientHelpdesk;

    /**
     *
     * @return true or false.
     */
    public boolean isClientListDisplayed() throws Exception {

        return verifyElement(panel_clientList)==true;
    }

    /**
     * i select a client
     *
     * @return this class instance.
     */
    public MainHomePage iSelectAClient(String clientName) throws IOException, InterruptedException {

        if (clientName.equals("kfc")) {
            clickWhenReady(link_kfc);
        }return this;
    }

    /**
     * i select a client
     *
     * @return this class instance.
     */
    public MainHomePage iClickHelpDesk() throws IOException, InterruptedException {

        clickWhenReady(btn_ClientHelpdesk);
        return this;
    }



    /**
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickMyTasksButton() throws IOException, InterruptedException {
        clickWhenReady(link_myTasks);
        return this;
    }

    /**
     *  iClick on 0 Button.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickBuildingsButton() {
        link_myBuildings.click();
        return this;
    }

    /**
     *  iClick on Accepted Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickAcceptedLink() {
        link_accepted.click();
        return this;
    }

    /**
     *  iClick on Ack Today Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickAckTodayLink() {
        link_ackToday.click();
        return this;
    }

    /**
     *  iClick on Action Required Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickActionRequiredLink() {
        link_actionRequired.click();
        return this;
    }

    /**
     *  iClick on All Tasks Link.
     *
     * @return the MainHomePage class instance.
     */
    public HelpDeskTaskListPage iClickAllTasksLink() throws IOException, InterruptedException {
        clickWhenReady(link_allTasks);
        return getInstance(HelpDeskTaskListPage.class);
    }

    /**
     *  iClick on Approved Gnfrs Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickApprovedGnfrsLink() {
        link_approvedGnfrs.click();
        return this;
    }

    /**
     *  iClick on Ask Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickAskLink() {
        link_ask.click();
        return this;
    }

    /**
     *  iClick on Audits Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickAuditsLink() {
        link_audits.click();
        return this;
    }

    /**
     *  iClick on Axa Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickAxaLink() {
        link_axa.click();
        return this;
    }

    /**
     *  iClick on Bpp Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickBppLink() {
        link_bpp.click();
        return this;
    }

    /**
     *  iClick on Breached Tasks Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickBreachedTasksLink() {
        link_breachedTasks.click();
        return this;
    }

    /**
     *  iClick on Business Critical Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickBusinessCriticalLink() {
        link_businessCritical.click();
        return this;
    }

    /**
     *  iClick on Call Backs Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCallBacksLink() {
        link_callBacks.click();
        return this;
    }

    /**
     *  iClick on Callbacks Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCallbacksLink() {
        link_callbacks.click();
        return this;
    }

    /**
     *  iClick on Central Hall Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCentralHallLink() {
        link_centralHall.click();
        return this;
    }

    /**
     *  iClick on Certificate Age Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCertificateAgeLink() {
        link_certificateAge.click();
        return this;
    }

    /**
     *  iClick on Cleanse Bay In Progress Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCleanseBayInProgressLink() {
        link_cleanseBayInProgress.click();
        return this;
    }

    /**
     *  iClick on Cleanse Bay Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCleanseBayLink() {
        link_cleanseBay.click();
        return this;
    }

    /**
     *  iClick on Client Portal Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickClientPortal1Link() {
        link_clientPortal1.click();
        return this;
    }

    /**
     *  iClick on Client Portal Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickClientPortal2Link() {
        link_clientPortal2.click();
        return this;
    }

    /**
     *  iClick on Close Button.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickClose1Button() {
        link_close1.click();
        return this;
    }

    /**
     *  iClick on Close Button.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickClose2Button() {
        link_close2.click();
        return this;
    }

    /**
     *  iClick on Cloudfm Property Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCloudfmPropertyLink() {
        link_cloudfmProperty.click();
        return this;
    }

    /**
     *  iClick on Coast Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCoastLink() {
        link_coast.click();
        return this;
    }

    /**
     *  iClick on Completed Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickCompletedLink() {
        link_completed.click();
        return this;
    }

    /**
     *  iClick on Contractor Portal Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickContractorPortal1Link() {
        link_contractorPortal.click();
        return this;
    }

    /**
     *  iClick on Contractor Portal Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPortalLinkViaMainPortal(String portal) throws InterruptedException, IOException {
        clickWhenReady(selOption(list_portalList,portal));
        return this;
    }

    /**
     *  iClick on Demo Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickDemoLink() {
        link_demo.click();
        return this;
    }

    /**
     *  iClick on Ehoqs Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickEhoqsLink() {
        link_ehoqs.click();
        return this;
    }

    /**
     *  iClick on Ev Red Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickEvRedLink() {
        link_evRed.click();
        return this;
    }

    /**
     *  iClick on Events Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickEventsLink() {
        link_events.click();
        return this;
    }

    /**
     *  iClick on Fact Reporting Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickFactReportingLink() {
        link_factReporting.click();
        return this;
    }

    /**
     *  iClick on Guardian Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickGuardianLink() {
        link_guardian.click();
        return this;
    }

    /**
     *  iClick on Herbert Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHerbertLink() {
        link_herbert.click();
        return this;
    }

    /**
     *  iClick on High Volume Events Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHighVolumeEventsLink() {
        link_highVolumeEvents.click();
        return this;
    }

    /**
     *  iClick on Holding Bay Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHoldingBayLink() {
        link_holdingBay.click();
        return this;
    }

    /**
     *  iClick on Home Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHomeLink() {
        link_home.click();
        return this;
    }

    /**
     *  iClick on 4hr Unattended Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHrUnattendedLink4() {
        link_hrUnattended4.click();
        return this;
    }

    /**
     *  iClick on Hs Issue Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickHsIssueLink() {
        link_hsIssue.click();
        return this;
    }

    /**
     *  iClick on Inchcape Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickInchcapeLink() {
        link_inchcape.click();
        return this;
    }

    /**
     *  iClick on Karen Millen Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickKarenMillenLink() {
        link_karenMillen.click();
        return this;
    }

    /**
     *  iClick on Kefco Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickKefcoLink() {
        link_kefco.click();
        return this;
    }

    /**
     *  iClick on Kfc Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickKfcLink() {
        link_kfc.click();
        return this;
    }

    /**
     *  iClick on Krispy Kreme Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickKrispyKremeLink() {
        link_krispyKreme.click();
        return this;
    }

    /**
     *  iClick on Log Out Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickLogOutLink() {
        link_logOut.click();
        return this;
    }

    /**
     *  iClick on Log Task Link.
     *
     * @return the MainHomePage class instance.
     */
    public TaskLogPage  iClickLogTaskLink() throws IOException, InterruptedException {
        clickWhenReady(link_logTask);
        return getInstance(TaskLogPage.class);
    }

    /**
     *  iClick on Logged Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickLoggedLink() {
        link_logged.click();
        return this;
    }

    /**
     *  iClick on Logout Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickLogout1Link() {
        link_logout1.click();
        return this;
    }

    /**
     *  iClick on Logout Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickLogout2Link() {
        link_logout2.click();
        return this;
    }

    /**
     *  iClick on Main Portal Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickMainPortalLink() {
        link_mainPortal.click();
        return this;
    }

    /**
     *  iClick on Monitor Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickMonitor1Link() {
        link_monitor1.click();
        return this;
    }

    /**
     *  iClick on Monitor Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickMonitor2Link() {
        link_monitor2.click();
        return this;
    }


    /**
     *  iClick on No Invite Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickNoInviteLink() {
        link_noInvite.click();
        return this;
    }

    /**
     *  iClick on No Requests Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickNoRequestsLink() {
        link_noRequests.click();
        return this;
    }

    /**
     *  iClick on Not Trading Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickNotTradingLink() {
        link_notTrading.click();
        return this;
    }

    /**
     *  iClick on Oasis Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickOasisLink() {
        link_oasis.click();
        return this;
    }

    /**
     *  iClick on Odd Jobs Unack. Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickOddJobsUnackLink() {
        link_oddJobsUnack.click();
        return this;
    }

    /**
     *  iClick on Open Tasks Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickOpenTasksLink() {
        link_openTasks.click();
        return this;
    }

    /**
     *  iClick on Payment Hold Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPaymentHoldLink() {
        link_paymentHold.click();
        return this;
    }

    /**
     *  iClick on Pizza Express Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPizzaExpressLink() {
        link_pizzaExpress.click();
        return this;
    }

    /**
     *  iClick on Po Verify Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPoVerifyLink() {
        link_poVerify.click();
        return this;
    }

    /**
     *  iClick on Ppm Current Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPpmCurrentLink() {
        link_ppmCurrent.click();
        return this;
    }

    /**
     *  iClick on Ppm Overdue Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPpmOverdueLink() {
        link_ppmOverdue.click();
        return this;
    }

    /**
     *  iClick on Prezzo Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickPrezzoLink() {
        link_prezzo.click();
        return this;
    }

    /**
     *  iClick on Profile Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickProfileLink() {
        link_profile.click();
        return this;
    }

    /**
     *  iClick on Queensway Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickQueenswayLink() {
        link_queensway.click();
        return this;
    }

    /**
     *  iClick on Quote Request Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickQuoteRequestLink() {
        link_quoteRequest.click();
        return this;
    }

    /**
     *  iClick on Quoted Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickQuotedLink() {
        link_quoted.click();
        return this;
    }

    /**
     *  iClick on Restricted Trading Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickRestrictedTradingLink() {
        link_restrictedTrading.click();
        return this;
    }

    /**
     *  iClick on Rotate Button.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickRotate1Button() {
        link_rotate1.click();
        return this;
    }

    /**
     *  iClick on Rotate Button.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickRotate2Button() {
        link_rotate2.click();
        return this;
    }

    /**
     *  iClick on Setup Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickSetup1Link() {
        link_setup1.click();
        return this;
    }


    /**
     *  iClick on Shelter Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickShelterLink() {
        link_shelter.click();
        return this;
    }

    /**
     *  iClick on Splendid Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickSplendidLink() {
        link_splendid.click();
        return this;
    }

    /**
     *  iClick on Tech Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickTechLink() {
        link_tech.click();
        return this;
    }

    /**
     *  iClick on Technical Review Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickTechnicalReviewLink() {
        link_technicalReview.click();
        return this;
    }

    /**
     *  iClick on The Range Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickTheRangeLink() {
        link_theRange.click();
        return this;
    }

    /**
     *  iClick on Toggle Light Dark Theme Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickToggleLightDarkThemeLink() {
        link_toggleLightDarkTheme.click();
        return this;
    }

    /**
     *  iClick on Tui Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickTuiLink() {
        link_tui.click();
        return this;
    }

    /**
     *  iClick on Unaccepted Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnacceptedLink() {
        link_unaccepted.click();
        return this;
    }

    /**
     *  iClick on Unacknowledged Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnacknowledged1Link() {
        link_unacknowledged1.click();
        return this;
    }

    /**
     *  iClick on Unacknowledged Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnacknowledged2Link() {
        link_unacknowledged2.click();
        return this;
    }

    /**
     *  iClick on Unacknowledged Red Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnacknowledgedRedLink() {
        link_unacknowledgedRed.click();
        return this;
    }

    /**
     *  iClick on Unassigned Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnassignedLink() {
        link_unassigned.click();
        return this;
    }

    /**
     *  iClick on Unassigned On Hold Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnassignedOnHoldLink() {
        link_unassignedOnHold.click();
        return this;
    }

    /**
     *  iClick on Unattended Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnattendedLink() {
        link_unattended.click();
        return this;
    }

    /**
     *  iClick on Unchecked Contractor Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUncheckedContractorLink() {
        link_uncheckedContractor.click();
        return this;
    }

    /**
     *  iClick on Unverified Certs Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUnverifiedCertsLink() {
        link_unverifiedCerts.click();
        return this;
    }

    /**
     *  iClick on Uplift Events Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickUpliftEventsLink() {
        link_upliftEvents.click();
        return this;
    }

    /**
     *  iClick on Warehouse Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickWarehouseLink() {
        link_warehouse.click();
        return this;
    }

    /**
     *  iClick on Wolseley Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickWolseleyLink() {
        link_wolseley.click();
        return this;
    }

    /**
     *  iClick on Wolseley Retail Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickWolseleyRetailLink() {
        link_wolseleyRetail.click();
        return this;
    }

    /**
     *  iClick on Zizzi Link.
     *
     * @return the MainHomePage class instance.
     */
    public MainHomePage  iClickZizziLink() {
        link_zizzi.click();
        return this;
    }


}
