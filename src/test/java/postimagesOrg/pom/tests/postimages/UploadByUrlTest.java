package postimagesOrg.pom.tests.postimages;

import org.testng.Assert;
import org.testng.annotations.Test;
import postimagesOrg.pom.pages.postimages.DeleteImagesPage;
import postimagesOrg.pom.pages.postimages.UploadByUrlPage;
import postimagesOrg.pom.pages.postimages.UploadImagePage;
import postimagesOrg.pom.tests.TestBase;

public class UploadByUrlTest extends TestBase {

    @Test
    public void uploadByUrlTest() {
        String expectedResult = "what-makes-java-still-popular-among-developers";
        String actualResult;

        UploadImagePage.clickUploadByLinkHomePage();
        UploadByUrlPage.enterLinkToUpload();
        UploadByUrlPage.clickUpload();

        UploadByUrlPage.waitForElementToLoad();
        UploadByUrlPage.clickMyImagesHomePage();
        DeleteImagesPage.clickDefault();

        actualResult = DeleteImagesPage.checkIfOtherImageExists();

        Assert.assertTrue(actualResult.contains(expectedResult), "Image has not been uploaded by URL");
    }

}
