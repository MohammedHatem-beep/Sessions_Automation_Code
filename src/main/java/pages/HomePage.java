package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //private By formAuthenticationLink=By.linkText("Form Authentication");
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public LoginPage clickFormAuthenticationLink(){
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();

    }
    public DropdownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
}
