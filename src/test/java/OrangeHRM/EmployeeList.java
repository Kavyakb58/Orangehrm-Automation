package OrangeHRM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeList 
{
	    WebDriver driver;
	    public EmployeeList(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

        //Locator
	    @FindBy(xpath = "//div[@class='oxd-table-body']//div[@role='row']") List<WebElement> employeeRows;

	    //Action
	    public void verifyEmp(String name) 
	    {
	        for (WebElement row : employeeRows) 
	        {
	            if (row.getText().contains(name)) 
	            {
	                System.out.println(name + " - Name Verified");
	                return;
	            }
	        }
	        System.out.println(name + " - Name NOT Found");
	    }
	}



