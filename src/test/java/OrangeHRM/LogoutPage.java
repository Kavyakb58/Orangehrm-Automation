package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
    WebDriver driver;
    public LogoutPage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "oxd-userdropdown-icon") WebElement profileDropdown;

    @FindBy(xpath = "//a[text()='Logout']") WebElement logoutBtn;

    

    public void logout() 
    {
        profileDropdown.click();
        logoutBtn.click();
    }
}
