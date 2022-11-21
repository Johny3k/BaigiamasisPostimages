package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.DeleteImagesPage;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.tests.TestBase;

public class UploadImageTest extends TestBase {

    @Test
    public void testImageUpload() {
        String expectedResult = "Image";
        String actualResult;

        UploadImagePage.uploadToTestImages();
        UploadImagePage.clickMyImagesHomePage();
        DeleteImagesPage.clickDefault();

        actualResult = DeleteImagesPage.checkIfImageExists();

        Assert.assertTrue(actualResult.contains(expectedResult), "The image " + expectedResult +
                " was not uploaded");
    }

}
