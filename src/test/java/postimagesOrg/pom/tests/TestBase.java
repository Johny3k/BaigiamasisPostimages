package postimagesOrg.pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import postimagesOrg.pom.pages.postimages.LoginPage;
import postimagesOrg.pom.utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp(){
    }

    @AfterMethod
    public void tearDown(){
        LoginPage.close();
    }
}
