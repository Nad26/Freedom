package pages.contractorportal;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pages.mainportal.MainHomePage;

import java.io.IOException;
import java.util.List;

public class ContractorHomePage extends BasePage {


    public ContractorHomePage() throws IOException {
    }



    @FindBy(id = "txtCPSearchContractor")
    @CacheLookup
    private WebElement txt_searchContractor;

    @FindBy(xpath = "//*[@id=\"divContractorListUnmigrated\"]")
    @CacheLookup
    private List<WebElement> list_unmigratedContractorList;

    @FindBy(xpath = "//*[@id=\"divContractorList\"]/li")
    @CacheLookup
    private List<WebElement> list_migratedContractorList;

    @FindBy(xpath = "//div[@id='sideBarContainer']/div/div[2]/a[2]")
    @CacheLookup
    private WebElement btn_tasks;

    @FindBy(xpath = "//div[@id='sideBarContainer']/div/div[2]/a")
    @CacheLookup
    private WebElement btn_logTask;

    @FindBy(xpath = "//div[@id='sideBarContainer']/div/div[2]/a[3]")
    @CacheLookup
    private WebElement btn_quotes;

    @FindBy(xpath = "//div[@id='sideBarContainer']/div/div[2]/a[6]")
    @CacheLookup
    private WebElement btn_finance;

    @FindBy(xpath = "//div[@id='sideBarContainer']/div/div[2]/a[8]")
    @CacheLookup
    private WebElement btn_compliance;




    /**
     *
     * @return the ContractorHomePage class instance.
     */
    public ContractorHomePage iSearchForTheContractor(String contractor) throws Exception {
        setValue(txt_searchContractor,contractor);
        return this;
    }

    /**
     *
     * @return the ContractorHomePage class instance.
     */
    public ContractorHomePage iSelectTheRequiredContractor(String contractor) throws Exception {
        clickWhenReady(selOption(list_migratedContractorList,contractor));
        return this;
    }

    /**
     *
     * @return the ContractorHomePage class instance.
     */
    public ContractorHomePage iClickTasks() throws Exception {
        clickWhenReady(btn_tasks);
        return this;
    }




}
