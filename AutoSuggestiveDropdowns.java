package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdowns {

    public static void main(String[] args) throws InterruptedException {
        
         //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //get url
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //get id of dropdown
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        //sleep for 3 seconds
        Thread.sleep(3000);

        //getting list element using cssSelector with li[class='ui-menu-item'] a locator
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        //enhanced for loop of list
        for(WebElement option :options){
            
            //if option = Inida then click it ignore case
            if(option.getText().equalsIgnoreCase("India")){
                
                option.click();
                
                //ends when this is clicked
                break;
            }

        } 

    }
    
}
