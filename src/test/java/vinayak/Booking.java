package vinayak;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Booking {
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Vinayak Eclipse practice\\Test01\\driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.booking.com/");
		
		driver.findElement(By.cssSelector("input[class='a263b5b5e8']")).click();
		
		List<WebElement> destinations = driver.findElements(By.tagName("ul"));
		
		for(WebElement e : destinations)
		{
			System.out.println(e.getText());
		}

		driver.close();
	}


}
