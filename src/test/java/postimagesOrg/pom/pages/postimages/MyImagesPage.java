package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class MyImagesPage {

    public static String checkIfImageExists() {
        return Common.getTextFromElement(
                Locators.Postimages.MyImages.imageLocation
        );
    }

    public static String checkIfOtherImageExists() {
        return Common.getTextFromElement(
                Locators.Postimages.MyImages.otherImageLocation
        );
    }

    public static void deleteSelectedImage() {
        Common.clickElement(
                Locators.Postimages.MyImages.imageLocation
        );
        Common.clickElement(
                Locators.Postimages.MyImages.deleteButtonLocation
        );
        Common.waitABitPlease();
        Common.clickOkOnAlertBox();
    }

    public static void deleteOtherSelectedImage() {
        Common.clickElement(
                Locators.Postimages.MyImages.otherImageLocation
        );
        Common.clickElement(
                Locators.Postimages.MyImages.deleteButtonLocation
        );
        Common.waitABitPlease();
        Common.clickOkOnAlertBox();
    }

    public static void clickDefault() {
        Common.clickElement(
                Locators.Postimages.MyImages.buttonDefault
        );
    }

    public static String checkIfEmpty() {
        return Common.getTextFromAttribute(
                Locators.Postimages.MyImages.isItEmptyLocation, "style"
        );
    }

    public static void waitABit() {
        Common.waitABitPlease();
    }

}
