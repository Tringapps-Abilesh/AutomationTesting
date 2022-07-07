package software;


import org.openqa.selenium.chrome.ChromeDriver;


public class frames {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "/home/tringapps/Downloads/chromedriver");
		// Create a new instance of the FireFox driver 
		ChromeDriver driver = new ChromeDriver(); 

		// Storing the Application Url in the String variable 
		String url = "https://letcode.in/frame"; 

		//Launch the ToolsQA WebSite 
		driver.manage().window().maximize();

		driver.get(url); 
		driver.switchTo().frame("firstFr");
		driver.findElementByName("fname").sendKeys("abi");
		driver.findElementByName("lname").sendKeys("r");
		driver.switchTo().frame(1);
		driver.findElementByName("email").sendKeys("abi@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("tgode");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[.='Watch tutorial']").click();		


		Thread.sleep(3000);
		driver.quit();	
	}
}