package navigate;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoadingLink().clickEx1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goTo("https://www.google.com");

    }
}
