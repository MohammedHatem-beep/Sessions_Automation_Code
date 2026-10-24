package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WindowTests extends BaseTests {
    @Test
    public void testSwitchToTab()
    {
       var newWindowPage= homePage.clickMultipleWindowsLink().clickOnmessage();
       getWindowManager().switchToTab("New Window");
       String headerText=newWindowPage.getText();
       assertEquals(headerText,"New Window","You are in the wrong context");
    }
}
