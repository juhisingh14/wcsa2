package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneChat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement frameElement = driver.findElement(By.id("chat-widget"));
	      driver.switchTo().frame(frameElement);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='lc-1mwyrdx e16i86ec0']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//p[@id='react-aria-5356633382-7']")).sendKeys("pallavi");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavi@14gmail.com");
		driver.findElement(By.xpath("//input[@id='7uozjrmj0q_146917605549304831']")).sendKeys("9955740111");


	}

}
