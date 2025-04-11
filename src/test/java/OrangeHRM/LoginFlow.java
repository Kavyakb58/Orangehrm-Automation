package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlow 
{
	
	WebDriver driver;
	//Constructor
	    public LoginFlow(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    //Locators
	    @FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	    @FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	    @FindBy(xpath="//button[normalize-space()='Login']") WebElement loginBtn;
	 
       //Action methods
	    public void login(String user, String pass) 
	    {
	        username.sendKeys(user);
	        password.sendKeys(pass);
	        loginBtn.click();
	    }
	}


