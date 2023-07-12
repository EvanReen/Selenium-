package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTutorial3 {

    public static void main(String[] args) {
        
        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //get url
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //sibling - Child to parent traverse
        //header/div/button[1]/following-sibling::button[1], should get the login button (parent to child) parent is the div
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

        //going from child to parent and getting login button in another way using xpath
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

        //*cannot do these with css */



    }
    
}
