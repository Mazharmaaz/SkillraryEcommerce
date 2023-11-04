package POM_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	//Declaration
		//Address of download invoice
		
		@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
		private WebElement Facebook;
		
		//Initialization
		
		public TestingPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

	
	  //Utilization

		public WebElement getFacebook() 
		{
		return Facebook;

		}

		//Business Libraries

			public void FacebookWebElement()
			{
				Facebook.click();
			}

}