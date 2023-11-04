package Genaric_Library;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class WebDriverUtilities1 {

	
		// 1.Generic method to handle DoubleClick
		
		public void doubleclick(WebDriver driver, WebElement ele)
		
		{
			Actions a =new Actions(driver);
			a.doubleClick(ele).perform();
		}

		// 2.Generic method to handle RightClick
		
		public void rightClcik(WebDriver driver, WebElement ele) 
		{
			Actions a= new Actions(driver);
			a.contextClick(ele).perform();
		}

		// 3.Generic method to handle MouseOvering
		
		public void mouseOvering(WebDriver driver, WebElement ele) 
		{
			Actions a= new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
		//4. Generic method to handle Drag&Drop
		
		public void dragAndDroping(WebDriver driver, WebElement ele1, WebElement ele2) 
		{
			Actions a= new Actions(driver);
			a.dragAndDrop(ele1, ele2).perform();
		}
		
		// 5.Generic method to handle Drop down
		
		public void dropDown(WebElement ele, String text)
		{
			Select s= new Select (ele);
			s.selectByVisibleText(text);
		}
		
		// 6.Generic method to handle Frame
		public void frames (WebDriver driver, String value)
		{
			driver.switchTo().frame(value);
			
		}

		//7. Handling default content
		
		public void frames(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		
		
		//8.Handling child browser
		
		public void childBrowser(WebDriver driver) 
		{
			Set <String>child=driver.getWindowHandles();
			for (String b: child) 
			{
				driver.switchTo().window(b);
			}
			
		}	

		//9.Handling Scrolling
		
		public void Scrolling(WebDriver driver, WebElement ele)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()",ele);
			
		}
		
		//10.Handling Popup
		
		public void popup(WebDriver driver)
		{
			driver.switchTo().alert().accept();
			
		}
		
		// Handling a Screenshots
		 public void ss(WebDriver driver) throws Throwable 
		 {
			 TakesScreenshot ts= (TakesScreenshot)driver;
			 File src =ts.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./Snaps/flipkart.png");
			 FileUtils.copyFile(src, dest);
		 }
		 
}
