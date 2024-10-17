package vinayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	public static void main(String[] args) {
		ChromeDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://practice-automation.com/form-fields/");
		a.findElement(By.xpath("//input[@id='name']")).sendKeys("appanna"); 
		a.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		a.findElement(By.xpath("//textarea[@id='message']")).sendKeys("i want to automate the page");
		a.findElement(By.xpath("//input[@value='Water']")).click();
		boolean displayed =a.findElement(By.xpath("//input[@value='Water']")).isDisplayed();
		System.out.println(displayed);
		WebElement select=a.findElement(By.xpath("//select"));
		Select s = new Select(select);
		s.selectByVisibleText("Maybe");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.selectByValue("yes");
		
		
		

	}
}

