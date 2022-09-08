package DoNotUseDelay;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodOfWebElement.ClickMethod;
public class FlipkartloginButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		// driver.findElement(By.className("V3C5bO")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
         //driver.findElement(Bt.xpath("//span[.='Login'].click();
	}

}
