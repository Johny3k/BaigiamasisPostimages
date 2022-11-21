package postimagesOrg.pom.pages;

import org.openqa.selenium.By;

public class Locators {


    public class Postimages {


        public class Home {

            public static By loginButton = By.xpath("//*[@class='fa fa-sign-in']");
            public static By messageUserEmail = By.xpath(
                    "//*[@href='https://postimg.cc/profile']");
            public static By chooseImageButton = By.xpath("//input[@class='dz-hidden-input']");
            public static By myImagesButton = By.xpath("//*[@class='fa fa-picture-o']");
            public static String pathInProjectForImage = System.getProperty("user.dir") + "\\images\\Image.jpg";
            public static By uploadByUrlButton = By.xpath("");
            // "C:\\JavaVcs\\AutoTests\\Baigiamasis\\BaigiamasisPostimages\\images\\Image.jpg";
        }

        public class LogIn {

            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonLogIn = By.xpath("//input[@value='Log in']");
        }

        public class MyImages {

            public static By imageLocation = By.xpath("//*[@id='gallery-list']/div/div/div/a");
            public static By deleteButtonLocation = By.xpath("//*[@class='fa fa-lg fa-trash-o']");
        }
    }
}
