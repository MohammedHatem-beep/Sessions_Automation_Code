package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload()
    {
        String absoulePath = "C:\\Users\\Mohammed\\IdeaProjects\\Sessions_Automation_Code\\resources\\";
        String fileName = "aaaa.txt";
        var fileUploadPage=homePage.clickFileUploadLink();
        fileUploadPage.uploadFile(absoulePath+fileName);
        assertEquals(fileUploadPage.getFileUploadedFileName(), fileName,"The file uploaded is incorrect.");

    }
}
