package postimagesOrg.pom.pages.postimages;

import postimagesOrg.pom.pages.Common;
import postimagesOrg.pom.pages.Locators;

public class LoginPage {

    public static void close() {
        Common.close();
    }

    public static void enterEmailAdress(String email) {
        Common.sendKeysToElement(
                Locators.Postimages.LogIn.inputEmail, email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locators.Postimages.LogIn.inputPassword, password
        );
    }

    public static void clickLogIn() {
        Common.clickElement(
                Locators.Postimages.LogIn.buttonLogIn
        );
    }
}
