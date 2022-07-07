package software;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

 
  
  
public class tring {  
  
public static void main(String[] args) throws InterruptedException, IOException {  
          
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                  
// Instantiate a ChromeDriver class.      
ChromeDriver driver=new ChromeDriver();  
          
 
driver.manage().window().maximize();
  
driver.get("https://d1hapd67qimv5t.cloudfront.net/");


driver.findElementById("standard-helperText").sendKeys("sanjay93@tringapps.com");

driver.findElementById("standard-adornment-password").sendKeys("1234567890");

driver.findElementByXPath("//button[text()='Login']").click();

driver.findElementByXPath("//input[@name='Marks in C']");

//driver.findElementById(":r2:").sendKeys("nfd");


//String javascript = "document.getElementById(':r2:')";  
//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
//WebElement element = (WebElement) jsExecutor.executeScript(javascript);


//driver.quit();//String javascript = "document.getElementById(':r2:')";  
//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
//WebElement element = (WebElement) jsExecutor.executeScript(javascript);

}
}