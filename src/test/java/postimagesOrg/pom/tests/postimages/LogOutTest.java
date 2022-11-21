package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.LogOutPage;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.tests.TestBase;

public class LogOutTest extends TestBase {

    @Test
    public void logOutTest() {
        String expectedResult = "Logged out";
        String actualResult;

        UploadImagePage.clickLogOut();
        actualResult = LogOutPage.checkIfLoggedOut();

        Assert.assertTrue(actualResult.contains(expectedResult), "You have not logged out");
    }

}
