package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private By dropdownLocator = By.id("dropdown");
    private WebDriver driver;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropdown(String option){
        //Select dropdown = new Select(driver.findElement(dropdownLocator));
        //dropdown.selectByContainsVisibleText(option);
        getDropdown().selectByVisibleText(option);
    }

    public List <String> getSelectedOption(){
        List<WebElement> selectedElements= getDropdown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for (WebElement element : selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;

    }
    public Select getDropdown(){
        return new Select(driver.findElement(dropdownLocator));
    }

}
