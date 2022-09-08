package methodOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(3000);
		List<WebElement> webElementSuggession = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		//with for loop
		for(int i=0;i<webElementSuggession.size();i++)
		{
			WebElement sugg=webElementSuggession.get(i);
			String textOfsugg = sugg.getText();
			System.out.println(textOfsugg);
		}
		//with for each
		//for(WebElement sugg:webElementSuggession)
		//{
		//	String textofWebelement = sugg.getText();
		//	System.out.println(textofWebelement);
		//}
	}

}
