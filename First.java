package software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		
	
		System.setProperty("webdriver.chrome.driver", "/home/tringapps/Downloads/chromedriver");
		// Create a new instance of the FireFox driver 
		WebDriver driver = new ChromeDriver(); 
		
		// Storing the Application Url in the String variable 
		String url = "https://demoqa.com/browser-windows/"; 
		
		//Launch the ToolsQA WebSite 
		driver.get(url); 
		String Title = driver.getTitle();  
		System.out.println(Title);
		String CurrentUrl = driver.getCurrentUrl(); 
		System.out.println(CurrentUrl);
		//String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		  
		
		
	}

}