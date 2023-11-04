package POM_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage
{

	//Declaration
	//Address of gears
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//Address of skillrary demo app
	
	@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//Address of search text field
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//Address of search icon
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;

     //Initialization

  public SkillraryHomePage(WebDriver driver)
   {
	 PageFactory.initElements(driver, this);
   }

  //Utilization(Here We use Getter Method)

 public WebElement getGearsbtn()
 {
	return gearsbtn;
 }


 	public WebElement getSkillrarydemoapp()
 {
	return skillrarydemoapp;
 }


 	public WebElement getSearchTf()
 {
	return searchTf;
 }


 	public WebElement getSearchIcon()
  {
	return searchIcon;
  }
 	
 //  Business library	
	public void gearsButton() {
		gearsbtn.click();
	
	}
	
 public void skillraryDemoApp() {
	skillrarydemoapp.click();
    }

 public void searchTextDield(String data) {
	 searchTf.sendKeys(data);
	
    }
}



