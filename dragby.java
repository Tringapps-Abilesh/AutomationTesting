package software;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragby {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/tringapps/Downloads/chromedriver");
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		//builder.dragAndDropBy(source, 30, 45).perform();
		int x=source.getLocation().getX();
		int y=source.getLocation().getY();
		builder.dragAndDropBy(source, x+70, x+50).perform();
		
	}

}