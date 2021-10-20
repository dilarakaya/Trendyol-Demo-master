package base;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends Driver {


    @Before
    public void beforeTest() {
        getDriver();
        pagefactory(driver);
    }

    @After
    public void afterTest() {
      //  closeDriver();
    }

}

