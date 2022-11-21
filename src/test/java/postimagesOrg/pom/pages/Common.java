package postimagesOrg.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import postimagesOrg.pom.utils.Driver;

import java.lang.constant.Constable;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void sleep(int millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        Driver.close();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static String getFile (String directory){
        return System.getProperty(directory);
    }


    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String something){
        getElement(locator).sendKeys(something);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void uploadFileToElement(By locator, String path){
        Driver.getDriver().findElement(locator).sendKeys(path);
    }

    public static void sendKeysToElementByAction(By locator) {
        WebElement element = getElement(locator);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.click();
        actions.sendKeys("C:\\Users\\KOMPIUTERIS\\Pictures\\sampleImage.jpg");
        actions.perform();
    }

    public static String getSomethingFromElement(By locator, String attName) {
        return getElement(locator).getAttribute(attName);
    }

    public static String getTextFromAttribute(By locator, String attName) {
        return getElement(locator).getAttribute(attName);
    }

    public static Alert getAlertBox() {
        return Driver.getDriver().switchTo().alert();
    }

    public static void clickOkOnAlertBox() {
        getAlertBox().accept();
    }

    public static void uploadImage(By locator){
        getElement(locator).click();
    }


}
