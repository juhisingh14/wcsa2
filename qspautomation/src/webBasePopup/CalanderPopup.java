package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.cleartrip.com");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']"));
	}

}
