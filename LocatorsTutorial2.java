import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTutorial2 {

    public static void main(String[] args) throws InterruptedException {


        String name = "Evan";

         //WebDriver methods + class methods
        WebDriverManager.chromedriver().setup();

        // Chrome
        WebDriver driver = new ChromeDriver();

        //implicit wait - 5 seconds timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // WebDriver driver = new EdgeDriver();

        String password = getPassword(driver);

        //url
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //gets id and types Evan into username field
        driver.findElement(By.id("inputUsername")).sendKeys(name);

        //gets password by name and types hello123! into password field
        driver.findElement(By.name("inputPassword")).sendKeys(password);

        //gets sign in button by class name and clicks the button
        driver.findElement(By.className("signInBtn")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //getting youre succesfully logged in message
        System.out.println(driver.findElement(By.tagName("p")).getText());

        // Assert.assertEquals takes a minimum of 2 arguments and compares actual results with expected results
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        // Assert.assertEquals takes a minimum of 2 arguments and compares actual results with expected results
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

        //clicking logout button (* stands for anything)
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        //closing driver
        driver.close();
        
    }

    public static String getPassword(WebDriver driver) throws InterruptedException{
        
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText =driver.findElement(By.cssSelector("form p")).getText();

        //Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");

        // String[] passwordArray2 = passwordArray[1].split("'");

        // passwordArray2[0]

        String password = passwordArray[1].split("'")[0];

        return password;

        //0th index - Please use temporary password

        //1st index - rahulshettyacademy' to Login.



        //0th index - rahulshettyacademy

        //1st index - to Login.

}


    
}
