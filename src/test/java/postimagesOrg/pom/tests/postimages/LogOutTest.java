package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.HomePage;
import postimagesOrg.pom.pages.postimages.LogOutPage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.tests.TestBase;

public class LogOutTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        String logIn = "jonuimileriui@gmail.com";
        String password = "RjXzkC6tSLpS";

        HomePage.openUrl("https://postimages.org/");
        HomePage.clickLoginInHomePage();
        LoginPage.enterEmailAdress(logIn);
        LoginPage.enterPassword(password);
        LoginPage.clickLogIn();
    }

    @Test
    public void logOutTest(){
        String expectedResult = "Logged out";
        String actualResult;


        HomePage.clickLogOut();
        actualResult = LogOutPage.checkIfLoggedOut();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
