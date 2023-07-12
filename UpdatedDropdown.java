package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {
        
        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //get url
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //maximized browser mode
        driver.manage().window().maximize();

        //getting passengers div + clicking it
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);

        //declaring variable i 
        int i = 1;

        //while loop for adding adults (will select 5 adults and then select done button)
        while(i < 5){

            driver.findElement(By.id("hrefIncAdt")).click();
            
            //incrementing it by 1
            i++;
        }


        /*for loop
        for (i = 0; i <5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }*/

        //clicking done button
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
    
}
