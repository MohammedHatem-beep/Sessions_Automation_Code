package base;


import com.google.common.io.Files;
import listeners.MyListener;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver(getChromeOptions());

        homePage=new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @BeforeMethod()
            public void goHome()
    {
        WebDriverListener listener= new MyListener();
        WebDriver decorated=new EventFiringDecorator<>(listener).decorate(driver);

        decorated.get("https://the-internet.herokuapp.com/");
        setCookie();
        homePage=new HomePage(decorated);
    }
    @AfterMethod()
    public void recordFailure(ITestResult result) throws IOException {
        if(ITestResult.FAILURE==result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
//        chromeOptions.addArguments("--headless");
        chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        return chromeOptions;
    }
    private void setCookie(){
        Cookie cookie=new Cookie("Route","123");
        driver.manage().addCookie(cookie);

    }
}
