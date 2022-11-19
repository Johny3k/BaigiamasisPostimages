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
        Common.sendKeysToElementByAction(Locators.Postimages.Home.chooseImageButton

        );
    }
}
