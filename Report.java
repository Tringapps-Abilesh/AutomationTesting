package selenium;

import java.io.File;
//import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
///import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	static ChromeDriver driver;
	static ExtentReports report;
	static ExtentTest test;


	public static void main(String[] args) throws Exception {
		report = new ExtentReports("./Report/one.html");
		test=report.startTest("TC01","Enter Details");

		driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Open chrome");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO,"Maximize the window");

		String url = ("https://letcode.in/"); 
		driver.get(url);
		test.log(LogStatus.INFO,"Open URL:https://letcode.in/");
		screenshot("frontpage");



		driver.findElement(By. xpath("//a[.='Log in']")).click();
		test.log(LogStatus.INFO,"User clicks the login button in front page");
		screenshot("loginpage");

		driver.findElement(By.name("email")).sendKeys("abilesh166@gmail.com",Keys.TAB);
		test.log(LogStatus.INFO,"User enters the email id");

		driver.findElement(By.name("password")).sendKeys("Abi@12345");
		test.log(LogStatus.INFO,"User enters the password");

		driver.findElement(By. xpath("//button[.='LOGIN']")).click();
		test.log(LogStatus.INFO,"USer clicks the login button");
		Thread.sleep(3000);
		screenshot("main");

		report.endTest(test);

		test=report.startTest("TC02","Alert Box");

		driver.findElement(By.id("testing")).click();
		test.log(LogStatus.INFO,"User moves to Menu page ");
		screenshot("menupage");

		driver.findElement(By.linkText("Dialog")).click();
		test.log(LogStatus.INFO,"User moves to the alert page");
		screenshot("alertpage");




		driver.findElement(By.id("prompt")).click();
		test.log(LogStatus.INFO,"User clicks the alert button");


		Alert alert1=driver.switchTo().alert();
		//screenshot("alert-box");


		alert1.sendKeys("Abilesh");
		test.log(LogStatus.INFO,"User types in text box");
		//screenshot("input");

		alert1.accept();
		screenshot("accept");

		report.endTest(test);

		report.flush();

		driver.quit();


	}

	public static void screenshot(String name) throws Exception{
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./img/"+name+".png");
		FileHandler.copy(src, dest);
		test.log(LogStatus.INFO,test.addScreenCapture(dest.getAbsolutePath()));
	}

}