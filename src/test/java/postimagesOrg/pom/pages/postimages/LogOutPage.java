package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class LogOutPage {

    public static String checkIfLoggedOut() {
        return Common.getTextFromElement(
                Locators.Postimages.LogOut.areWeLoggedOutText
        );
    }
}
