package js;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class AlertsTests extends BaseTests {
    @Test
    public void testAlert(){
        var javaScriptAlertsPage=homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickJSAlert();
        assertEquals(javaScriptAlertsPage.getAlertText(),"I am a JS Alert","The alert text is not correct");
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You successfully clicked an alert","The result text is not correct");
    }
    @Test
    public void testConfirm(){
        var javaScriptAlertsPage=homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickJSConfirm();
        assertEquals(javaScriptAlertsPage.getAlertText(),"I am a JS Confirm","The alert text is not correct");
        javaScriptAlertsPage.dismissConfirm();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You clicked: Cancel","The result text is not correct");
    }
    @Test
    public void testPrompt(){
        var javaScriptAlertsPage=homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickJSPrompt();
        assertEquals(javaScriptAlertsPage.getAlertText(),"I am a JS prompt","The alert text is not correct");
        javaScriptAlertsPage.setPromptText("Route");
        javaScriptAlertsPage.acceptAlert();
        assertEquals(javaScriptAlertsPage.getResultMessage(),"You entered: Route","The result text is not correct");
    }

}
