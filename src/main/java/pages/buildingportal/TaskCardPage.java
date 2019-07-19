package pages.buildingportal;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import base.BasePage;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskCardPage extends BasePage {

    @FindBy(id = "headerCollapseOne")
    @CacheLookup
    private WebElement ac221243e;

    @FindBy(css = "a[title='Asset Purchase']")
    @CacheLookup
    private WebElement assetPurchase;

    @FindBy(css = "a.Secondary")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "a[title='Budget']")
    @CacheLookup
    private WebElement budget;

    @FindBy(css = "a[title='Building Care Tasks']")
    @CacheLookup
    private WebElement buildingCareTasks;

    @FindBy(id = "bpBuilding")
    @CacheLookup
    private WebElement buildingSettings;

    @FindBy(css = "a[href='/client']")
    @CacheLookup
    private WebElement clientPortal;


    @FindBy(css = "a[href='/contractor']")
    @CacheLookup
    private WebElement contractorPortal;

    @FindBy(id = "headerCollapseThree")
    @CacheLookup
    private WebElement enquiryDetailsRaised14Days;

    @FindBy(css = "#helpdeskTaskCardTab li:nth-of-type(1) a.taskCardTab")
    @CacheLookup
    private WebElement events1;

    @FindBy(css = "#taskTabs div.tab-content a:nth-of-type(1)")
    @CacheLookup
    private WebElement events2;

    @FindBy(id = "bpEvents")
    @CacheLookup
    private WebElement events79;

    @FindBy(css = "a[title='Financial Data']")
    @CacheLookup
    private WebElement financialData;

    @FindBy(css = "a[title='Help']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[title='Log a Task']")
    @CacheLookup
    private WebElement logATask;

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
    private WebElement managerAudits358;

    @FindBy(id = "bpMail")
    @CacheLookup
    private WebElement messages0;

    @FindBy(css = "a[title='My Assets']")
    @CacheLookup
    private WebElement myAssets;

    @FindBy(css = "a[href='#EC1FBCA0-7CA9-4380-A070-D90A3514508D/building/assets/D74B9B91-5167-466C-8FD7-13A22256067F']")
    @CacheLookup
    private WebElement na;

    @FindBy(id = "bpNotifications")
    @CacheLookup
    private WebElement notifications;

    private final String pageLoadedText = "No power\" data-html=\"true\">";

    private final String pageUrl = "/building#D74B9B91-5167-466C-8FD7-13A22256067F/task/62230E5F-E1E8-437B-85E9-946E05E83E88/?tab=taskQuotes";

    @FindBy(css = "#helpdeskTaskCardTab li:nth-of-type(2) a.taskCardTab")
    @CacheLookup
    private WebElement photos1;

    @FindBy(css = "#taskTabs div.tab-content a:nth-of-type(2)")
    @CacheLookup
    private WebElement photos2;

    @FindBy(css = "#helpdeskTaskCardTab li:nth-of-type(4) a.taskCardTab")
    @CacheLookup
    private WebElement quotes1;

    @FindBy(css = "a.collapsible-tab-heading.expanded")
    @CacheLookup
    private WebElement quotes2;

    @FindBy(id = "bpBuildingStatus")
    @CacheLookup
    private WebElement restaurantStatus;

    @FindBy(css = "a[title='Site Documents']")
    @CacheLookup
    private WebElement siteDocuments;

    @FindBy(css = "a[href='#D74B9B91-5167-466C-8FD7-13A22256067F/task/E15DD474-8220-4054-B2CD-153064E395C6']")
    @CacheLookup
    private WebElement task221212;

    @FindBy(id = "headerCollapseTwo")
    @CacheLookup
    private WebElement taskDescription;

    @FindBy(css = "#helpdeskTaskCardTab li:nth-of-type(3) a.taskCardTab")
    @CacheLookup
    private WebElement taskDocuments1;

    @FindBy(css = "#taskTabs div.tab-content a:nth-of-type(3)")
    @CacheLookup
    private WebElement taskDocuments2;

    @FindBy(css = "a[title='Task List']")
    @CacheLookup
    private WebElement taskList1;

    @FindBy(css = "a[href='#D74B9B91-5167-466C-8FD7-13A22256067F/taskList']")
    @CacheLookup
    private WebElement taskList2;

    public TaskCardPage() throws IOException {
    }


    /**
     * Click on Asset Purchase Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickAssetPurchaseLink() {
        assetPurchase.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Budget Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickBudgetLink() {
        budget.click();
        return this;
    }

    /**
     * Click on Building Care Tasks Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickBuildingCareTasksLink() {
        buildingCareTasks.click();
        return this;
    }

    /**
     * Click on Building Settings Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickBuildingSettingsLink() {
        buildingSettings.click();
        return this;
    }

    /**
     * Click on Client Portal Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickClientPortalLink() {
        clientPortal.click();
        return this;
    }


    /**
     * Click on Contractor Portal Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickContractorPortalLink() {
        contractorPortal.click();
        return this;
    }

    /**
     * Click on Enquiry Details Raised 14 Days Ago Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickEnquiryDetailsRaised14DaysLink() {
        enquiryDetailsRaised14Days.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickEvents1Link() {
        events1.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickEvents2Link() {
        events2.click();
        return this;
    }

    /**
     * Click on Events 79 Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickEvents79Link() {
        events79.click();
        return this;
    }

    /**
     * Click on Financial Data Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickFinancialDataLink() {
        financialData.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickHelpLink() {
        help.click();
        return this;
    }


    /**
     * Click on Log A Task Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickLogATaskLink() {
        logATask.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Logout Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickLogoutLink() {
        logout.click();
        return this;
    }

    /**
     * Click on Main Portal Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickMainPortalLink() {
        mainPortal.click();
        return this;
    }

    /**
     * Click on Maintenance Planner Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickMaintenancePlannerLink() {
        maintenancePlanner.click();
        return this;
    }

    /**
     * Click on Manager Audits 358 Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickManagerAudits358Link() {
        managerAudits358.click();
        return this;
    }

    /**
     * Click on Messages 0 Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickMessages0Link() {
        messages0.click();
        return this;
    }

    /**
     * Click on My Assets Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickMyAssetsLink() {
        myAssets.click();
        return this;
    }

    /**
     * Click on Na Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickNaLink() {
        na.click();
        return this;
    }

    /**
     * Click on Notifications Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickNotificationsLink() {
        notifications.click();
        return this;
    }

    /**
     * Click on Photos Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickPhotos1Link() {
        photos1.click();
        return this;
    }

    /**
     * Click on Photos Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickPhotos2Link() {
        photos2.click();
        return this;
    }

    /**
     * Click on Quotes Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickQuotes1Link() {
        quotes1.click();
        return this;
    }

    /**
     * Click on Quotes Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickQuotes2Link() {
        quotes2.click();
        return this;
    }

    /**
     * Click on Restaurant Status Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickRestaurantStatusLink() {
        restaurantStatus.click();
        return this;
    }

    /**
     * Click on Site Documents Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickSiteDocumentsLink() {
        siteDocuments.click();
        return this;
    }

    /**
     * Click on Task221212 Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage getTaskId() {
        task221212.click();
        return this;
    }

    /**
     * Click on Task Description Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickTaskDescriptionLink() {
        taskDescription.click();
        return this;
    }

    /**
     * Click on Task Documents Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickTaskDocuments1Link() {
        taskDocuments1.click();
        return this;
    }

    /**
     * Click on Task Documents Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickTaskDocuments2Link() {
        taskDocuments2.click();
        return this;
    }

    /**
     * Click on Task List Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickTaskList1Link() {
        taskList1.click();
        return this;
    }

    /**
     * Click on Task List Link.
     *
     * @return the TaskCardPage class instance.
     */
    public TaskCardPage clickTaskList2Link() {
        taskList2.click();
        return this;
    }


}
