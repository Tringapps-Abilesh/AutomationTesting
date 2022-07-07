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

 
  
  
public class alert {  
  
public static void main(String[] args) throws InterruptedException, IOException {  
          
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                  
// Instantiate a ChromeDriver class.      
ChromeDriver driver=new ChromeDriver();  
          
 
       
  
driver.get("https://letcode.in/alert");
// accept
//driver.switchTo().alert().accept();
driver.findElementById("accept").click();
Alert alert = driver.switchTo().alert();
String text = alert.getText();
System.out.println("Simple alert text "+text);
alert.accept();
//
driver.findElementById("prompt").click();
Alert alert1 =driver.switchTo().alert();
alert1.sendKeys("abi");
alert1.accept();
	
//driver.quit();
}
}