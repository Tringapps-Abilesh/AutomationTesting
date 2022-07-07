package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
  
import org.openqa.selenium.chrome.ChromeDriver;

 
  
  
public class linktext {  
  
public static void main(String[] args) throws InterruptedException {  
          
  
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                      
ChromeDriver driver=new ChromeDriver();  
          
String url = ("https://www.javatpoint.com/software-testing-tutorial");  
driver.manage().window().maximize();       

driver.get(url);
System.out.println(driver.getCurrentUrl());
//driver.findElement(By.linkText("Types of Software Testing")).click();
driver.findElement(By.partialLinkText ("Waterfall")).click();
System.out.println(driver.getCurrentUrl());

driver.quit();

	
}
}