package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTutorial {

    public static void main(String[] args) {
         

        //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //implicit wait - 5 seconds timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //url
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //gets id and types Evan into username field
        driver.findElement(By.id("inputUsername")).sendKeys("Evan");

        //gets password by name and types hello123! into password field
        driver.findElement(By.name("inputPassword")).sendKeys("hello123!");

        //gets sign in button by class name and clicks the button
        driver.findElement(By.className("signInBtn")).click();

        //css selector for incoreect username or password error 
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

         //forgot your password? link 
        driver.findElement(By.linkText("Forgot your password?")).click();

        //waiting 1 seconds as sliding feature is not letting selenium enter the details below (waiting for objects to show on the page)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Xpath entering name
        driver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys("Evan");

        //css selector entering email
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Evan@gmail.com");

        //xpath identifying phone number in form
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

         //clears field by css
        //driver.findElement(By.cssSelector("//input[placeholder ='Email']")).clear();

        //using xpath to clear fields with similar identifiers all 3 fields use text so use index of 1 or 2 to get email field
        //.findElement(By.cssSelector("//input[@type ='Text'][1]")).clear();


        //gets reset login button by class name and clicks the button
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        //getting information message
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //clicking go to login button using xpath
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

        //waiting 1 seconds as sliding feature is not letting selenium enter the details below (waiting for objects to show on the page)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //entering login details again
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        //checking the box
        driver.findElement(By.id("chkboxOne")).click();

        //clicking submit button
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


        //clicking submit button another way
        //driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();


    }
    
}
