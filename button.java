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

 
  
  
public class button {  
  
public static void main(String[] args) throws InterruptedException, IOException {  
          
// System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","/home/tringapps/Downloads/chromedriver");  
                  
// Instantiate a ChromeDriver class.      
ChromeDriver driver=new ChromeDriver();  
          
// Storing the Application Url in the String variable  
String url = ("https://letcode.in/buttons/");  
       
//Launch the ToolsQA WebSite  
driver.get(url); 
//int x=driver.findElementById("position").getLocation().getX();
//int y=driver.findElementById("position").getLocation().getY();
//System.out.println(x+"y="+y);
//WebElement ele=driver.findElementById("position");
//Point point=ele.getLocation();
//int x=point.getX();
//System.out.println(x);

//WebElement col=driver.findElementById("color");
//String color=col.getCssValue("background-color");
//System.out.println(color);

//Rectangle rec=driver.findElementById("property").getRect();
//Dimension dim =rec.getDimension();
//System.out.println(dim);
//System.out.println(dim.getHeight());
//System.out.println(rec.getHeight());

//File src=driver.getScreenshotAs(OutputType.FILE);
//File dest=new File("./img/image.png");
//FileHandler.copy(src, dest);

//WebElement col=driver.findElementById("home");
//File src1=col.getScreenshotAs(OutputType.FILE);
//File dest1=new File("./img/img.png");
//FileHandler.copy(src1, dest1);
//
//WebElement info=driver.findElementByClassName("has-background-info-light");
//File src2=info.getScreenshotAs(OutputType.FILE);
//File dest2=new File("./img/img1.png");
//FileHandler.copy(src1, dest1);


	
driver.quit();
}
}