package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.tests.TestBase;

public class LogInTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        UploadImagePage.openUrl("https://postimages.org/");
    }

    @Test
    public void testLogIn(){
        String expectedResult = "jonuimileriui@gmail.com";
        String actualResult;
        String password = "RjXzkC6tSLpS";

        UploadImagePage.clickLoginInHomePage();
        LoginPage.enterEmailAdress(expectedResult);
        LoginPage.enterPassword(password);
        LoginPage.clickLogIn();

        actualResult = UploadImagePage.readUserEmailMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );
    }

}



