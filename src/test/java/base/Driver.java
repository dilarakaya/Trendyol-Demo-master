package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import page.BasketPageObj;
import page.HomePageObj;
import page.ShopPageObj;

public class Driver {

    public static WebDriver driver;


    public static void getDriver() {
        if (driver == null) {
            switch (ConfigReader.browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-notifications");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--disable-notifications");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;

            }
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.url);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void pagefactory(WebDriver driver) {
        PageFactory.initElements(driver, HomePageObj.class);
        PageFactory.initElements(driver, ShopPageObj.class);
        PageFactory.initElements(driver, BasketPageObj.class);

    }


}

