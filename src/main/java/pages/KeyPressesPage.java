package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultMessage = By.id("result");
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }
    public void setText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String resultMessage(){
        return driver.findElement(resultMessage).getText();
    }


}
