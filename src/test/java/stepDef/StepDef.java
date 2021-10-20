package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StepDef extends MethodDef {

    public void existElementClick(WebElement element, long timeOutInSeconds) {
        List<WebElement> elements = new ArrayList<>();
        elements.add(element);
        if (elements.size() > 0) {

            clickWithWait(element, timeOutInSeconds);

        }
    }

    public void hover(WebElement element, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        actions(element);
    }

    public void clickWithWait(WebElement element, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        clickElement(element);
    }

    public void sendTextWithWait(WebElement element, String key, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        sendKeysElement(element, key);
    }

    public void clickWithScroll(WebElement element, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        scrollElement(element);
        clickElement(element);
    }

    public void selectPageNumber(List<WebElement> elements, String key, long timeOutInSeconds) {
        scrollForPageNumber(elements.get(1), timeOutInSeconds);
        for (WebElement element : elements) {
            String pageNumber = getTextElement(element);
            if (pageNumber.equals(key)) {
                clickWithWait(element, timeOutInSeconds);
                break;
            }
        }
    }

    public void controlPageNumber(WebElement element, long timeOutInSeconds) {
        waitForClickablility(element, timeOutInSeconds);
        Assert.assertEquals("Page number is false!!!", getAttributeWithStrValue(element, "href"), currentUrl());
    }

    public void randomSelectProduct(List<WebElement> elements,WebElement elementt, long timeOutInSeconds) throws InterruptedException {
        WebElement element = elements.get(10);
        scrollElement(element);


        List<WebElement> elementss = new ArrayList<>();
        elementss.add(elementt);
        if (elementss.size() > 0) {
            elementt.click();
        }
        element.click();

    }

    public static String productPagePrice = null;

    public void keepProductPrice(WebElement highPrice, WebElement lowPrice, long timeOutInSeconds) {
        waitForClickablility(highPrice, timeOutInSeconds);
        WebElement existElement = selectExistElement(highPrice, lowPrice);
        productPagePrice = getTextElement(existElement);
        System.out.println(productPagePrice);
    }


    public void productAmountControl(WebElement selectedList, WebElement productAmountBasket, long timeOutInSeconds) {
        waitForVisibility(selectedList, timeOutInSeconds);
        String expectedAmount = getAttributeWithStrValue(selectedList, "Value");
        String actualAmount = getTextElement(productAmountBasket);
        Assert.assertTrue("Product amount is false!!!", actualAmount.contains(expectedAmount));
    }

    public void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
        }
    }

    public void searchAction(WebElement element, long timeInsecond, String key){
        waitForClickablility(element, timeInsecond);
        element.sendKeys(key, Keys.ENTER);
    }

    public static String elementName = null;

    public void keepName(WebElement element,long timeInSecond){
        elementName = element.getText();
        System.out.println(elementName);
    }

    public void switchToTest() {
        String currentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!currentWindow.equals(window)) {
                driver.switchTo().window(window);
            }
        }
    }

}




