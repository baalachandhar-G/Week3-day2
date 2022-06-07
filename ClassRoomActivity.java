package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomActivity {

	public static void main(String[] args) {
		

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		//implicit  wait
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Maximize
		
		Driver.manage().window().maximize();
		
		Driver.get("http://leafground.com/pages/Link.html");
		
		List<WebElement> Link = Driver.findElements(By.tagName("a"));
		
		System.out.println(Link.size());
		
		WebElement FristLink = Link.get(1);
		
		Select SS= new Select(FristLink);
	
	    SS.selectByVisibleText("Go to Home Page");
	}

}
