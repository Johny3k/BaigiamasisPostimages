package postimagesOrg.pom.pages;

import org.openqa.selenium.By;

public class Locators {


    public class Postimages {


        public class Home {

            public static By loginButton = By.xpath("//*[@class='fa fa-sign-in']");
            public static By messageUserEmail = By.xpath(
                    "//*[@href='https://postimg.cc/profile']");
            public static By chooseImageButton = By.xpath("//*[@id='uploadFile']");
        }

        public class LogIn {

            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonLogIn = By.xpath("//input[@value='Log in']");
        }
    }
}
