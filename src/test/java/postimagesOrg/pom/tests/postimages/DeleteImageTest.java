package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.DeleteImagesPage;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.tests.TestBase;

public class DeleteImageTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        UploadImagePage.clickMyImagesHomePage();
        DeleteImagesPage.clickDefault();
    }

    @Test(priority = 1)
    public void doesTheImageExistTest() {
        String expectedResult = "Image";
        String expectedResult2 = "what-makes-java-still-popular-among-developers";
        String actualResult;
        String actualResult2;

        actualResult = DeleteImagesPage.checkIfImageExists();
        actualResult2 = DeleteImagesPage.checkIfOtherImageExists();

        Assert.assertTrue(actualResult.contains(expectedResult), "The image " +
                expectedResult + " does not exist");

        Assert.assertTrue(actualResult2.contains(expectedResult2), "The image " +
                "what-makes-java-still-popular-among-developers.jpg" + expectedResult2 + " does not exist");
    }

    @Test(priority = 2)
    public void deleteImageTest() {
        String expectedResult = "empty";
        String actualResult;

        DeleteImagesPage.deleteSelectedImage();
        DeleteImagesPage.deleteOtherSelectedImage();

        DeleteImagesPage.waitForElementToLoad();
        DeleteImagesPage.clickMyImagesHomePage();

        actualResult = DeleteImagesPage.checkIfEmpty();

        Assert.assertTrue(actualResult.contains(expectedResult),"There are images left undeleted");
    }

}
