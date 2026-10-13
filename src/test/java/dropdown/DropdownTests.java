package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTests {
    @Test
    public void testDropdown()
    {
        var dropdownPage=homePage.clickDropDown();
        dropdownPage.selectFromDropdown("Option 1");
        List<String> selectedOptions=dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1," The number of options are not correct.");

    }

}
