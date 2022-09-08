package AssertionClassWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRmAssertion {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test()
	public void OrangeHRM() throws InterruptedException
	{
		
		//hard assert
		boolean statusOfusernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox, true);
		Reporter.log("username text box is displayed",true);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//---------------------------------------------------------
		//hard assert
		boolean statusOfpaswordtextBox = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertEquals(statusOfpaswordtextBox, true);
		Reporter.log("pasword text box is displayed",true);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//----------------------------------------------------------
		//hard assert
		boolean statusOfLoginButton = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		Assert.assertEquals(statusOfLoginButton, true);
		Reporter.log("login button  is displayed",true);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//softAssert
		Thread.sleep(5000);
	    SoftAssert softassert=new SoftAssert();
		String homePageTitle = driver.getTitle();
		softassert.assertEquals(homePageTitle, "OrangeHRM");

		Reporter.log("Home page title is verified",true);
		
		softassert.assertAll();
	   }

  	    @AfterMethod
	    public void tearDown()
	   {
		driver.quit();
	   }


}
	

	
