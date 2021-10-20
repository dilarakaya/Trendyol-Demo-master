package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPageObj extends BaseTest {

    @FindBy (css = "input[class='search-box']")
    public static WebElement searchTextBox;

    @FindBy (css = "div.prdct-cntnr-wrppr>div")
    public static List<WebElement> listPageNumbers;

    @FindBy (css = "div[class='overlay']")
    public static WebElement popup;

    @FindBy (css = "[class='fv']")
    public static WebElement favButton;

    @FindBy(css = "button.add-to-basket")
    public static WebElement addbasket;

}
