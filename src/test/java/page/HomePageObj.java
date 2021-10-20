package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObj extends BaseTest {

    @FindBy(css = "a.close-button")
    public static WebElement cookie;

    @FindBy(css = ".cookie-policy-accept-button")
    public static WebElement cookieTwo;

    @FindBy(css = "[class='link account-user']")
    public static WebElement loginIcon;

    @FindBy(css = "[class='login-button']")
    public static WebElement loginPageButton;

    @FindBy(id = "login-email")
    public static WebElement userNameTextBox;

    @FindBy(id = "login-password-input")
    public static WebElement passWordTextBox;

    @FindBy(css = "[class='q-primary q-fluid q-button-medium q-button submit']")
    public static WebElement loginButton;

    @FindBy(css = "span[class='image-container']")
    public static WebElement homePageBanner;




}