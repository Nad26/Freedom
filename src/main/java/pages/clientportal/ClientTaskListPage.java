package pages.clientportal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.commons.TaskListPage;

import java.util.List;

public class ClientTaskListPage extends TaskListPage {

    public ClientTaskListPage() throws Exception {
    }


    @FindBy(xpath = "//span[@class='selected'][contains(text(),'Status')]")
    @CacheLookup
    private List<WebElement> statusDropDown;


    @FindBy(xpath = "//span[@class='selected'][contains(text(),'Type')]")
    @CacheLookup
    private List<WebElement> typeDropDown;

    @FindBy(xpath = "//span[@class='selected'][contains(text(),'Brand')]")
    @CacheLookup
    private List<WebElement> brandDropDown;

    @FindBy(xpath = "//label[@class='togglebtn btn btn-success']")
    @CacheLookup
    private WebElement healthSafetyToggle;

    @FindBy(id = "tradingStatus")
    @CacheLookup
    private WebElement tradingStatus;

    @FindBy(xpath = "//label[@class='togglebtn btn btn-warning']")
    @CacheLookup
    private WebElement restrictedTradingToggle;

    @FindBy(xpath = "//div[@id='taskNum']")
    @CacheLookup
    private WebElement taskNumBox;

    @FindBy(id = "branch")
    @CacheLookup
    private WebElement branchTxtBox;

    @FindBy(id = "buildingType")
    @CacheLookup
    private List<WebElement> buildingTypeDropDown;

    @FindBy(id = "areaName")
    @CacheLookup
    private List<WebElement> areaNameDropDown;

    @FindBy(id = "discipline")
    @CacheLookup
    private List<WebElement> disciplineDropDown;

    @FindBy(id = "s2id_autogen17")
    @CacheLookup
    private List<WebElement> priorityDropDown;

    @FindBy(id = "supplierName")
    @CacheLookup
    private List<WebElement>supplierNameDropDown;

    @FindBy(id = "location")
    @CacheLookup
    private List<WebElement>locationDropDown;

    @FindBy(id = "searchbtn")
    @CacheLookup
    private WebElement taskSearchBtn;

    @FindBy(id = "export")
    @CacheLookup
    private WebElement exportBtn;

    @FindBy(id = "resetbtn")
    @CacheLookup
    private WebElement resetBtn;

    @FindBy(xpath = "//a[@href='#tableTaskView']")
    @CacheLookup
    private WebElement tableTaskView;

    private final String anothervisitValue = "AnotherVisit";

    @FindBy(css = "#s2id_autogen96 a.select2-choice.select2-default")
    @CacheLookup
    private WebElement area;

    @FindBy(id = "39C628BD-293A-41D8-A4EA-DAA7CE1CA70C")
    @CacheLookup
    private WebElement ask;

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> asset;

    private final String assetValue = "Asset";

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> autoppm;

    private final String autoppmValue = "AutoPPM";

    @FindBy(id = "9E0D02A6-2993-4BB9-A7EE-1615AC7531BB")
    @CacheLookup
    private WebElement bpp;

    @FindBy(css = "#brandName a.dropdown-toggle")
    @CacheLookup
    private WebElement brand;

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> businesscritical;

    private final String businesscriticalValue = "BusinessCritical";

    @FindBy(name = "taskStatus")
    @CacheLookup
    private List<WebElement> cancelled;

    private final String cancelledValue = "Cancelled";

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> capex;

    private final String capexValue = "Capex";

    @FindBy(css = "a[title='Change Client']")
    @CacheLookup
    private WebElement changeClient;

    @FindBy(css = "a[href='#mapTaskView']")
    @CacheLookup
    private WebElement map;

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> materials;

    private final String materialsValue = "Materials";

    @FindBy(name = "taskType")
    @CacheLookup
    private List<WebElement> ppm2;

    @FindBy(css = "#s2id_autogen93 a.select2-choice.select2-default")
    @CacheLookup
    private WebElement priority;

    @FindBy(css = "a[title='Quote List']")
    @CacheLookup
    private WebElement quoteList;

    @FindBy(name = "tradingStatus")
    @CacheLookup
    private List<WebElement> restrictedTrading;

    @FindBy(css = "a[title='Staff']")
    @CacheLookup
    private WebElement staff;

    @FindBy(css = "a[title='Tasks List']")
    @CacheLookup
    private WebElement tasksList;

    @FindBy(xpath = "//a[contains(text(),'221215')]")
    @CacheLookup
    private WebElement tasksNbr;

    @FindBy(xpath = "//tr[@id='c10925']//td[@class='createdDate']")
    @CacheLookup
    private WebElement createdDate;

    @FindBy(xpath = "//tr[@id='c10925']//td[@class='areaName text-info filterCol']//div[@class='ellip']")
    @CacheLookup
    private WebElement areaName;

    @FindBy(xpath = "//tr[@id='c10925']//td[@class='taskStatus text-info filterCol']//div[@class='ellip'])]")
    @CacheLookup
    private WebElement taskStatus;





    /**
     * Click on Map Link.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage clickMapLink() {
        map.click();
        return this;
    }


    /**
     * Click on Priority Link.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage clickPriorityLink() {
        priority.click();
        return this;
    }

    /**
     * Click on Quote List Link.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage clickQuoteListLink() {
        quoteList.click();
        return this;
    }


    /**
     * Click on Staff Link.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage clickStaffLink() {
        staff.click();
        return this;
    }


    /**
     * Click on Tasks List Link.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage clickTasksListLink() {
        tasksList.click();
        return this;
    }

    /**
     * Set default value to Asset Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setAssetRadioButtonField() {
        for (WebElement el : asset) {
            if (el.getAttribute("value").equals(assetValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Autoppm Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setAutoppmRadioButtonField() {
        for (WebElement el : autoppm) {
            if (el.getAttribute("value").equals(autoppmValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Businesscritical Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setBusinesscriticalRadioButtonField() {
        for (WebElement el : businesscritical) {
            if (el.getAttribute("value").equals(businesscriticalValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Cancelled Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setCancelledRadioButtonField() {
        for (WebElement el : cancelled) {
            if (el.getAttribute("value").equals(cancelledValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Capex Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setCapexRadioButtonField() {
        for (WebElement el : capex) {
            if (el.getAttribute("value").equals(capexValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    /**
     * Set default value to Materials Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setMaterialsRadioButtonField() {
        for (WebElement el : materials) {
            if (el.getAttribute("value").equals(materialsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Partsrequired Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setPartsrequiredRadioButtonField(List<WebElement> partsrequired,String partsrequiredValue) {
        for (WebElement el : partsrequired) {
            if (el.getAttribute("value").equals(partsrequiredValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Ppm Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setPpm2RadioButtonField(List<WebElement> ppm,String ppmValue) {
        for (WebElement el : ppm) {
            if (el.getAttribute("value").equals(ppmValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Quoted Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setQuotedRadioButtonField(List<WebElement> quoted,String quotedValue) {
        for (WebElement el : quoted) {
            if (el.getAttribute("value").equals(quotedValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Quotedworks Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setQuotedworksRadioButtonField(List<WebElement> quotedworks,String quotedworksValue) {
        for (WebElement el : quotedworks) {
            if (el.getAttribute("value").equals(quotedworksValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    /**
     * Set default value to Quoterequired Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setQuoterequiredRadioButtonField(List<WebElement> quoterequired,String quoterequiredValue) {
        for (WebElement el : quoterequired) {
            if (el.getAttribute("value").equals(quoterequiredValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }


    /**
     * Set default value to Reactive Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setReactive2RadioButtonField(List<WebElement> reactive,String reactiveValue) {
        for (WebElement el : reactive) {
            if (el.getAttribute("value").equals(reactiveValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Reactive3rdparty Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setReactive3rdpartyRadioButtonField(List<WebElement> reactive3rdparty,String reactive3rdpartyValue) {
        for (WebElement el : reactive3rdparty) {
            if (el.getAttribute("value").equals(reactive3rdpartyValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Rejected Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setRejectedRadioButtonField(List<WebElement> rejected,String rejectedValue) {
        for (WebElement el : rejected) {
            if (el.getAttribute("value").equals(rejectedValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Report Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setReportRadioButtonField(List<WebElement> report,String reportValue) {
        for (WebElement el : report) {
            if (el.getAttribute("value").equals(reportValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Restricted Trading Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setRestrictedTradingRadioButtonField(List<WebElement> restrictedTrading,String restrictedTradingValue) {
        for (WebElement el : restrictedTrading) {
            if (el.getAttribute("value").equals(restrictedTradingValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Temporaryfix Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setTemporaryfixRadioButtonField(List<WebElement> temporaryfix,String temporaryfixValue) {
        for (WebElement el : temporaryfix) {
            if (el.getAttribute("value").equals(temporaryfixValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Trading Status Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setTradingStatusRadioButtonField(List<WebElement> tradingStatus,String tradingStatusValue) {
        for (WebElement el : tradingStatus) {
            if (el.getAttribute("value").equals(tradingStatusValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 2 Weeks Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setWeeksRadioButtonField2(List<WebElement> weeks,String weeksValue) {
        for (WebElement el : weeks) {
            if (el.getAttribute("value").equals(weeksValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to 1 Year Radio Button field.
     *
     * @return the ClientTaskListPage class instance.
     */
    public ClientTaskListPage setYearRadioButtonField1(List<WebElement> years,String yearsValue) {
        for (WebElement el : years) {
            if (el.getAttribute("value").equals(yearsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }























    @Override
    public boolean isPageLoaded() {
        return false;
    }
}
