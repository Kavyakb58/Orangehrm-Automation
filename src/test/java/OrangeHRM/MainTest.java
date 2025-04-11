package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest 
{
	WebDriver driver;
	@BeforeClass
	void Setup() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test
	void TestFeatures() 
	{
	    LoginFlow ip = new LoginFlow(driver);
	    ip.login("Admin", "admin123");
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	    NavigateToPIM mp = new NavigateToPIM(driver);
	    mp.PIM();

	    AddEmployee addEmp = new AddEmployee(driver);
	    String[][] employees = {{"Ava", "Smith"}, {"Liam", "Brown"}, {"Mia", "Taylor"}};

	    for (String[] emp : employees) 
	    {
	        addEmp.NewEmployee(emp[0], emp[1]);
	        mp.PIM(); 
	    }

	    EmployeeList em = new EmployeeList(driver);
	    for (String[] emp : employees) 
	    {
	        em.verifyEmp(emp[0]);
	    }

	    LogoutPage logout = new LogoutPage(driver);
	    logout.logout();
	}
}