package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickMessage= By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }
    public NewWindowPage clickOnmessage()
    {
        driver.findElement(clickMessage).click();
        return new NewWindowPage(driver);
    }
}
