package postimagesOrg.pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        String logIn = "jonuimileriui@gmail.com";
        String password = "RjXzkC6tSLpS";

        UploadImagePage.openUrl("https://postimages.org/");
        UploadImagePage.clickLoginInHomePage();
        LoginPage.enterEmailAdress(logIn);
        LoginPage.enterPassword(password);
        LoginPage.clickLogIn();
    }

    @AfterMethod
    public void tearDown() {
        LoginPage.close();
    }

}
