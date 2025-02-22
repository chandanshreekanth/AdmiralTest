package utilites;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp(){
        driver=new BrowserDriver();
    }

    @After
    public void tearDown(){
//        driver.close();
    }
}
