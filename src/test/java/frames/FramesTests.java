package frames;

import base.BaseTests;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames(){
        var nestedFramesPage=homePage.clickFramesLink().clickNestedFramesLink();
        assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"),"The left text is incorrect");
        assertTrue(nestedFramesPage.getBottomFrameText().contains("BOTTOM"),"The bottom text is incorrect");


    }
}
