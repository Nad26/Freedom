package pages.buildingportal;


import java.io.IOException;

import base.BasePage;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import pages.contractorportal.ContractorListPage;

public class BuildingHomePage extends BasePage {


    public BuildingHomePage() throws Exception {
    }

    @FindBy(css = "a[title='Asset Purchase']")
    @CacheLookup
    private WebElement assetPurchase;

    @FindBy(css = "a[title='Budget']")
    @CacheLookup
    private WebElement budget;

    @FindBy(css = "a[title='building Care Tasks']")
    @CacheLookup
    private WebElement buildingCareTasks;

    @FindBy(id = "bpBuilding")
    @CacheLookup
    private WebElement buildingSettings;

    @FindBy(css = "a[href='/client']")
    @CacheLookup
    private WebElement clientPortal;

    @FindBy(id = "controlCenterClose")
    @CacheLookup
    private WebElement closeActionCenter;

    @FindBy(css = "a[href='/contractor']")
    @CacheLookup
    private WebElement contractorPortal;

    @FindBy(id = "bpEvents")
    @CacheLookup
    private WebElement events;

    @FindBy(css = "a[title='Financial Data']")
    @CacheLookup
    private WebElement financialData;

    @FindBy(css = "a[title='Help']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "#urgentMessage div div.link a")
    @CacheLookup
    private WebElement here1;

    @FindBy(css = "#action-urgent div a")
    @CacheLookup
    private WebElement here2;

    @FindBy(css = "a[title='Log a Task']")
    @CacheLookup
    private WebElement logATask;



    @FindBy(css = "div.btn.btn-danger.refusedYes")
    @CacheLookup
    private WebElement siteNotification_Yes;

    @FindBy(css = "a[title='Log Out']")
    @CacheLookup
    private WebElement logOut;

    @FindBy(css = "a[href='logout']")
    @CacheLookup
    private WebElement logout;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement mainPortal;

    @FindBy(css = "a[title='Maintenance Planner']")
    @CacheLookup
    private WebElement maintenancePlanner;

    @FindBy(id = "bpManagerAudits")
    @CacheLookup
    private WebElement ManagerAudits;

    @FindBy(css = "#googleMapsContainer div:nth-of-type(1) div.gm-style div:nth-of-type(4) div.gm-style-cc div:nth-of-type(2) a")
    @CacheLookup
    private WebElement mapData;

    @FindBy(id = "bpMail")
    @CacheLookup
    private WebElement messages;

    @FindBy(css = "a[title='My Assets']")
    @CacheLookup
    private WebElement myAssets;

    @FindBy(id = "bpNotifications")
    @CacheLookup
    private WebElement notifications;

    @FindBy(css = "h4.modal-title")
    @CacheLookup
    private WebElement siteNotificationModal;

    @FindBy(css = "h5.modal-title")
    @CacheLookup
    private WebElement actionCenterModal;

    @FindBy(css = "button.dismissButton")
    @CacheLookup
    private WebElement ok;

    private final String pageLoadedText = "DEVELOPMENT ( dev-f1 apollo-sql";

    private final String pageUrl = "/building#D74B9B91-5167-466C-8FD7-13A22256067F/home";

    @FindBy(css = "a[title='Report errors in the road map or imagery to Google']")
    @CacheLookup
    private WebElement reportAMapError;

    @FindBy(id = "bpBuildingStatus")
    @CacheLookup
    private WebElement restaurantStatus;

    @FindBy(css = "a[title='Site Documents']")
    @CacheLookup
    private WebElement siteDocuments;

    @FindBy(css = "a[title='Task List']")
    @CacheLookup
    private WebElement taskList;

    @FindBy(css = "a[href='https://www.google.com/intl/en-GB_US/help/terms_maps.html']")
    @CacheLookup
    private WebElement termsOfUse;

    @FindBy(name = "MainProfile")
    @CacheLookup
    private WebElement profile;

    @FindBy(css = "#portalHeader div div.mobileSlidingMenu div section.bp-menu.mobile-menu-sliding.off.out.ps ul.menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement contractorPortal1;

    @FindBy(css = "li.hidden-phone.dropdown.mobile-dropdown > a.dropdown-toggle > b.caret")
    @CacheLookup
    private WebElement userDropDown;

    @FindBy(css = "#portalHeader div div.mobileSlidingMenu div section.bp-menu.mobile-menu-sliding.off.out.ps ul.menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement clientPortal1;

    @FindBy(css = "#mainNavBar div.container-fluid nav.navbar-collapse.bs-navbar-collapse.menulinks.hidden-phone " +
            "ul.nav.navbar-nav.unfloat-tablet li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement clientPortal2;

    @FindBy(css = "div.panel-heading")
    @CacheLookup
    private WebElement panelHeading;

    @FindBy(css = "#showPhotoModal div.modal-dialog div.modal-content div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement close2;

    @FindBy(id = "headingOne")
    @CacheLookup
    private WebElement taskNbr;


    /**
     * Click on Contractor Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public ContractorListPage clickContractorPortal1Link() throws IOException, InterruptedException {
        clickWhenReady(contractorPortal1);
        return getInstance(ContractorListPage.class);
    }

    /**
     * Click on Client Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickClientPortal1Link() throws IOException, InterruptedException {
        clickWhenReady(clientPortal1);
        return this;
    }


    /**
     * Click on Client Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickClientPortal2Link() throws IOException, InterruptedException {
        clickWhenReady(clientPortal2);
        return this;
    }


    /**
     * Click on Asset Purchase Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickAssetPurchaseLink() throws IOException, InterruptedException {
        clickWhenReady(assetPurchase);
        return this;
    }

    /**
     * Click on Budget Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickBudgetLink() throws IOException, InterruptedException {
        clickWhenReady(budget);
        return this;
    }

    /**
     * Click on building Care Tasks Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickBuildingCareTasksLink() throws IOException, InterruptedException {
        clickWhenReady(buildingCareTasks);
        return this;
    }

    /**
     * Click on building Settings Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickBuildingSettingsLink() throws IOException, InterruptedException {
        clickWhenReady(buildingSettings);
        return this;
    }

    /**
     * Click on Client Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickClientPortalLink() throws IOException, InterruptedException {
        clickWhenReady(clientPortal);
        return this;
    }

    /**
     *
     * @return String.
     */
    public String getTaskNbr() throws IOException, InterruptedException {

        return taskNbr.getText();
    }


    /**
     * Click on Close Action Center Button.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickCloseActionCenterButton() throws IOException, InterruptedException {
        clickWhenReady(closeActionCenter);
        return this;
    }

    /**
     * Click on Contractor Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickContractorPortalLink() throws IOException, InterruptedException {
        clickWhenReady(contractorPortal);
        return this;
    }


    /**
     * Click on Events Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickEvents58Link() throws IOException, InterruptedException {
        clickWhenReady(events);
        return this;
    }

    /**
     * Click on Financial Data Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickFinancialDataLink() throws IOException, InterruptedException {
        clickWhenReady(financialData);
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickHelpLink() throws IOException, InterruptedException {
        clickWhenReady(help);
        return this;
    }

    /**
     * Click on Log A Task Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public TaskLogPage clickLogATaskLink() throws IOException, InterruptedException {
        clickWhenReady(logATask);
        return getInstance(TaskLogPage.class);
    }


    /**
     * Answer Yes in Site notification.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickYes() throws IOException, InterruptedException {
        clickWhenReady(siteNotification_Yes);
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickLogOutLink() throws IOException, InterruptedException {
        clickWhenReady(logOut);
        return this;
    }

    /**
     * Click on Main Portal Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickMainPortalLink() throws IOException, InterruptedException {
        clickWhenReady(mainPortal);
        return this;
    }

    /**
     * Click on Maintenance Planner Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickMaintenancePlannerLink() throws IOException, InterruptedException {
        clickWhenReady(maintenancePlanner);
        return this;
    }

    /**
     * Click on Manager Audits 353 Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickManagerAuditsLink() throws IOException, InterruptedException {
        clickWhenReady(ManagerAudits);
        return this;
    }

    /**
     * Click on Map Data Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickMapDataLink() throws IOException, InterruptedException {
        clickWhenReady(mapData);
        return this;
    }

    /**
     * Click on Messages 0 Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickmessagesLink() throws IOException, InterruptedException {
        clickWhenReady(messages);
        return this;
    }


    /**
     * Click on My Assets Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickMyAssetsLink() throws IOException, InterruptedException {
        clickWhenReady(myAssets);
        return this;
    }

    /**
     * Click on Notifications Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickNotificationsLink() throws IOException, InterruptedException {
        clickWhenReady(notifications);
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickOkButton() throws IOException, InterruptedException {
        clickWhenReady(ok);
        return this;
    }

    /**
     * Click on Report A Map Error Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickReportAMapErrorLink() throws IOException, InterruptedException {
        clickWhenReady(reportAMapError);
        return this;
    }

    /**
     * Click on Restaurant Status Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickRestaurantStatusLink() throws IOException, InterruptedException {
        clickWhenReady(restaurantStatus);
        return this;
    }


    /**
     * Click on Site Documents Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickSiteDocumentsLink() throws IOException, InterruptedException {
        clickWhenReady(siteDocuments);
        return this;
    }


    /**
     * Click on Task List Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickTaskListLink() throws IOException, InterruptedException {
        clickWhenReady(taskList);
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the BuildingHomePage class instance.
     */
    public BuildingHomePage clickTermsOfUseLink() throws IOException, InterruptedException {
        clickWhenReady(termsOfUse);
        return this;
    }

    @Override
    public boolean isPageLoaded() {
        return false;
    }


    public boolean isSiteNotificationModalDisplayed() {
        return siteNotificationModal.isDisplayed();
    }

    public boolean isSiteActionsModalDisplayed() {
        return actionCenterModal.isDisplayed();
    }

//Action Center - Accrington DT
}
