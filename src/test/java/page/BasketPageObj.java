package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPageObj extends BaseTest {

    @FindBy(css = "prc-dsc")
    public static WebElement lowPriceOnPage;

    @FindBy(css = "span.prc-slg")
    public static WebElement highPriceOnPage;

    @FindBy(css = ".pr-new-br>span")
    public static WebElement productName;

    @FindBy(css = "[class='link account-basket']")
    public static WebElement basketIcon;





    @FindBy(css = "button[type='button'][class='control-button gg-ui-button plr10 gg-ui-btn-default']")
    public static WebElement addBasketButton;

    @FindBy(css = "[class='tyj39b-5 lfsBU']")
    public static WebElement closeCookie;

    @FindBy(css = "p[class='new-price']")
    public static WebElement basketPrice;


    @FindBy(css = "select[class='amount']")
    public static WebElement selectList;

    @FindBy(css = "select[class='amount']>option[value='2']")
    public static WebElement selectOption;

    @FindBy(css = "div[class='gg-d-16 gg-m-14 detail-text']")
    public static WebElement productAmountBasket;

    @FindBy(css = "a[title='Sil']>i")
    public static WebElement deleteButton;

    @FindBy(css = "div[class='empty-cart-info gg-w-24 gg-d-21 gg-t-24 gg-m-24'")
    public static WebElement emptyCardInfo;

}
