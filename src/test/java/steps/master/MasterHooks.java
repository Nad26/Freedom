package steps.master;

import base.BaseDriver;
import base.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.net.MalformedURLException;

public class MasterHooks extends BaseDriver {


    @Before
    public void setup() throws IOException {

        driver = getDriver();
    }

    @After
    public void tearDownAndScreenshotOnFailure(Scenario scenario) {
        try {
            if(driver != null && scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                BasePage.captureScreenshot();
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
            if(driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
        }
    }
}
