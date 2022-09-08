package ActionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange' and .=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li[@class='placeholder']"));
			Actions act=new Actions(driver);
		    act.dragAndDrop(source, target).perform();
	}

}
