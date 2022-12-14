package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class UploadByUrlPage {


    public static void enterLinkToUpload() {
        Common.sendKeysToElement(
                Locators.Postimages.UploadByUrl.inputBoxForUrl,
                Locators.Postimages.UploadByUrl.imageUrl
        );
    }

    public static void clickUpload() {
        Common.clickElement(
                Locators.Postimages.UploadByUrl.buttonUpload
        );
    }

    public static void clickMyImagesHomePage() {
        Common.clickElementByAction(
                Locators.Postimages.Home.myImagesButton
        );
    }

    public static void waitForElementToLoad() {
        Common.waitForElementToBeVisible(
                Locators.Postimages.Home.myImagesButton
        );
    }

}
