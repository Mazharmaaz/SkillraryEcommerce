package POM_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	
	//Declaration
	//Address of download invoice
	
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadiInvoicebtn;
	
	//Initialization
	
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


  //Utilization

	public WebElement getDownloadInvoicebtn()
	{
		return downloadiInvoicebtn;
	}

//Business Library 
	
	public void downloadInvoiceButton()
	{
		downloadiInvoicebtn.click();
	}

}