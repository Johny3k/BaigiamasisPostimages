package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class HomePage {

    public static void openUrl(String url){
        Common.openUrl(url);
    }

    public static void clickLoginInHomePage(){
        Common.clickElement(
                Locators.Postimages.Home.loginButton
        );
    }


    public static String readUserEmailMessage() {
        return Common.getTextFromElement(
                Locators.Postimages.Home.messageUserEmail
        );
    }

    public static void uploadToTestImages() {
        Common.sendKeysToElement(Locators.Postimages.Home.chooseImageButton,
                Locators.Postimages.Home.pathInProjectForImage

        );
    }

    public static void clickMyImagesHomePage() {
        Common.clickElement(
                Locators.Postimages.Home.myImagesButton
        );
    }

    public static void addAttachment(){
        Common.uploadImage(Locators.Postimages.Home.chooseImageButton);
    }


    public static void clickUploadByLinkHomePage() {
        Common.clickElement(
                Locators.Postimages.Home.uploadByUrlButton
        );
    }
}
