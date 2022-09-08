package MultiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex1Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PC/OneDrive/Desktop/htmldocs/multiselectdropdown.html");
		
		Thread.sleep(3000);
		WebElement msdropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(msdropdown);
		for(int i=4;i<=8;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
	}

}
