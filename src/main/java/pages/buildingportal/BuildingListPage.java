package pages.buildingportal;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class BuildingListPage extends BasePage {


    @FindBy(id = "cirrusContainer")
    @CacheLookup
    private WebElement cirrusContainer;

    @FindBy(id = "buildingSearchButton")
    @CacheLookup
    private WebElement btn_buildingSearchButton;

    @FindBy(xpath = "//div[@id='cirrusContainer']/div/div/div[2]/div[11]/div/ul")
    @CacheLookup
    private WebElement KFC;

    @FindBy(xpath = "//div[11]/div/div")
    @CacheLookup
    private WebElement KFCc;

    @FindBy(xpath = "//div[@id='cirrusContainer']/div/div/div[2]")
    @CacheLookup
    private WebElement ClientBuilding;

    @FindBy(xpath = "//div/ul")
    @CacheLookup
    private WebElement BuildingList;

    @FindBy(linkText = "Accrington DT")
    @CacheLookup
    private WebElement link_bNameAccringtonDT;

    @FindBy(id = "buildingSearch")
    @CacheLookup
    private WebElement txt_search;


    @FindBy(id = "848F19CB-ECFD-4989-871B-256D39B49331")
    @CacheLookup
    private WebElement cloudfmProperty;

    @FindBy(id = "F3247638-ADBA-4973-B5E4-D3715DE970DD")
    @CacheLookup
    private WebElement coast;

    @FindBy(css = "#mainNavBar div.container-fluid nav.navbar-collapse.bs-navbar-collapse.menulinks.hidden-phone " +
            "ul.nav.navbar-nav.unfloat-tablet li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement contractorPortal2;

    @FindBy(id = "774D0384-7DF3-42C2-911A-A365546465E2")
    @CacheLookup
    private WebElement demo;

    @FindBy(id = "FF603CA8-9743-4FE0-8CD7-7E25931FEB12")
    @CacheLookup
    private WebElement guardian;

    @FindBy(id = "0CDA095B-BFD9-4AF4-BDC3-1B1C882BB240")
    @CacheLookup
    private WebElement herbert;

    @FindBy(id = "4C03D7C5-B99B-4C8D-8441-CB76621863AF")
    @CacheLookup
    private WebElement karenMillen;

    @FindBy(id = "F051AD19-72FF-4559-86B8-09D16A5411B2")
    @CacheLookup
    private WebElement kefco;

    @FindBy(id = "EC1FBCA0-7CA9-4380-A070-D90A3514508D")
    @CacheLookup
    private WebElement kfc;

    @FindBy(id = "9B96BE5B-B6F7-43A6-8A60-0E1617463ADD")
    @CacheLookup
    private WebElement kfcEs;

    @FindBy(css = "div.panel.panel-primary.selectClient")
    @CacheLookup
    private WebElement clientPanel;

    @FindBy(id = "B3462C96-76A0-4169-9257-1CA1BEEEF3BE")
    @CacheLookup
    private WebElement oasis;

    @FindBy(id = "255F0CB7-AE58-4BF6-B4D4-D870DEC1AA9F")
    @CacheLookup
    private WebElement pizzaExpress;

    @FindBy(id = "F029EA30-5227-4BB6-BBDB-995A56A433A0")
    @CacheLookup
    private WebElement prezzo;

    @FindBy(id = "89B00AA5-EFE3-479C-B34B-F6724EBFC43E")
    @CacheLookup
    private WebElement queensway;

    @FindBy(id = "199BD65C-31B0-4D6E-B43C-DC9415E72410")
    @CacheLookup
    private WebElement tui;

    @FindBy(id = "2CB01ED9-B8A9-41F5-A7E4-339F812A0684")
    @CacheLookup
    private WebElement warehouse;

    @FindBy(id = "73ECA69F-2012-46BD-9536-87C0B27B2376")
    @CacheLookup
    private WebElement wolseley;

    @FindBy(id = "D074D4DA-E16C-4585-9662-B468557EC16A")
    @CacheLookup
    private WebElement wolseleyRetail;

    @FindBy(id = "C1E9F083-9CF9-47FD-8A7F-6017921499FD")
    @CacheLookup
    private WebElement zizzi;

    @FindBy(id = "830B8614-1789-49C3-AB6B-7B212AD41F5D")
    @CacheLookup
    private WebElement turningPoint;

    @FindBy(id = "9E0D02A6-2993-4BB9-A7EE-1615AC7531BB")
    @CacheLookup
    private WebElement bpp;

    @FindBy(id = "CFB04299-82D3-49E9-906F-EF2D52C7C9A5")
    @CacheLookup
    private WebElement shelter;

    @FindBy(id = "D5C7E192-A7C6-4370-9203-80C8C658FAFB")
    @CacheLookup
    private WebElement splendid;

    @FindBy(id = "C7C351D4-2349-4E88-B1FF-7E7102BA96FC")
    @CacheLookup
    private WebElement centralHall1;

    @FindBy(id = "70A4C400-EFCB-4E13-A402-5DCA0CC8B21D")
    @CacheLookup
    private WebElement centralHall2;


    public BuildingListPage() throws Exception {
    }

    @Override
    public boolean isPageLoaded() {
        return false;
    }

    /**
     * Set value to Search Text field.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage setSearchTextField(String searchValue) throws Exception {
        setValue(txt_search, searchValue);
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickSearch() throws IOException, InterruptedException {
        clickWhenReady(btn_buildingSearchButton);
        return this;
    }

    /**
     * Click on AccrindonDT.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingHomePage clickBuildingName() throws IOException, InterruptedException {
        clickWhenReady(link_bNameAccringtonDT);
        return getInstance(BuildingHomePage.class);
    }

    /**
     * Click on AccrindonDT.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingHomePage selectBuilding(String building) throws IOException, InterruptedException {

        clickOnLinkElement(building,5);
        clickWhenReady(link_bNameAccringtonDT);
        return getInstance(BuildingHomePage.class);
    }


    /**
     * Select a building.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingHomePage userSelectBuilding(String buildingName) throws Exception {
        clickWhenReady(getTableElement(ClientBuilding,buildingName,11));
        return getInstance(BuildingHomePage.class);
    }


    /**
     * Click on Bpp Link.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickBppLink() throws IOException, InterruptedException {
        clickWhenReady(bpp);
        return this;
    }

    /**
     * Click on Central Hall Link.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickCentralHall1Link() throws IOException, InterruptedException {
        clickWhenReady(centralHall1);
        return this;
    }

    /**
     * Click on Central Hall Link.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickCentralHall2Link() throws IOException, InterruptedException {
        clickWhenReady(centralHall2);
        return this;
    }

    /**
     * Click on Cloudfm Property Link.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickCloudfmPropertyLink() throws IOException, InterruptedException {
        clickWhenReady(cloudfmProperty);
        return this;
    }

    /**
     * Click on Coast Link.
     *
     * @return the BuildingListPage class instance.
     */
    public BuildingListPage clickCoastLink() throws IOException, InterruptedException {
        clickWhenReady(coast);
        return this;
    }







}








