package selenium;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

 
  
  
public class fluent {  
  
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

driver.findElement(By.xpath("//a[.='Log in']")).click(); 
driver.findElement(By.name("email")).sendKeys("abilesh166@gmail.com",Keys.TAB);
//Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("Abi@12345");
driver.findElement(By. xpath("//button[.='LOGIN']")).click();

Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(2))
.ignoring(NoSuchElementException.class);


WebElement ele=wait.until(new Function<WebDriver,WebElement>(){

	public WebElement apply(WebDriver driver) {
		// click "work space" button for next step
		WebElement link = driver.findElement(By.linkText("Edit"));
		if(link.isEnabled()) {
			System.out.println("found");
			link.click();
			System.out.println(driver.getCurrentUrl());
		}
		return link;
	}
	
});

//Thread.sleep(3000);
//driver.quit();	
}
}