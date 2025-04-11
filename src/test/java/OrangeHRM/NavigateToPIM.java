package OrangeHRM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateToPIM 
{

	WebDriver driver;
	//Constructor
	    public NavigateToPIM(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	//Locators
	@FindBy(xpath="//span[normalize-space()='PIM']") WebElement pim;
	
	
	//action method
	public void PIM()
	{
		pim.click();
	}
	
	
}
