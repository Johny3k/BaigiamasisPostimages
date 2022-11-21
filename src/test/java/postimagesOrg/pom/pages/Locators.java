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
            public static By uploadByUrlButton = By.xpath("//*[@class='fa fa-lg fa-globe']");
            public static By logOutButton = By.xpath("//*[@class='fa fa-sign-out']");
        }

        public class LogIn {

            public static By inputEmail = By.xpath("//input[@name='email']");
            public static By inputPassword = By.xpath("//input[@name='password']");
            public static By buttonLogIn = By.xpath("//input[@value='Log in']");
        }

        public class MyImages {

            public static By imageLocation = By.xpath("//*[@data-name='Image']");
            public static By otherImageLocation = By.xpath(
                    "//*[@data-name='what-makes-java-still-popular-among-developers']");
            public static By deleteButtonLocation = By.xpath("//*[@class='fa fa-lg fa-trash-o']");
            public static By buttonDefault = By.xpath("//*[@class='cover']");
            public static By isItEmptyLocation = By.xpath("//*[@class='cover']");
        }

        public class UploadByUrl {

            public static By inputBoxForUrl = By.xpath("//textarea[@id='links']");
            public static String imageUrl =
                    "https://contentstatic.techgig.com/photo/93000110/what-makes-java-still-popular-among-developers.jpg?28608";
            public static By buttonUpload = By.xpath("//*[@class='width100 btn btn-lg']");
        }

        public class LogOut {

            public static By areWeLoggedOutText = By.xpath("//*[@id='content']/div/h2");
        }
    }

}
