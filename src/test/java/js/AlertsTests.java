package js;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAlert(){
        var javaScriptAlertsPage=homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickJSAlert();

    }
}
