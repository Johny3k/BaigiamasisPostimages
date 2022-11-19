package postimagesOrg.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import postimagesOrg.pom.utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.setDriver();
        Driver.getDriver().get(url);
    }

    public static void close() {
        Driver.close();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }


    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys){
        getElement(locator).sendKeys(keys);
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
}
