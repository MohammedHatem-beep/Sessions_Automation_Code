package js;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptExecuterTests extends BaseTests {
    @Test
    public void testScrollToTable()
    {
        var largeAndDeepDom= homePage.clickLargeAndDeepLink();
        largeAndDeepDom.scrollToTable();
    }
    @Test
    public void testScrollToParagraph()
    {
        homePage.clickInfiniteScroll().scrollIntoParagraph(5);
    }
}
