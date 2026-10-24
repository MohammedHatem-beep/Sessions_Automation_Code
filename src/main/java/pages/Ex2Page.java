package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2Page {
    private static WebDriver driver;
    private By startButton= By.cssSelector("#start>button");
    private By loadedText= By.cssSelector("#finish>h4");
    public Ex2Page(WebDriver driver) {
        this.driver=driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public String clickLoadedText(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedText)));
        FluentWait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(loadedText));
        wait.until(driver -> {
            System.out.println("Checking for the element");
            return driver.findElement(loadedText).isDisplayed();
        });


        return driver.findElement(loadedText).getText();
    }

}
