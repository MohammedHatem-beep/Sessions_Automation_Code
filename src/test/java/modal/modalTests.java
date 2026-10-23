package modal;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class modalTests extends BaseTests {
    @Test
    public void testModal() throws InterruptedException {

        var modal=homePage.clickEntryAdLink();
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        modal.clickClose();
        modal.clickRestartLink();
        assertEquals(modal.gethHeaderText(),"Entry Ad", "The header text is incorrect");
    }


}
