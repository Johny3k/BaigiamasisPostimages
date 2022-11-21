package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class MyImagesPage {

    public static String checkIfImageExists(String attributeName) {
        return Common.getTextFromAttribute(
                Locators.Postimages.MyImages.imageLocation,
                attributeName
        );
    }

    public static void deleteSelectedImage() {
        Common.clickElement(
                Locators.Postimages.MyImages.imageLocation
        );
        Common.clickElement(
                Locators.Postimages.MyImages.deleteButtonLocation
        );
        //Common.sleep(1000);
        Common.clickOkOnAlertBox();
    }
}
