package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntroduction {
    
    @Test
    public static void main(String[] args) {
        
        //Invoking Browser

        //Chrome - ChromeDriver exten->Methods close get

        //Firefox- FirefoxDriver ->methods close get

        // WebDriver  close  get

        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();


        //Firefox
        //WebDriver driver1 = new FirefoxDriver();

        //Microsoft Edge
        //WebDriver driver2 = new EdgeDriver();


        //url
        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        //closes current window
        //driver.close();

        //closes all associated windows
        //driver.quit();





        
        
    }
}
