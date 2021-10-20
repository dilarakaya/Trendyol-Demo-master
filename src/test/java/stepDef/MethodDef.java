package stepDef;

import base.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class MethodDef extends Driver {

    public void clickElement(WebElement element) {
        element.click();
    }

    public void sendKeysElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void scrollElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public String getTextElement(WebElement element) {
        return element.getText();
    }

    public void waitForVisibility(WebElement element, long timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickablility(WebElement element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void actions(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public String getAttributeWithStrValue(WebElement element, String key) {
        return element.getAttribute(key);
    }


    public void wait(int timeOutInSeconds) throws InterruptedException {
        int second = timeOutInSeconds * 1000;
        Thread.sleep(second);
    }

    public void scrollForPageNumber(WebElement element, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        scrollElement(element);
    }

    public int randomNumberBetweenOneAndInt(int size) {
        Random random = new Random();

        int min = 1;



        return random.nextInt(size - min) + min;
    }

    public WebElement selectExistElement(WebElement firstElement, WebElement secondElement) {
        WebElement activeElement = null;
        if (firstElement.isEnabled()) {
            activeElement = firstElement;
        }
        if (secondElement.isEnabled()) {
            activeElement = secondElement;
        }
        return activeElement;
    }

    public String currentUrl() {
        return driver.getCurrentUrl();
    }

}




