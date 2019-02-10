package ua.startit;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.BrowserType;
import org.testng.Assert;
import org.testng.annotations.*;
import ua.startit.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static ua.startit.SignUpTest.EMAIL_ADDRESS;
import static ua.startit.SignUpTest.FIRST_NAME;
import static ua.startit.SignUpTest.PASSWORD;

public class SignInTest extends BaseTest {

//    private static final String BASE_URL = "https://www.amazon.com";
//
//    // 1. open HomePage
//    // 2. Click on Sign in button
//    // 3. Fill up login and password input fields
//    // 4. Click on Sign in button
//    // 5. Observe page (Assert)
//
//    private String browser;
//
//    @Factory
//    public Object[] browsers() {
//        return new Object[] {
//                new SignInTest(BrowserType.CHROME),
//                new SignInTest(BrowserType.FIREFOX),
//                new SignInTest(BrowserType.SAFARI)
//        };
//    }
//
//
//    public SignInTest(String browser) {
//        this.browser = browser;
//    }
//
//
//    @BeforeMethod(alwaysRun = true)
//    public void setUp() {
//        Configuration.startMaximized = true;
//        Configuration.browser = this.browser;
//        Configuration.baseUrl = BASE_URL;
//        Configuration.timeout = 10000;
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        close();
//    }

    @Test
    public void signTest() {
        open("/");
        HomePage homePage = new HomePage();
        homePage
                .clickOnSignIn()
                .setUsername(EMAIL_ADDRESS)
                .setPassword(PASSWORD);

        Assert.assertTrue(homePage.isNameDisplayed(FIRST_NAME),
                "Blah-blah");
    }

}
