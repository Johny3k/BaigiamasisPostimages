package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.HomePage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.pages.postimages.MyImagesPage;
import postimagesOrg.pom.pages.postimages.UploadByUrlPage;
import postimagesOrg.pom.tests.TestBase;

public class UploadByUrlTest extends TestBase {

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
    public void uploadByUrlTest(){
        String expectedResult = "what-makes-java-still-popular-among-developers";
        String actualResult;

        HomePage.clickUploadByLinkHomePage();
        UploadByUrlPage.enterLinkToUpload();
        UploadByUrlPage.clickUpload();

        HomePage.clickMyImagesHomePage();
        MyImagesPage.clickDefault();

        actualResult = MyImagesPage.checkIfOtherImageExists();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
