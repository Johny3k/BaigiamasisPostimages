package postimagesOrg.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import postimagesOrg.pom.utils.Driver;

import java.time.Duration;

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

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String value){
        getElement(locator).sendKeys(value);
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
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

    public static void waitABitPlease() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
}
