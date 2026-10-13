package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();

    }
    public DropdownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlertsLink()
    {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public HoverPage clickHoverLink()
    {
        clickLink("Hovers");
        return new HoverPage(driver);
    }
}
