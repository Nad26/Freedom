package base;


import config.PropertyReader;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BaseDriver extends BaseClass{

    public Capabilities cap;
    protected PropertyReader read = new PropertyReader();
    public static WebDriver driver;



    public WebDriver getDriver() throws IOException {
        String browser = read.browser;

        switch (browser) {
            case "Mozilla":
                if (null == driver) {
                   // WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
                    //FirefoxOptions options = new FirefoxOptions();
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();

                    capabilities.setPlatform(Platform.WINDOWS);

                    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
                    //driver = new FirefoxDriver(options);
                }
                break;

            case "Chrome":
                if (null == driver) {
                //String downloadFilepath = read.downloadPath;
                    WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
                    //DesiredCapabilities dc = DesiredCapabilities.chrome();
                    //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
                    driver = new ChromeDriver();
            }
            break;

            case "IE":
                if (null == driver) {
                WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
                driver = new InternetExplorerDriver();
            }
            break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }

    public void getUrl(String url) throws Exception {

        driver.get(url);
    }



}










