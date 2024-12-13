package GitDemoProject.GitDemoProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
         driver.get("https://www.naukri.com");
        
         driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
         driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("shaikhjamir28@gmail.com");
         driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Jamir@12345");
         driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Login')]")).click();
         
         driver.findElement(By.xpath("//div[@class='nI-gNb-drawer']")).click();
         driver.findElement(By.xpath("//a[contains(text(),'View & Update Profile')]")).click();
         driver.findElement(By.xpath("//li//span[contains(text(),'Resume headline')]")).click();
         driver.findElement(By.xpath("//div[@class='widgetHead']//span[contains(text(),'Resume headline')]//following-sibling::span[contains(text(),'editOneTheme')]")).click();
         driver.findElement(By.xpath("//textarea")).clear();
         driver.findElement(By.xpath("//textarea")).sendKeys("Automation QA Engineer | 4 Years of Hands-On Experience with Selenium + JAVA, TestNG, Agile Methodology , Manual testing, Investment Banking & CI-CD tools");
        driver.findElement(By.xpath("//button[contains(text(),'Save') and @class='btn-dark-ot']")).click();            		 
        
            
    }
}
