package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTests {
    @Test
    public void testKeyPresses(){
        var keyPressesPage=homePage.clickKeyPressesLink();
        keyPressesPage.setText("a"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.resultMessage(),"You entered: BACK_SPACE","Message is incorrect");

    }
}
