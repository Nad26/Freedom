package pages.mainportal;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pages.buildingportal.TaskCardPage;

import java.io.IOException;
import java.util.List;

public class HelpDeskTaskListPage extends BasePage {


    @FindBy(name = "taskNum")
    @CacheLookup
    private WebElement txt_taskNum;

    @FindBy(id = "txtDisciplineName")
    @CacheLookup
    private WebElement txt_DisciplineName;

    @FindBy(id = "txtSupplierName")
    @CacheLookup
    private WebElement txt_SupplierName;

    @FindBy(id = "txtBranch")
    @CacheLookup
    private WebElement txt_Branch;

    @FindBy(id = "txtLocation")
    @CacheLookup
    private WebElement txt_Location;

    @FindBy(id = "txtBuildingName")
    @CacheLookup
    private WebElement txt_BuildingName;

    @FindBy(css = "button.btn.btn-info > span.glyphicon.glyphicon-search")
    @CacheLookup
    private WebElement btn_search;

    @FindBy(css = "span.glyphicon.glyphicon-refresh")
    @CacheLookup
    private WebElement btn_refresh;

    @FindBy(id = "lnkNext")
    @CacheLookup
    private WebElement lnk_Next;

    @FindBy(id = "lnkPrev")
    @CacheLookup
    private WebElement lnk_Prev;

    @FindBy(linkText = "Status")
    @CacheLookup
    private WebElement list_Status;

    @FindBy(id = "taskTypeActive")
    @CacheLookup
    private WebElement list_taskTypeActive;

    @FindBy(id = "attendanceSlaActive")
    @CacheLookup
    private WebElement list_attendanceSlaActive;

    @FindBy(id = "completionSlaActive")
    @CacheLookup
    private WebElement list_completionSlaActive;

    @FindBy(css = "li.dropdown.open > ul.dropdown-menu > li > a")
    @CacheLookup
    private WebElement list_option;

    @FindBy(id = "tblTaskList")
    @CacheLookup
    private WebElement tbl_TaskList;


    public HelpDeskTaskListPage() throws IOException {
    }


    /**
     * @return the HelpDeskTaskListPage class instance.
     */
    public HelpDeskTaskListPage iSearchForTaskUsingName(String taskNbr) throws Exception {
        setValue(txt_taskNum, taskNbr);
        clickWhenReady(btn_search);
        return this;
    }

    /**
     * @return the HelpDeskTaskListPage class instance.
     */
    public MainTaskCardPage iSelectTask(String taskNbr) throws Exception {

        clickWhenReady(getTableElement(tbl_TaskList,taskNbr,1));
        return getInstance(MainTaskCardPage.class);
    }

    /**
     * @return true or false.
     */
    public boolean isTaskListed(String taskNbr) {
        return tbl_TaskList.getText().contains(taskNbr);
    }




}