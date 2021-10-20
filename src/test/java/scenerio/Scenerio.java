package scenerio;

import base.BaseTest;
import base.ConfigReader;
import org.junit.Test;
import page.BasketPageObj;
import page.HomePageObj;
import page.ShopPageObj;
import stepDef.StepDef;

public class Scenerio extends BaseTest {
    StepDef stepDef = new StepDef();

    @Test()
    public void test() throws InterruptedException {


        stepDef.waitForPageToLoad(10); //WAIT LOAD FOR HOMEPAGE

        stepDef.existElementClick(HomePageObj.cookie, 5); //POP UP

        stepDef.hover(HomePageObj.loginIcon, 5); //HOVER LOGIN ICON
        stepDef.clickWithWait(HomePageObj.loginPageButton, 5); // CLICK LOGIN BUTTON
        stepDef.sendTextWithWait(HomePageObj.userNameTextBox, ConfigReader.userName, 5); //SEND USERNAME
        stepDef.sendTextWithWait(HomePageObj.passWordTextBox, ConfigReader.passWord, 5); //SEND PASSWORD
        stepDef.clickWithWait(HomePageObj.loginButton, 5); //CLICK LOGIN BUTTON
        stepDef.waitForClickablility(HomePageObj.homePageBanner,5);
        stepDef.searchAction(ShopPageObj.searchTextBox, 5,ConfigReader.keyWord); //SEARCH 'BİLGİSAYAR'
        stepDef.existElementClick(HomePageObj.cookieTwo, 5); //POP UP
        stepDef.randomSelectProduct(ShopPageObj.listPageNumbers,ShopPageObj.popup,5);

        stepDef.switchToTest();

        stepDef.clickWithWait(ShopPageObj.favButton,10);
        stepDef.clickWithWait(ShopPageObj.addbasket,10);
        //stepDef.keepProductPrice(BasketPageObj.highPriceOnPage,BasketPageObj.lowPriceOnPage,10);
        stepDef.keepName(BasketPageObj.productName, 5);
        stepDef.clickWithWait(BasketPageObj.basketIcon,10);

    }
}
