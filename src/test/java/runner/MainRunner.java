package runner;


import base.BasePage;


import com.cucumber.listener.Reporter;
import config.PropertyReader;
import cucumber.api.CucumberOptions;

import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;


import java.io.File;
import java.io.IOException;


@RunWith(Cucumber.class)
@CucumberOptions
        (dryRun = true,
        features = {"src//test//resources//features"},
        glue = {"steps"},
        monochrome = true,
                tags = {"@smoke"},
                plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
                        "com.cucumber.listener.ExtentCucumberFormatter:output/report.html" },
                snippets = SnippetType.CAMELCASE)


public class MainRunner extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void writeExtentReport() throws IOException {
        PropertyReader read = new PropertyReader();
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\src\\main\\java\\config\\ReportsConfig.xml"));
        BasePage.copyLatestExtentReport();
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine",  System.getProperty("os.name"));
        Reporter.setSystemInfo("Browser",  read.browser);
        Reporter.setSystemInfo("Selenium", "3.14.0");
        Reporter.setSystemInfo("Maven", "3.6.0");
        Reporter.setSystemInfo("Java Version", System.getProperty("java.version"));
    }



}

