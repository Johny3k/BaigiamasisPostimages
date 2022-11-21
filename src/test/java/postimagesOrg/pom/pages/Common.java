package postimagesOrg.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public static void sendKeysToElement(By locator, String value) {
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

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element);
        actions.click();
        actions.perform();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
