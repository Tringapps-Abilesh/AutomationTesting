package software;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",
			//	"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAjwwo-WBhAMEiwAV4dybd5CxWTxt7pMhc5vJHPXk2kT0LfpxJ3xA9PSfM5VBcwaERTNdDmJ-RoCSggQAvD_BwE");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
		//driver.findElementByXPath("//button[.='✕']").click();
		WebElement elec = driver.findElementByXPath("//div[text()='Fashion']");
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		//driver.findElementByLinkText("Apple").click();
		WebElement men=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='CXW8mj'])[2]")).click();
	}

}