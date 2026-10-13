package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;


import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testDropdown()
    {
        String option ="Option 1";
        var dropdownPage=homePage.clickDropDown();
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions=dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1," The number of options are not correct.");
        assertTrue(selectedOptions.contains(option),"The option is not selected.");

    }

}
