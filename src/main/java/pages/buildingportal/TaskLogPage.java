package pages.buildingportal;

import java.io.IOException;
import java.util.List;

import base.BasePage;
import config.Log;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class TaskLogPage extends BasePage {


    @FindBy(id = "taskDated")
    @CacheLookup
    private WebElement dateTheWorkShouldCommence;

    @FindBy(xpath = "//div[@id='select2-drop']/div/input")
    @CacheLookup
    private WebElement txt_discipline1Search;

    @FindBy(id = "TSK_CALLER_POSITION")
    @CacheLookup
    private WebElement dropdown_jobTitle;

    @FindBy(xpath = "//li")
    @CacheLookup
    private WebElement listDisciplineOne;

    @FindBy(xpath = "//ul[contains(@class,'select2-results')]/li")
    @CacheLookup
    private List<WebElement> list_Discipline;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']/div[@id='disc4ID']/div/a/span[@role='presentation']")
    @CacheLookup
    private WebElement dropdown_Discipline4;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']/div[@id='disc3ID']/div/a/span[@role='presentation']")
    @CacheLookup
    private WebElement dropdown_Discipline3;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']/div[@id='disc2ID']/div/a/span[@role='presentation']")
    @CacheLookup
    private WebElement dropdown_Discipline2;

    @FindBy(xpath = "//div[@class='form-group col-sm-3']/div[@id='disc1ID']/div/a/span[@role='presentation']")
    @CacheLookup
    private WebElement dropdown_Discipline1;

    @FindBy(id = "assetLocation")
    @CacheLookup
    private WebElement dropdown_assetLocation;

    @FindBy(css = "#AccessEquipment > .togglebtn:nth-child(2)")
    @CacheLookup
    private WebElement btn_equipmentAccess_No;

    @FindBy(css = "#AccessEquipment > .togglebtn:nth-child(4)")
    @CacheLookup
    private WebElement btn_equipmentAccess_Yes;

    @FindBy(name = "AccessEquipmentNotes")
    @CacheLookup
    private WebElement txt_equipmentAccessNote;

    @FindBy(id = "taskTypeID")
    @CacheLookup
    private WebElement dropdown_taskTypeID;

    @FindBy(css = "#recall > .togglebtn:nth-child(2)")
    @CacheLookup
    private WebElement btn_recall_No;

    @FindBy(css = "#recall > .togglebtn:nth-child(4)")
    @CacheLookup
    private WebElement btn_recall_Yes;

    @FindBy(css = "#warranty > .togglebtn:nth-child(2)")
    @CacheLookup
    private WebElement btn_warranty_No;

    @FindBy(css = "#warranty > .togglebtn:nth-child(4)")
    @CacheLookup
    private WebElement btn_warranty_Yes;

    @FindBy(css = "#hs > .togglebtn:nth-child(2)")
    @CacheLookup
    private WebElement btn_hs_No;

    @FindBy(css = "#hs > .togglebtn:nth-child(4)")
    @CacheLookup
    private WebElement btn_hs_Yes;

    @FindBy(css = "#QualityTeamInstruction > .togglebtn:nth-child(2)")
    @CacheLookup
    private WebElement btn_roccInstruction_No;

    @FindBy(css = "#QualityTeamInstruction > .togglebtn:nth-child(4)")
    @CacheLookup
    private WebElement btn_roccInstruction_Yes;

    @FindBy(css = "#restrictedTrading > .btn-primary")
    @CacheLookup
    private WebElement btn_restrictedTrading_No;

    @FindBy(css = "btn-warning")
    @CacheLookup
    private WebElement btn_restrictedTrading_Yes;

    @FindBy(css = "#trading > .btn-primary")
    @CacheLookup
    private WebElement btn_trading_No;

    @FindBy(css = ".btn-danger:nth-child(4)")
    @CacheLookup
    private WebElement btn_trading_Yes;

    @FindBy(id = "sectionInformation")
    @CacheLookup
    private WebElement form_sectionInformation;

    @FindBy(xpath = "/html/body")
    @CacheLookup
    private WebElement form_tasksLog;

    @FindBy(id = "bp-form-sections")
    @CacheLookup
    private WebElement form_taskLog;

    @FindBy(css = "#sectionInformation > div.form-group.col-sm-4.red-box")
    @CacheLookup
    private WebElement modal_tradingStopConfirmation;

    @FindBy(css = ".continueYes")
    @CacheLookup
    private WebElement btn_tradingStopAccept;

    @FindBy(name = "assetID")
    @CacheLookup
    private List<WebElement> selectHereToManuallyLog;

    @FindBy(name = "description")
    @CacheLookup
    private WebElement txt_description;

    @FindBy(xpath = "//div[@id='sectionAsset']/div/div[2]/div/div[4]/label")
    @CacheLookup
    private WebElement assetLabel3;

    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Scan qr'])[1]/following::div[1]")
    @CacheLookup
    private WebElement btn_manualLog;

    @FindBy(css = ".btn-success")
    @CacheLookup
    private WebElement btn_saveLogTask;

    @FindBy(css = "#budgetRestrictionModal > div > div")
    @CacheLookup
    private WebElement modal_budgetWarning;

    @FindBy(css = ".continueYes")
    @CacheLookup
    private WebElement btn_budgetWarning_Continue;

    @FindBy(css = ".continueNo")
    @CacheLookup
    private WebElement btn_budgetWarning_Cancel;

    @FindBy(name = "BranchNo")
    @CacheLookup
    private WebElement txt_BranchNo;

    @FindBy(name = "FullName")
    @CacheLookup
    private WebElement txt_FullName;

    @FindBy(css = ".btn-info")
    @CacheLookup
    private WebElement btn_modal_Cancel;

    @FindBy(css = ".continueYes")
    @CacheLookup
    private WebElement btn_modal_Continue;

    @FindBy(xpath = "//*[@id=__pluginsNewModal]/div")
    @CacheLookup
    private WebElement modal_taskLogNotif;

    @FindBy(css = "div.modal-body")
    @CacheLookup
    private WebElement txt_taskLogNotif;

    @FindBy(css = "div.modal-footer > button.btn.btn-primary")
    @CacheLookup
    private WebElement btn_taskLogNotifOk;

    @FindBy(xpath = "//*[@class=modal-content]/div/div")
    @CacheLookup
    private WebElement btn_NotifOk;

    @FindBy(xpath = "//*[@id=__pluginsNewModal]/div/div")
    @CacheLookup
    private WebElement modal_taskLogNotification;

    @FindBy(xpath = "//*[@id=__pluginsNewModal]/div/div/div[3]/button")
    @CacheLookup
    private WebElement btn_taskLogOk;

    @FindBy(id = "outOfHoursModal")
    @CacheLookup
    private WebElement modal_outOfOfficeHoursNotif;

    @FindBy(css = "h4.modal-title")
    @CacheLookup
    private WebElement txt_outOfOfficeHoursNotifTitle;

    @FindBy(xpath = "//div[@id='outOfHoursModal']/div/div/div[2]/h3")
    @CacheLookup
    private WebElement txt_outOfOfficeHoursNotifContent;

    @FindBy(css = "div.btn.btn-success.continueYes")
    @CacheLookup
    private WebElement btn_outOfOfficeHoursYes;

    @FindBy(xpath = "//*[@id=outOfHoursModal]/div/div/div[4]/div[1]")
    @CacheLookup
    private WebElement btn_outOfOfficeHoursNo;

    @FindBy(css = "div.btn.btn-info.refusedNo")
    @CacheLookup
    private WebElement siteNotification_No;


    public TaskLogPage() throws Exception {
    }

    /**
     * Answer No in Site notification.
     *
     * @return the BuildingHomePage class instance.
     */
    public TaskLogPage clickNo() throws Exception {
        clickWhenReady(siteNotification_No);
        waitFor(5);
        return this;
    }

    /**
     * Select Job title.
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectJobTitle(String title) throws Exception {
        getOption(dropdown_jobTitle, title);
        return this;
    }

    /**
     * Select Equipment Location.
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectLocation(String location) throws IOException, InterruptedException {
        getOption(dropdown_assetLocation, location);
        return this;
    }

    /**
     * Select Task type.
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectTaskType(String task) throws IOException, InterruptedException {
        getOption(dropdown_taskTypeID, task);
        return this;
    }

    /**
     * Select Access Location Difficulty
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectAccessDifficultyOption(String accessOption, String msg) throws Exception {
        if (accessOption.equalsIgnoreCase("No")) {
            clickWhenReady(btn_equipmentAccess_No);
        } else if (accessOption.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_equipmentAccess_Yes);
            setValue(txt_equipmentAccessNote, msg);
        }
        return this;
    }


    public TaskCardPage iLogATask(String disc3, String disc4, String title,
                                  String location, String task, String desc, String tradingStatus) throws Exception {

        clickNo();
        setAssetlabel();
        setDisciplineThree(disc3);
        setDisciplineFour(disc4);
        selectJobTitle(title);
        selectLocation(location);
        clickWhenReady(btn_equipmentAccess_No);
        selectTaskType(task);
        clickWhenReady(btn_recall_No);
        clickWhenReady(btn_warranty_No);
        clickWhenReady(btn_hs_No);
        clickWhenReady(btn_roccInstruction_No);
        setTaskDescription(desc);
        selectTradingRestrictionOption(tradingStatus);
        return getInstance(TaskCardPage.class);
    }


    /**
     * Select Recall
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectRecallOption(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_recall_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_recall_Yes);
        }
        return this;
    }

    /**
     * Select Warranty Option
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectWarantyOption(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_warranty_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_warranty_Yes);
        }
        return this;
    }


    /**
     * Select Health & Safety Option
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectHsOption(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_hs_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_hs_Yes);
        }
        return this;
    }

    /**
     * Select Rocc Instruction Option
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectRoccInstructionOption(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_roccInstruction_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_roccInstruction_Yes);
        }
        return this;
    }

    /**
     * Select Trading restriction Option
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectTradingRestrictionOption(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_restrictedTrading_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_restrictedTrading_Yes);
        }
        return this;
    }

    /**
     * Select Trading Status
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage selectTradingStatus(String option) throws IOException, InterruptedException {
        if (option.equalsIgnoreCase("No")) {
            clickWhenReady(btn_trading_No);
        } else if (option.equalsIgnoreCase("Yes")) {
            clickWhenReady(btn_trading_Yes);
        }
        return this;
    }

    /**
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage confirmTradingStatusIfDisplayed() throws Exception {

        if (form_sectionInformation.getText().contains("Will this cause you to close or are you already closed?")) {
            clickWhenReady(btn_tradingStopAccept);
        } else {
            Log.info("The trading status confirmation modal is not displayed");
        }
        return this;
    }


    /**
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage clickAcceptBudgetWarningIfDisplayed(String option, String branchNbr, String name) throws Exception {

        waitFor(5);
        if (isModalDisplayed() == true) {
            locateElement(btn_budgetWarning_Continue);
            if (option.equals("Continue")) {
                clickWhenReady(btn_budgetWarning_Continue);
                setValue(txt_BranchNo, branchNbr);
                setValue(txt_FullName, name);
                clickWhenReady(btn_budgetWarning_Continue);
            } else if (option.equals("Cancel")) {
                clickWhenReady(btn_budgetWarning_Cancel);
            }
        } else {
            Log.info("The budget warning is not displayed");
        }
        return this;
    }
//getText().contains("Yes")btn_outOfOfficeHoursYes.isDisplayed()

    /**
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage acceptOutOfOfficeNotificationIfDisplayed(String option) throws Exception {

        waitFor(5);

        if (isModalDisplayed() == true) {
            locateElement(btn_outOfOfficeHoursYes);
            if (option.equals("Yes")) {
                clickWhenReady(btn_outOfOfficeHoursYes);
            } else if (option.equals("No")) {
                clickWhenReady(btn_outOfOfficeHoursNo);
            }
        } else {
            Log.info("The out of office notification is not displayed");
        }
        return this;
    }

    /**
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage clickCancelTradingStatus() throws Exception {
        clickWhenReady(btn_modal_Cancel);
        return this;
    }

    /**
     * Set Task description
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setTaskDescription(String desc) throws Exception {
        setValue(txt_description, desc);
        return this;
    }

    /**
     * Set location message description
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setLocationMessage(String message) throws Exception {
        setValue(txt_equipmentAccessNote, message);
        return this;
    }

    /**
     * Click Save & log task
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage clickSaveAndLogTask() throws Exception {

        clickWhenReady(btn_saveLogTask);
        return this;
    }


    /**
     * @return true or false.
     */
    public boolean isTaskLogSuccessDisplayed() throws Exception {

        waitFor(5);
        locateElement(txt_taskLogNotif);
        return txt_taskLogNotif.getText().contains("Please ensure you upload photographs demonstrating " +
                "the problem being experienced. This will enable the engineer to be prepared and effect a first-time fix.");
    }

    /**
     * @return String.
     */
    public boolean getTaskLogSuccessMessage() throws IOException, InterruptedException {
        switchToWindowsPopup();
        return modal_taskLogNotif.getText().contains("Thanks!");
    }


    /**
     * @return String.
     */
    public BuildingHomePage acceptTaskLogNotification() throws Exception {

        waitFor(5);
        locateElement(btn_taskLogNotifOk);
        waitAndclickElementUsingJS(btn_taskLogNotifOk);
        return getInstance(BuildingHomePage.class);
    }


    /**
     * Set value to Date The Work Should Commence Text field.
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setDateTheWorkShouldCommenceTextField(String dateTheWorkShouldCommenceValue) {
        dateTheWorkShouldCommence.sendKeys(dateTheWorkShouldCommenceValue);
        return this;
    }

    /**
     * Select Asset label
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setAssetlabel() throws IOException, InterruptedException {
        clickWhenReady(assetLabel3);
        return this;
    }

    /**
     * Select Asset label
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage iClickManualLog() throws IOException, InterruptedException {
        clickWhenReady(btn_manualLog);
        return this;
    }


    /**
     * Select Discipline three
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setDisciplineOne(String disc) throws Exception {

            clickWhenReady(dropdown_Discipline1);
            clickWhenReady(selOption(list_Discipline, disc));
        return this;
    }

    /**
     * Select Discipline three
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setDisciplineTwo(String disc) throws Exception {

            clickWhenReady(dropdown_Discipline2);
            clickWhenReady(selOption(list_Discipline, disc));
        return this;
    }

    /**
     * Select Discipline three
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setDisciplineThree(String disc) throws Exception {

        clickWhenReady(dropdown_Discipline3);
        clickWhenReady(selOption(list_Discipline, disc));

        return this;
    }

    /**
     * Select Discipline four
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage setDisciplineFour(String disc) throws Exception {

        waitFor(2);
        clickWhenReady(dropdown_Discipline4);
        clickWhenReady(selOption(list_Discipline, disc));

        return this;
    }

    /**
     * Add a task
     *
     * @return the TaskLogPage class instance.
     */
    public TaskLogPage iAddANewTask(String title) throws Exception {
        getOption(dropdown_jobTitle, title);
        return this;
    }


    @Override
    public boolean isPageLoaded() {
        return false;
    }

}
