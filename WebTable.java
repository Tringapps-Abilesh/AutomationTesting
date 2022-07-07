package software;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElementById("simpletable");
		
		List<WebElement> headers = table.findElements(By.tagName("td"));
		
		for (WebElement header : headers)
		{
			String text = header.getText();
			System.out.println(text);
		}
		
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++)
		{
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();

			if(text.equals("Raj")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
			
		}
		driver.close();
	}
}
