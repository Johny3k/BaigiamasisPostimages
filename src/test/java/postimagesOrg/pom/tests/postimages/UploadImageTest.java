package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.postimages.HomePage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.pages.postimages.MyImagesPage;
import postimagesOrg.pom.tests.TestBase;

public class UploadImageTest extends TestBase {

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
    public void testImageUpload(){
        String expectedResult = "Image";
        String actualResult;

        HomePage.uploadToTestImages();
        Common.sleep(2000);
        HomePage.clickMyImagesHomePage();
        MyImagesPage.clickDefault();

        actualResult = MyImagesPage.checkIfImageExists();

        boolean doesTheImageExist = actualResult.contains(expectedResult);

        Assert.assertTrue(doesTheImageExist, new String("The image " + expectedResult +
                " was not uploaded"));
   }

}
