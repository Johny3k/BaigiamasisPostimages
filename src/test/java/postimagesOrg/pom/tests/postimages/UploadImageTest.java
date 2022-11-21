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

        HomePage.uploadToTestImages();
        Common.sleep(3000);
   }

   @Test
    public void wasTheImageUploaded(){
       String expectedResult = "Image";
       String actualResult;
       HomePage.clickMyImagesHomePage();
       actualResult = MyImagesPage.checkIfImageExists("style");
       boolean doesTheImageExist = actualResult.contains(expectedResult);

       Assert.assertTrue(doesTheImageExist, new String("The image " + expectedResult + " does not exist"));
   }
}
