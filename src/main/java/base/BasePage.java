package base;


import com.cucumber.listener.Reporter;
import config.Log;
import config.PropertyReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Fail.fail;
import static org.awaitility.Awaitility.await;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;


public class BasePage extends BaseDriver {


    private static String screenshotName;
    protected WebDriverWait wait;
    protected JavascriptExecutor jsExecutor;

    public BasePage() throws IOException {
        this.wait = new WebDriverWait(driver, 15);
        jsExecutor = ((JavascriptExecutor) driver);
    }


    /***EXTENT REPORT****************************************************************/
    public static String returnDateStamp(String fileExtension) {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        return date;
    }

    public static void captureScreenshot() throws IOException, InterruptedException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        screenshotName = returnDateStamp(".jpg");

        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));

        //Reporter.addStepLog("Taking a screenshot!");
        //Reporter.addStepLog("<br>");
        Reporter.addStepLog("<a target=\"_blank\", href=" + returnScreenshotName() + "><img src=" + returnScreenshotName() + " height=200 width=300></img></a>");
    }

    public static String returnScreenshotName() {
        return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

        } finally {
            is.close();
            os.close();
        }
    }

    public static void copyLatestExtentReport() throws IOException {
        Date d = new Date();
        String date = d.toString().replace(":", "_").replace(" ", "_");
        File source = new File(System.getProperty("user.dir") + "\\output\\report.html");
        File dest = new File(System.getProperty("user.dir") + "\\output\\" + date.toString() + ".html");
        copyFileUsingStream(source, dest);
    }


    public boolean isPageLoaded() {
        return false;
    }

    public boolean isPageLoaded(long timeOut, TimeUnit timeUnit) {
        try {
            await().atMost(timeOut, timeUnit)
                    .ignoreExceptions()
                    .until(() -> isPageLoaded());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    public void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver)
                                .executeScript("return document.readyState")
                                .toString().equals("complete");
                    }};
        try {
            Thread.sleep(2000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    /**********************************************************************************
     **CLICK METHODS
     * @throws IOException
     **********************************************************************************/
    public void clickWhenReady(WebElement element) throws InterruptedException, IOException {

        WaitUntilWebElementIsVisible(element);
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                Log.info("Successfully clicked on the WebElement: " + "<" + element + ">");
                clicked = true;
            } catch (Exception e) {
                Log.warn("Unable to wait and click on WebElement, Exception: " + e.getMessage());
                Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
            attempts++;
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    public void waitAndClickElementsUsingByLocator(By by) throws InterruptedException {
        waitForPageLoaded(driver);
        boolean clicked = false;
        int attempts = 0;
        while (!clicked && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(by)).click();
                Log.info("Successfully clicked on the element using by locator: " + "<" + by.toString() + ">");
                clicked = true;
            } catch (Exception e) {
                Log.warn("Unable to wait and click on the element using the By locator, Exception: " + e.getMessage());
                Assert.fail("Unable to wait and click on the element using the By locator, element: " + "<" + by.toString() + ">");
            }
            attempts++;
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    public void selectListOption(WebElement list, String textToSelect) throws Exception {
        Wait<WebDriver> tempWait = new WebDriverWait(driver, 30);
        try {
            tempWait.until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSelect);
            list.sendKeys(Keys.ENTER);
            Log.info("Successfully sent the following keys: " + textToSelect + ", to the following WebElement: " + "<" + list.toString() + ">");
        } catch (Exception e) {
            Log.warn("Unable to send the following keys: " + textToSelect + ", to the following WebElement: " + "<" + list.toString() + ">");
            Assert.fail("Unable to select the required text from the dropdown menu, Exception: " + e.getMessage());
        }
    }

    public WebElement getOption(WebElement el, String text) {
        WebElement elm = null;
        Select Sel = new Select(el);
        List<WebElement> Size = Sel.getOptions();
        int iListSize = Size.size();
        for (int i = 0; i < iListSize; i++) {
            String sValue = Sel.getOptions().get(i).getText();
            if (sValue.equals(text)) {
                System.out.println("List option is" + sValue);
                Sel.selectByVisibleText(sValue);
                break;
            } else {
                Log.info("The requested selection is not available, selecting first option ");
                Sel.selectByIndex(1);
            }
        }
        return elm;
    }

    public void clickOnLinkElement(String text,int timeout) {

        waitForPageLoaded(driver);
        String name;
        WebElement locator = driver.findElement(By.linkText(text));
        try {
            final WebDriverWait customWait = new WebDriverWait(driver, timeout);
            customWait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
                locator.click();
                Log.info("Successfully clicked on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
            } catch (Exception e) {
            Log.warn("Unable to click on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
            Assert.fail("Unable to click on the WebElement, Exception: " + e.getMessage());
        }
    }


    public void clickOnElementUsingCustomTimeout(WebElement locator, WebDriver driver, int timeout) {
        try {
            final WebDriverWait customWait = new WebDriverWait(driver, timeout);
            customWait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
            locator.click();
            Log.info("Successfully clicked on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
        } catch (Exception e) {
            Log.warn("Unable to click on the WebElement, using locator: " + "<" + locator + ">" + ", using a custom Timeout of: " + timeout);
            Assert.fail("Unable to click on the WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************
     **ACTION METHODS
     **********************************************************************************/

    public void actionMoveAndClick(WebElement element) throws Exception {
        Actions ob = new Actions(driver);
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            ob.moveToElement(element).click().build().perform();
            Log.info("Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(elementToClick)).isEnabled();
            if (elementPresent == true) {
                ob.moveToElement(elementToClick).click().build().perform();
                Log.info("(Stale Exception) - Successfully Action Moved and Clicked on the WebElement, using locator: " + "<" + element.toString() + ">");
            }
        } catch (Exception e) {
            Log.warn("Unable to Action Move and Click on the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement, Exception: " + e.getMessage());
        }
    }

    public boolean moveToWebelement(WebElement element) {

        boolean flag = false;

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        return true;

    }

    public void actionMoveAndClickByLocator(By element) throws Exception {
        Actions ob = new Actions(driver);
        try {
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(element)).isEnabled();
            if (elementPresent == true) {
                WebElement elementToClick = driver.findElement(element);
                ob.moveToElement(elementToClick).click().build().perform();
                Log.info("Action moved and clicked on the following element, using By locator: " + "<" + element.toString() + ">");
            }
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement elementToClick = driver.findElement(element);
            ob.moveToElement(elementToClick).click().build().perform();
            Log.info("(Stale Exception) - Action moved and clicked on the following element, using By locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            Log.warn("Unable to Action Move and Click on the WebElement using by locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to Action Move and Click on the WebElement using by locator, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    /**********************************************************************************
     **SEND KEYS METHODS /
     **********************************************************************************/
    public void setValue(WebElement element, String textToSend) throws Exception {

        waitForPageLoaded(driver);
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
            Log.info("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<" + element + ">");
        } catch (Exception e) {
            Log.warn("Unable to locate WebElement: " + "<" + element + "> and send the following keys: " + textToSend);
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************
     **ELEMENT VERIFICATION /
     *********************************************************************************
     * @return*/
    public boolean verifyElement(WebElement element) throws Exception {
        try {
            this.WaitUntilWebElementIsVisible(element);
            Log.info("Element "+ element.toString() + "is displayed");
        } catch (Exception e) {
            Log.warn("Element "+ element.toString() + "is not displayed");
            Assert.fail("Required WebElement is not displayed, Exception: " + e.getMessage());
        }
        return false;
    }

    /**********************************************************************************
     **ELEMENT VERIFICATION /
     *********************************************************************************
     * @return*/
    public boolean verifyElementContent(WebElement element, String text) throws Exception {
        try {
            this.WaitUntilWebElementIsVisible(element);
            if (element.getText().contains(text)){
                Log.info("The required text: "+ text + "is displayed");
            }
        } catch (Exception e) {
            Log.warn("The required text: "+ text + "is not displayed");
            Assert.fail("Required text is not displayed, Exception: " + e.getMessage());
        }
        return false;
    }

    /**********************************************************************************
     **JS METHODS & JS SCROLL
     **********************************************************************************/
    public void scrollToElementByWebElementLocator(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -400)");
            Log.info("Succesfully scrolled to the WebElement, using locator: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            Log.warn("Unable to scroll to the WebElement, using locator: " + "<" + element.toString() + ">");
            Assert.fail("Unable to scroll to the WebElement, Exception: " + e.getMessage());
        }
    }

    public void jsPageScroll(int numb1, int numb2) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scroll(" + numb1 + "," + numb2 + ")");
            Log.info("Succesfully scrolled to the correct position! using locators: " + numb1 + ", " + numb2);
        } catch (Exception e) {
            Log.warn("Unable to scroll to element using locators: " + "<" + numb1 + "> " + " <" + numb2 + ">");
            Assert.fail("Unable to manually scroll to WebElement, Exception: " + e.getMessage());
        }
    }

    public void waitAndclickElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript("arguments[0].click();", element);
            Log.info("Successfully JS clicked on the following WebElement: " + "<" + element.toString() + ">");
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement staleElement = element;
            Boolean elementPresent = wait.until(ExpectedConditions.elementToBeClickable(staleElement)).isEnabled();
            if (elementPresent == true) {
                js.executeScript("arguments[0].click();", elementPresent);
                Log.info("(Stale Exception) Successfully JS clicked on the following WebElement: " + "<" + element.toString() + ">");
            }
        } catch (NoSuchElementException e) {
            Log.warn("Unable to JS click on the following WebElement: " + "<" + element.toString() + ">");
            Assert.fail("Unable to JS click on the WebElement, Exception: " + e.getMessage());
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    /**********************************************************************************
     **WAIT METHODS
     **********************************************************************************/
    public boolean WaitUntilWebElementIsVisible(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            Log.info("WebElement "+ element +" is visible");
            return true;
        } catch (Exception e) {
            Log.warn("WebElement "+ element +" is NOT visible");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    public boolean WaitUntilWebElementIsVisibleUsingByLocator(By element) {
        try {
            this.wait.until(visibilityOfElementLocated(element));
            Log.info("Element is visible using By locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            Log.warn("WebElement is NOT visible, using By locator: " + "<" + element.toString() + ">");
            Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
            return false;
        }
    }

    /**********************************************************************************/
    /**********************************************************************************/

    public boolean isElementClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
            Log.info("WebElement is clickable using locator: " + "<" + element.toString() + ">");
            return true;
        } catch (Exception e) {
            Log.info("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
            return false;
        }
    }

    public boolean waitUntilPreLoadElementDissapears(By element) {
        return this.wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    /**********************************************************************************
     **PAGE METHODS
     **********************************************************************************/
    public BasePage loadUrl(String url) throws Exception {
        driver.get(url);
        return new BasePage();
    }

    public String getCurrentURL() {
        try {
            String url = driver.getCurrentUrl();
            Log.info("Found(Got) the following URL: " + url);
            return url;
        } catch (Exception e) {
            Log.info("Unable to locate (Get) the current URL, Exception: " + e.getMessage());
            return e.getMessage();
        }
    }
    /**********************************************************************************/
    /**********************************************************************************/

    public String waitForSpecificPage(String urlToWaitFor) {
        try {
            String url = driver.getCurrentUrl();
            this.wait.until(ExpectedConditions.urlMatches(urlToWaitFor));
            Log.info("The current URL was: " + url + ", " + "navigated and waited for the following URL: " + urlToWaitFor);
            return urlToWaitFor;
        } catch (Exception e) {
            Log.info("Exception! waiting for the URL: " + urlToWaitFor + ",  Exception: " + e.getMessage());
            return e.getMessage();
        }
    }

    /**********************************************************************************
     **ALERT & POPUPS METHODS
     **********************************************************************************/
    public void closePopups(By locator) throws InterruptedException {
        try {
            List<WebElement> elements = this.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
            for (WebElement element : elements) {
                if (element.isDisplayed()) {
                    element.click();
                    this.wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
                    Log.info("The popup has been closed Successfully!");
                }
            }
        } catch (Exception e) {
            Log.info("Exception! - could not close the popup!, Exception: " + e.toString());
            throw (e);
        }
    }

    public boolean isPopUpVisible() {
        try {
            @SuppressWarnings("unused")
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            Log.info("A popup has been found!");
            return true;
        } catch (Exception e) {
            System.err.println("Error came while waiting for the alert popup to appear. " + e.getMessage());
        }
        return false;
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void switchToNewWindow() {
        try {
            String mainWindow = driver.getWindowHandle();
            Set<String> openedWindows = driver.getWindowHandles();
            if (openedWindows.size() > 1) {
                for (String newWindow : openedWindows) {
                    driver.switchTo().window(newWindow);
                }
            }
        } catch (Exception e) {
            Log.info("New window not found");
            Assert.fail("New window not found, Exception: " + e.getMessage());
        }
    }

    public boolean isModalDisplayed() {
        try {
            String mainWindow = driver.getWindowHandle();
            Set<String> openedWindows = driver.getWindowHandles();
            if (openedWindows.size() > 1) {
                for (String newWindow : openedWindows) {
                    driver.switchTo().window(newWindow);
                }
            }return true;
        } catch (Exception e) {
            Log.info("New window not found");
            Assert.fail("New window not found, Exception: " + e.getMessage());
        }
        return false;
    }


    public void closeModalPopup() throws AWTException, InterruptedException {
        try {
            Alert alert = this.wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        } catch (UnhandledAlertException f) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            Log.info("Unable to close the popup");
            Assert.fail("Unable to close the popup, Exception: " + e.getMessage());
        }
    }


    public WebElement getMapOption(List<WebElement> el1, List<WebElement> el2, String text1, String text2) throws Exception {
        WebElement elm = null;
        for (int i = 0; i < el1.size(); i++) {
            String c = el1.get(i).getText();
            if (c.equalsIgnoreCase(text1)) {
                Log.info("The text: " + c + " is found");
                elm = getWebElement(el2, text2);
            }
        }
        return elm;
    }

    public WebElement getListOptions(List<WebElement> e, String text1, String text2) throws Exception {
        WebElement elm = null;
        elm = getWebElement(e, text2);

        return elm;
    }

    protected WebElement getWebElement(List<WebElement> el, String text) {

        WebElement elm = null;
        for (int i = 0; i < el.size(); i++) {
            String c = el.get(i).getText();
            if (c.contains(text)) {
                Log.info("The text: " + c + " is found");
                elm = el.get(i);
                break;
            }
        }
        return elm;
    }

    public WebElement getTableElement(WebElement table, String text, int colNbr) {

        WebElement elm = null;
        List<WebElement> elmList = table.findElements(By.xpath("//td[" + colNbr + "]"));
        elm = getWebElement(elmList, text);
        return elm;
    }

    public WebElement getTableListElement(List<WebElement> elmList, String text) {

        WebElement elm = getWebElement(elmList, text);
        return elm;
    }


    public void waitFor(int seconds) throws Exception {

        Thread.sleep(seconds);
    }

    public void selectDropDownMenu(WebElement dropDownMenu, String optionItem) throws Exception {

        clickWhenReady(dropDownMenu);
        waitFor(5);
        System.out.println(dropDownMenu.getText());
        if (dropDownMenu.getText().contains("Please Select")) {
            new Select(dropDownMenu).selectByVisibleText(optionItem);
        } else {
            selectDropDownMenu(dropDownMenu, optionItem);
        }
    }



    public WebElement selOption(List<WebElement> OptionList, String optionText) throws InterruptedException {
        WebElement elm = null;
        try{

        if (OptionList.size() >= 1) {
            for (int i = 0; i < OptionList.size(); i++) {
                String CurrentOption = OptionList.get(i).getText();
                if (CurrentOption.equalsIgnoreCase(optionText)) {
                    System.out.println("Found the option : " + CurrentOption);
                    elm = OptionList.get(i);
                    break;
                }
            }
        }else {
            Log.info("The option list is empty");
        }
        } catch (Exception e) {
            throw e;
        }
        return elm;
    }


    private static Object firstHandle;
    private static Object lastHandle;

    public void switchToWindowsPopup() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        firstHandle = itr.next();
        lastHandle = firstHandle;
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
        driver.switchTo().window(lastHandle.toString());
    }

    public void switchToMainWindow() {
        driver.switchTo().window(firstHandle.toString());
    }


    public void close(WebElement popupIdLocator, WebElement closeElementLocator) throws InterruptedException {
        if (isDisplayed(popupIdLocator)) {
            WebElement closeElement = wait.until(
                    visibilityOfElementLocated((By) closeElementLocator));
            closeElement.click();
        }
    }

    public Boolean isDisplayed(WebElement popupIdLocator) throws InterruptedException {
        try {
            WebElement popup = wait.until(
                    visibilityOfElementLocated((By) popupIdLocator));
            return popup.isDisplayed();
        } catch (Exception ex) {
            Assert.fail("The pop up is not displayed");
            return false;

        }
    }

    public void acceptAndCloseDialog() throws Exception {

        String mainWinHander = driver.getWindowHandle();
        waitFor(5);
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            if (!mainWinHander.equals(handle)) {
                // Here will block for ever. No exception and timeout!
                WebDriver popup = driver.switchTo().window(handle);

                popup.close();
            }
        }
    }


    public void locateElement(WebElement element) throws InterruptedException, IOException {
        boolean isAvailable = false;
        int attempts = 0;
        while (!isAvailable && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.visibilityOf(element));
                Log.info("Successfully located WebElement: " + "<" + element.toString() + ">");
                isAvailable = true;
            } catch (Exception e) {
                Log.warn("Unable to locate WebElement, Exception: " + e.getMessage());
                Assert.fail("Unable to locate the WebElement, using locator: " + "<" + element.toString() + ">");
            }
            attempts++;
        }
    }

    public void locatePopUp(WebElement element) throws InterruptedException, IOException {
        boolean isAvailable = false;
        //Alert alert = this.wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().frame("ValueOfIframe");
// Treat as normal webpage. Now in iframe scope
        driver.switchTo().defaultContent();
        int attempts = 0;
        while (!isAvailable && attempts < 10) {
            try {
                this.wait.until(ExpectedConditions.alertIsPresent());
                Log.info("Successfully located WebElement: " + "<" + element.toString() + ">");
                isAvailable = true;
            } catch (Exception e) {
                Log.warn("Unable to locate WebElement, Exception: " + e.getMessage());
                Assert.fail("Unable to locate the WebElement, using locator: " + "<" + element.toString() + ">");
            }
            attempts++;
        }
    }

    public static String getPassword() {
        String decryptedPassword, encryptedPassword;
        encryptedPassword= "RDA4NDg=";
        byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
        decryptedPassword = new String(decryptedPasswordBytes);
        return decryptedPassword;
    }


}