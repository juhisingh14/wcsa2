package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreesetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("file:///C:/Users/Administrator/Desktop/htmlDocs/multiselectdropdown.html");
		WebElement multiselected = driver.findElement(By.id("menu"));
		Select sel = new Select(multiselected);
		
		
		 List<WebElement> options = sel.getOptions();
		TreeSet<String> s = new TreeSet<String>();
		for(int i=0;i<options.size();i++)
		{
			String textToInsert = options.get(i).getText();
			s.add(textToInsert);
		}
		for(String text:s)
		{
			System.out.println(text);
		}

	}

}
