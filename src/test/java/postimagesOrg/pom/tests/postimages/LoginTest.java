package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.HomePage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.tests.TestBase;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.openUrl("https://postimages.org/");

    }

    @Test
    public void testLogIn(){
        String expectedResult = "jonuimileriui@gmail.com";
        String actualResult;
        String password = "RjXzkC6tSLpS";

        HomePage.clickLoginInHomePage();
        LoginPage.enterEmailAdress(expectedResult);
        LoginPage.enterPassword(password);
        LoginPage.clickLogIn();

        actualResult = HomePage.readUserEmailMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

}



