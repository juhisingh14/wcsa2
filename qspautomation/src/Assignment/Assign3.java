package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		 WebElement searchbox = driver.findElement(By.name("q"));
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("412234");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		/*
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
	   robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);    
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String parentHandle = driver.getWindowHandle();
	Set<String> alltabs = driver.getWindowHandles();
	for(String tab:alltabs)
	{
		System.out.println(tab);
	if(parentHandle.contentEquals(tab));
		{
			driver.switchTo().window(tab);
		}
		else
		{
							
      }*/ 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.id("//span[.='Place Order']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("7250807588");
		//Thread.sleep(3000);
	
	
	}

}
