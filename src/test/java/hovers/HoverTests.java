package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    public void testhover(){
        int index=1;
        var hoverPage=homePage.clickHoverLink();
        var figureCaption=hoverPage.hoverOverFigure(index);
        assertTrue(figureCaption.isCaptionDisplayed(),"The Caption is not displayed");
        assertEquals(figureCaption.getName(),"name: user"+index,"The name is not correct");
        assertEquals(figureCaption.getLinkText(),"View profile","The Link text is not correct");
        assertTrue(figureCaption.getLinkURL().contains("/users/"+index),"The Link URL is not correct");

    }
}
