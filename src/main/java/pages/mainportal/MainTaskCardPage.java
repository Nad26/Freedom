package pages.mainportal;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class MainTaskCardPage extends BasePage {


    public MainTaskCardPage() throws IOException {
    }


    @FindBy(id = "taskTabs")
    @CacheLookup
    private WebElement taskTabs;

    @FindBy(id = "tabEvents")
    @CacheLookup
    private WebElement tabEvents;

    @FindBy(id = "createEventBtn")
    @CacheLookup
    private WebElement createEventNote;

    @FindBy(id = "createIntNoteBtn")
    @CacheLookup
    private WebElement createInternalNote;

    @FindBy(css = "a[href='#tabDocument']")
    @CacheLookup
    private WebElement documents;

    @FindBy(css = "button.btn.btn-info.btn-xs.pull-right.edit")
    @CacheLookup
    private WebElement edit;

    @FindBy(css = "a[href='#tabEvents']")
    @CacheLookup
    private WebElement events;

    @FindBy(css = "div.tab-content")
    @CacheLookup
    private WebElement actionsTabContent;

    @FindBy(name = "FACTReporting")
    @CacheLookup
    private WebElement factReporting;

    @FindBy(css = "a.link.list-group-item")
    @CacheLookup
    private WebElement logOut;

    @FindBy(css = "button.btn.btn-sm.btn-block.btn-warning.logRecall")
    @CacheLookup
    private WebElement logRecall;

    @FindBy(css = "a[href='#tabOddjobs']")
    @CacheLookup
    private WebElement oddJobs;

    @FindBy(css = "a[href='#tabPhotos']")
    @CacheLookup
    private WebElement photos;

    @FindBy(css = "a[href='#tabVisits']")
    @CacheLookup
    private WebElement visits;

    @FindBy(name = "contractorRatingComment")
    @CacheLookup
    private WebElement yourComments;

    @FindBy(css = "a[href='#tabActions']")
    @CacheLookup
    private WebElement actions;

    @FindBy(xpath = "//div[@id='tabActions']/div/div[2]/div/div")
    @CacheLookup
    private WebElement lnk_assignContractor;

    @FindBy(css = "div.col-md-3.text-right > button.action.btn.btn-md.btn-success")
    @CacheLookup
    private WebElement btn_contractorAssignNext;

    @FindBy(css = "button.action.btn.btn-md.btn-success")
    @CacheLookup
    private WebElement btn_contractorAssignPrevious;

    @FindBy(id = "acMain")
    @CacheLookup
    private WebElement contractorAssignStepTwo;

    @FindBy(id = "assignContractorQuotes")
    @CacheLookup
    private WebElement tbl_assignContractorQuotes;

    @FindBy(id = "s2id_autogen11_search")
    @CacheLookup
    private WebElement txt_contractorSearch;

    @FindBy(id = "select2-chosen-11")
    @CacheLookup
    private WebElement txt_contractor;

    @FindBy(xpath = "//*[@id=\"select2-results-11\"]/li")
    @CacheLookup
    private List<WebElement> list_contractorList;

    @FindBy(id = "//*[@id=select2-drop]")
    @CacheLookup
    private WebElement dropdown_contractorSelection;

    @FindBy(css = "button.btn.btn-block.btn-success.assignContractorBtn")
    @CacheLookup
    private WebElement btn_assignContractorName;

    @FindBy(css = "#tabActions > div.alert.alert-success")
    @CacheLookup
    private WebElement txt_successNotification;


    @FindBy(linkText = "Uplift")
    @CacheLookup
    private WebElement lnk_Uplift;

    @FindBy(linkText = "Transfer to Purchase Order")
    @CacheLookup
    private WebElement lnk_TransferToPurchaseOrder;

    @FindBy(linkText = "Transfer to Odd Jobs")
    @CacheLookup
    private WebElement lnk_TransferToOddJobs;

    @FindBy(linkText = "Health & Safety Issue")
    @CacheLookup
    private WebElement lnk_HealthSafetyIssue;

    @FindBy(linkText = "Quote Invite")
    @CacheLookup
    private WebElement lnk_QuoteInvite;

    @FindBy(linkText = "Change Task Discipline")
    @CacheLookup
    private WebElement lnk_ChangeTaskDiscipline;

    @FindBy(linkText = "Transfer To Enquiry")
    @CacheLookup
    private WebElement lnk_TransferToEnquiry;

    @FindBy(id = "rateContractorBtn")
    @CacheLookup
    private WebElement submit;

    @FindBy(id = "editTaskDesc")
    @CacheLookup
    private WebElement btn_taskDescriptionEdit;

    @FindBy(name = "TSK_DESCRIPTION")
    @CacheLookup
    private WebElement txt_taskDescription;

    @FindBy(id = "taskDescPreview")
    @CacheLookup
    private WebElement preview_taskDescription;

    @FindBy(id = "editTaskUpdate")
    @CacheLookup
    private WebElement btn_taskDescriptionUpdate;

    @FindBy(id = "cancelEditTask")
    @CacheLookup
    private WebElement btn_taskDescriptionCancel;

    @FindBy(id = "FDB5E09F-6625-43D7-A455-7639F2DA14B6")
    @CacheLookup
    private WebElement theRange;

    @FindBy(css = "a[href='#tabDetails']")
    @CacheLookup
    private WebElement timeline;

    @FindBy(id = "leftBarAccordion")
    @CacheLookup
    private WebElement leftBarAccordion;
    
    @FindBy(id = "showModal")
    @CacheLookup
    private WebElement modal_rateCard;

    @FindBy(id = "spokeTo")
    @CacheLookup
    private WebElement txt_spokeTo;

    @FindBy(id = "eventType")
    @CacheLookup
    private WebElement txt_eventType;

    @FindBy(id = "eventTitle")
    @CacheLookup
    private WebElement txt_eventTitle;

    @FindBy(id= "s2id_autogen3")
    @CacheLookup
    private WebElement txt_emailTo;

    @FindBy(xpath= "//*[@id=select2-drop]/ul/li")
    @CacheLookup
    private List<WebElement> list_emailTo;

    @FindBy(id = "eventDescription")
    @CacheLookup
    private WebElement txt_eventDescription;

    @FindBy(id = "btnEventSubmit")
    @CacheLookup
    private WebElement btn_saveEventNote;

    @FindBy(css = "div.panel.event > div.panel-heading")
    @CacheLookup
    private WebElement panel_eventNote;


    /**
     * iClick on Actions Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickActionsLink() throws IOException, InterruptedException {
        clickWhenReady(actions);
        return this;
    }

    /**
     * iClick on Assign Contractor Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickAssignContractor() throws IOException, InterruptedException {
        clickWhenReady(lnk_assignContractor) ;
        return this;
    }

    /**
     *
     * @return true or false.
     */
    public boolean isContractorAssignCorrectStepOpened(String stepTitle) throws Exception {
        return verifyElementContent(actionsTabContent,stepTitle);
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iGoToNextContractorAssignScreen(String stepTitle) throws Exception {
        clickWhenReady(btn_contractorAssignNext) ;
        isContractorAssignCorrectStepOpened(stepTitle);
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSelectContractor(String contractor) throws Exception {
        clickWhenReady(txt_contractor);
        setValue(txt_contractorSearch,contractor);
        clickWhenReady(selOption(list_contractorList,contractor));
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickAssign() throws Exception {
        clickWhenReady(btn_assignContractorName);
        return this;
    }
    /**
     *
     * @return true or false.
     */
    public boolean verifySuccessTaskassignedNotificationDisplayed(String contractorName) throws Exception {
        return (verifyElementContent(txt_successNotification,"Task Assigned to "+contractorName));
    }


    /**
     *
     * @return true or false
     */
    public boolean isTaskOpened(String taskNbr) throws Exception {
        return verifyElementContent(leftBarAccordion,taskNbr)==true;
    }

    /**
     *
     * @return true or false
     */
    public boolean isEventTabOpened() throws Exception {
        return verifyElement(events)==true;
    }


    /**
     * iClick on Create Event Note Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickCreateEventNoteButton() {
        createEventNote.click();
        return this;
    }

    /**
     * iClick on Create Internal Note Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickCreateInternalNoteButton() {
        createInternalNote.click();
        return this;
    }

    /**
     * iClick on Documents Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickDocumentsLink() {
        documents.click();
        return this;
    }

    /**
     * iClick on Edit Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickEditButton() {
        edit.click();
        return this;
    }

    /**
     * iClick on Edit Description Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickEditDescriptionButton() {
        btn_taskDescriptionEdit.click();
        return this;
    }

    /**
     * iClick on Events Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickEventsLink() {
        events.click();
        return this;
    }

    /**
     * iClick on Fact Reporting Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickFactReportingLink() {
        factReporting.click();
        return this;
    }


    /**
     * iClick on Log Out Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * iClick on Log Recall Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickLogRecallButton() {
        logRecall.click();
        return this;
    }


    /**
     * iClick on Odd Jobs Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickOddJobsLink() {
        oddJobs.click();
        return this;
    }
    

    /**
     * iClick on Photos Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickPhotosLink() {
        photos.click();
        return this;
    }

    /**
     * iClick on Rate Contractor Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickRateContractorButton() {
        modal_rateCard.click();
        return this;
    }

    /**
     * iClick on Submit Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * iClick on Task Description Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickTaskDescriptionLink() {
        btn_taskDescriptionEdit.click();
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iEditTaskDescription(String desc) throws Exception {
        txt_taskDescription.sendKeys(desc);
        return this;
    }


    /**
     * iClick on The Range Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickTheRangeLink() {
        theRange.click();
        return this;
    }

    /**
     * iClick on Timeline Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickTimelineLink() {
        timeline.click();
        return this;
    }


    /**
     * iClick on Update Button.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickUpdateButton() {
        btn_taskDescriptionUpdate.click();
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public boolean isTaskDescriptionSaved(String desc) throws Exception {
        return verifyElementContent(preview_taskDescription,desc);
    }



    /**
     * iClick on Visits Link.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickVisitsLink() {
        visits.click();
        return this;
    }



    /**
     * iSet value to Your Comments Textarea field.
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSetYourCommentsText(String yourCommentsValue) {
        yourComments.sendKeys(yourCommentsValue);
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSetEventSpokeTo(String spokeTo) throws Exception {
            setValue(txt_spokeTo,spokeTo);
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSetEventTitle(String eventTitle) throws Exception {
        setValue(txt_emailTo,eventTitle);
        return this;
    }


    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSetEventEmailTo(String email) throws Exception {
        setValue(txt_emailTo,email);
        clickWhenReady(selOption(list_emailTo,email));
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iSetEventDescription(String desc) throws Exception {
        setValue(txt_eventDescription,desc);
        return this;
    }

    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public MainTaskCardPage iClickSaveEventNote() throws Exception {
        clickWhenReady(btn_saveEventNote);
        return this;
    }


    /**
     *
     * @return the MainTaskCardPage class instance.
     */
    public boolean isEventNoteSaved(String desc) throws Exception {
        return verifyElementContent(panel_eventNote,desc);
    }





}
