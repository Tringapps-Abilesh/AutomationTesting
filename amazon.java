package software;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {  
	  
public static void main(String[] args) throws InterruptedException, IOException {  
          
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                  
// Instantiate a ChromeDriver class.      
ChromeDriver driver=new ChromeDriver();  
driver.manage().window().maximize();       

// Storing the Application Url in the String variable  
String url = ("https://www.amazon.in/");  
       
//Launch the ToolsQA WebSite  
driver.get(url); 
driver.findElement(By.xpath("//span[text()[normalize-space()='Back to top']]")).click();

//driver.findElement(By.xpath("//img[@alt='My First Library: Boxset of 10 Board Books for Kids']")).click();

//driver.findElement(By.id("buy-now-button")).click();
//
//driver.findElement(By.id("ap_email")).sendKeys("abilesh166@gmail.com");
//
//driver.findElement(By.xpath("(//input[@id='continue'])[1]")).click();
//
//driver.findElement(By.linkText("Details")).click();
//
//driver.findElement(By.tagName("button")).click();
//driver.quit();
}
}