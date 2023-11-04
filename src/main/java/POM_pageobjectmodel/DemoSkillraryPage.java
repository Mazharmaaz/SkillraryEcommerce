package POM_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	
	//Declaration
	//Address of select catagory
	
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//Address of feedback
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBckbtn;
	
	//Initialization
	
	public DemoSkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization

	public WebElement getSelectDd() {
		return selectDd;
	}

	public WebElement getFeedbackbtn() {
		return feedBckbtn;
	}
	
	//Business Libraries
	
	public void feedBckbtn()
	{
		
		feedBckbtn.click();
	}


	
}


