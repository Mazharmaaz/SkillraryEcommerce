package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import Genaric_Library.BaseClass;
import Genaric_Library.WebDriverUtilities1;
import POM_pageobjectmodel.DemoSkillraryPage;
import POM_pageobjectmodel.DownloadInvoicePage;
import POM_pageobjectmodel.SkillraryHomePage;
import POM_pageobjectmodel.TestingPage;

	public class TestCase1 extends BaseClass 
	
	{

		@Test
		public void tc1() throws Throwable 
		
		{
			
			SkillraryHomePage s= new SkillraryHomePage(driver); // created a object for skillraryhomepage
			
			s.gearsButton();   //business library of gears in skillraryhomepage
			
			WebDriverUtilities1 utilities = new WebDriverUtilities1();

			s.skillraryDemoApp(); //business library of skillrary demo app in skillraryhomepage
			
			utilities.childBrowser(driver);
			
			DemoSkillraryPage ds= new DemoSkillraryPage(driver); //created a object for DemoSkillraryPage
			
			utilities.dropDown (ds.getSelectDd(),pdata.getPropertydata("coursedd")); //get(pdata.getPropertydata
			
			TestingPage t= new TestingPage(driver); //created a object for testing page
			
			utilities.Scrolling(driver, t.getFacebook());
			
			Thread.sleep(3000);
			
			t.FacebookWebElement(); // business library of FacebookWebelement in TestingPage
			
				
			
		}
	
		
	}
	
		

	
	
		
	

