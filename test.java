package software;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
  
import org.openqa.selenium.chrome.ChromeDriver;

 
  
  
public class test {  
  
public static void main(String[] args) throws InterruptedException {  
          
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                  
// Instantiate a ChromeDriver class.      
ChromeDriver driver=new ChromeDriver();  
          
// Storing the Application Url in the String variable  
String url = ("https://letcode.in/");  
driver.manage().window().maximize();       
//Launch the ToolsQA WebSite  
driver.get(url); 

driver.findElementByXPath("//a[.='Log in']").click(); 
driver.findElementByName("email").sendKeys("abilesh166@gmail.com",Keys.TAB);
//Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("Abi@12345");
driver.findElement(By. xpath("//button[.='LOGIN']")).click();
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().to("https://letcode.in/buttons");

//Thread.sleep(3000);
//driver.quit();	
}
}