package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver= new ChromeDriver();
		
		//implicit  wait
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Maximize
		
		Driver.manage().window().maximize();
		
		Driver.get("http://leafground.com/pages/Dropdown.html");
		
		List<WebElement> DP = Driver.findElements(By.tagName("Select"));
		
		System.out.println(DP.size());
		
		WebElement Firstone = DP.get(0);
		
		Select ss= new Select(Firstone);
		
		ss.selectByIndex(2);
		
        WebElement Firstone1 = DP.get(2);
		
		Select ss1= new Select(Firstone1);
		
		ss1.selectByIndex(2);
		
		
	}

}
