package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTest extends BaseTests {
    @Test
    public void testWaits(){
        var Ex1Page = homePage.clickDynamicLoadingLink().clickEx1();
        Ex1Page.clickStartButton();
        assertEquals(Ex1Page.clickLoadedText(),"Hello World!","The text is not visible yet");
    }
    @Test
    public void testWaits2(){
        var Ex2Page = homePage.clickDynamicLoadingLink().clickEx2();
        Ex2Page.clickStartButton();
            assertEquals(Ex2Page.clickLoadedText(),"Hello World!","The text is not visible yet");
    }
}
