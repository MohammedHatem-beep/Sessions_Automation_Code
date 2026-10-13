package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figureBox=By.className("figure");
    private By figureCaption=By.className("figcaption");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }
    public FigureCaption  hoverOverFigure(int index)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(figureBox).get(index-1)).perform();
        return new FigureCaption(driver.findElements(figureCaption).get(index-1));
    }
    public class FigureCaption {
        private WebElement caption;
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

    public boolean isCaptionDisplayed(int index)
    {
        return driver.findElements(figureCaption).get(index).isDisplayed();
    }
        }
}
