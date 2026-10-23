package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton= By.id("file-upload");
    private By fileSubmitButton= By.id("file-submit");
    private By uploadFiles= By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile(String absoulteFilePath){
        driver.findElement(fileUploadButton).sendKeys(absoulteFilePath);
        clickSubmitButton();

    }
    private void clickSubmitButton(){
        driver.findElement(fileSubmitButton).click();
    }
    public String getFileUploadedFileName(){
        return driver.findElement(uploadFiles).getText();
    }
}
