package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {
        
        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //get url
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //maximized browser mode
        driver.manage().window().maximize();

        //  //a[@value='MAA']  - Xpath for chennai

        //  //a[@value='BLR']

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

        // click on the second xpath node 
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();


        /* another way to do it without indexes (some comapnies dont like using indexes(coding standards))


        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();


        */

    }
    
}
