package Scripts;

import org.testng.annotations.Test;

import Genaric_Library.BaseClass;
import Genaric_Library.WebDriverUtilities1;
import POM_pageobjectmodel.DemoSkillraryPage;
import POM_pageobjectmodel.DownloadInvoicePage;
import POM_pageobjectmodel.SkillraryHomePage;

public class TestCase2 extends BaseClass {

	@Test
	public void tc2() {
		
		SkillraryHomePage s= new SkillraryHomePage(driver); // created a object for skillraryhomepage
		
		s.gearsButton();   //business library of gears in skillraryhomepage
		
		s.skillraryDemoApp(); //business library of skillrary demo App in skillraryhomepage
		
		 WebDriverUtilities1 utilities = new WebDriverUtilities1();

		utilities.childBrowser(driver);
		
		DemoSkillraryPage ds= new DemoSkillraryPage(driver);  //created a object for DemoSkillraryPage
		
		ds.feedBckbtn();  // business library of feedbackbutton from DemoskillraryPage
		
		DownloadInvoicePage dI = new DownloadInvoicePage(driver);  // created a object for DownloadInvoicePage
		
		dI.downloadInvoiceButton();  //Business library of downloadInvoiceButton from DownloadInvoicePage
		
}
	
	}
