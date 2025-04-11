package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee
{
	    WebDriver driver;
	    
	    public AddEmployee(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[normalize-space()='Add Employee']")  WebElement addemployee;
	    @FindBy(xpath="//input[@placeholder='First Name']") WebElement firstName;
	    @FindBy(xpath="//input[@placeholder='Last Name']") WebElement lastName;
	    @FindBy(xpath = "//button[normalize-space()='Save']") WebElement save;

	   

	    public void NewEmployee(String first, String last) 
	    {
	    	addemployee.click();
	        firstName.sendKeys(first);
	        lastName.sendKeys(last);
	        save.click();
	    }
	}


