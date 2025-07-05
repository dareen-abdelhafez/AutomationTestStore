package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver=new ChromeDriver();
	String TheURL="https://automationteststore.com/;";
	String SignUpPage="https://automationteststore.com/index.php?rt=account/create";
	
	@BeforeTest
	
	public void mysetup() {
		
		driver.get(TheURL);
		driver.manage().window().maximize();
		
		
		
	}
	@Test(priority=1)
	
	public void signup() {
		
		driver.navigate().to(SignUpPage);
		
	}
	
	
	
}
