package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigations {

    public static void main(String[] args) {
        
        //this class will show to run in tests maximized browser mode + navigations such as back and forward using selenium

        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //maximized browser mode
        driver.manage().window().maximize();

        //get url 
        driver.get("http://google.com");

        //naviagte to this url 
        driver.navigate().to("https://rahulshettyacademy.com");
        
        //navigate backwards
        driver.navigate().back();
        
        //navigate forwards
        driver.navigate().forward();
    }
    
}
