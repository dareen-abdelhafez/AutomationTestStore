package LoginPage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver=new ChromeDriver();
	String TheURL="https://automationteststore.com/;";
	String SignUpPage="https://automationteststore.com/index.php?rt=account/create";
	Random rand=new Random();
	
	@BeforeTest
	
	public void mysetup() {
		
		driver.get(TheURL);
		driver.manage().window().maximize();
		
		
		
		
	}
	@Test(priority=1)
	
	public void signup() {
		
		driver.navigate().to(SignUpPage);
		//ELEMNTS
		WebElement firstnameinput=driver.findElement(By.name("firstname"));
		WebElement lastNameinput=driver.findElement(By.id("AccountFrm_lastname"));
		WebElement emailinput=driver.findElement(By.id("AccountFrm_email"));
		WebElement telephoneinput=driver.findElement(By.id("AccountFrm_telephone"));
		WebElement faxinput=driver.findElement(By.id("AccountFrm_fax"));
		WebElement companyinput=driver.findElement(By.id("AccountFrm_company"));
		WebElement addressinput1=driver.findElement(By.id("AccountFrm_address_1"));
		WebElement addressinput2=driver.findElement(By.id("AccountFrm_address_2"));
		WebElement cityinput=driver.findElement(By.id("AccountFrm_city"));
		WebElement zipcodeinput=driver.findElement(By.id("AccountFrm_postcode"));
		WebElement loginNameinput=driver.findElement(By.id("AccountFrm_loginname"));
		WebElement Passwordinput=driver.findElement(By.id("AccountFrm_password"));
		WebElement passwordConfirminput=driver.findElement(By.id("AccountFrm_confirm"));
		
		
		//DATA
		String [] firstname={"dareen","zaina","leen","lubna"};
		  int myrandomindex=rand.nextInt(firstname.length);
		String Randomfirstname=firstname[myrandomindex];
		String [] lastname={"abdelhafez","basem","mohammad","abdallah","maher"};
		int randomlastname=rand.nextInt(lastname.length);
		String Randomlastname=lastname[randomlastname];
		int randomnumberforemail=rand.nextInt(6666);
		String email=firstname[myrandomindex]+lastname[randomlastname]+randomnumberforemail+"@gmail.com";
		String telephone="0798888655";
		String fax="6355363";
		String company="abcd";
		String address11="jabal al hussein";
		String address21="marj al hamam";
		String city="amman";
		String postalcode="112233";
		String password="Test@1234";
		String loginname=firstname[myrandomindex]+lastname[randomlastname]+randomnumberforemail;
		
		
		
		//ACTIONS
		firstnameinput.sendKeys(Randomfirstname);	
		lastNameinput.sendKeys(Randomlastname);
		emailinput.sendKeys(email);
		telephoneinput.sendKeys(telephone);
		faxinput.sendKeys(fax);
		companyinput.sendKeys(company);
		addressinput1.sendKeys(address11);
		addressinput2.sendKeys(address21);
		cityinput.sendKeys(city);
		zipcodeinput.sendKeys(postalcode);
		loginNameinput.sendKeys(loginname);
		Passwordinput.sendKeys(password);
		passwordConfirminput.sendKeys(password);


		
		
		
	}
	
	
	
}
