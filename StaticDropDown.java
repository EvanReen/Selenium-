package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

    public static void main(String[] args) {
        
        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //get url
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //maximized browser mode
        driver.manage().window().maximize();

        //dropdown with select tag - static
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        //creating object of the class
        Select dropdown = new Select(staticDropdown);

        //selecting 3rd index from the static dropdown
        dropdown.selectByIndex(3);

        //returns the text of the first web element in the static dropdown
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //another way of selecting an element from the static dropdown list 
        dropdown.selectByVisibleText("AED");

        //will now print AED
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //selecting by value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        


    }
    
}
