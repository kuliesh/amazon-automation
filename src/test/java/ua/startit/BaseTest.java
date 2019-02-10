package ua.startit;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import ua.startit.support.Properties;

import java.util.logging.Logger;


public class BaseTest {

    //protected static final String URL = "https://www.amazon.com";
    private Properties properties = Properties.getInstance();

    private static final Logger LOG = Logger.getLogger("BaseTest");

    @BeforeSuite(alwaysRun = true)
    public void setEnv() {
        Configuration.browser = properties.getBrowser();
        LOG.info("Open browser" + Configuration.browser);

        Configuration.timeout = 10000;
        Configuration.baseUrl = properties.getEnv();
        Configuration.headless = Boolean.parseBoolean(properties.getHeadless());
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        Selenide.open("/");
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        Selenide.close();
    }
}
