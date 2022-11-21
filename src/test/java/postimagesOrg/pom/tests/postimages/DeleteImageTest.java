package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.HomePage;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.pages.postimages.MyImagesPage;
import postimagesOrg.pom.tests.TestBase;

public class DeleteImageTest extends TestBase {

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
        HomePage.clickMyImagesHomePage();
    }

    @Test(priority = 1)
    public void doesTheImageExist(){
        String expectedResult = "Image";
        String actualResult;
        actualResult = MyImagesPage.checkIfImageExists("style");
        boolean doesTheImageExist = actualResult.contains(expectedResult);

        Assert.assertTrue(doesTheImageExist, new String("The image " + expectedResult + " does not exist"));
       // MyImagesPage.deleteSelectedImage();

//        Assert.assertTrue(
//                actualResult.contains(expectedResult),
//                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
//        );

    }

    @Test(priority = 2)
    public void deleteImageTest(){
        String expectedResult = "Image";
        String actualResult;

        MyImagesPage.deleteSelectedImage();
    }

}
