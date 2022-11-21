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
        MyImagesPage.clickDefault();
    }

    @Test(priority = 1)
    public void doesTheImageExist(){
        String expectedResult = "Image";
        String expectedResult2 = "what-makes-java-still-popular-among-developers";
        String actualResult;
        String actualResult2;

        actualResult = MyImagesPage.checkIfImageExists();
        actualResult2 = MyImagesPage.checkIfOtherImageExists();
        boolean doesTheImageExist = actualResult.contains(expectedResult);
        boolean doesTheOtherImageExist = actualResult2.contains(expectedResult2);

        Assert.assertTrue(doesTheImageExist, new String("The image Image.jpg" +
                expectedResult + " does not exist"));

        Assert.assertTrue(doesTheOtherImageExist, new String("The image " +
                "what-makes-java-still-popular-among-developers.jpg" + expectedResult2 + " does not exist"));
    }

    @Test(priority = 2)
    public void deleteImageTest(){
        String expectedResult = "empty";
        String actualResult;

        MyImagesPage.deleteSelectedImage();
        MyImagesPage.deleteOtherSelectedImage();

        MyImagesPage.sleep();
        HomePage.clickMyImagesHomePage();
        actualResult = MyImagesPage.checkIfEmpty();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
