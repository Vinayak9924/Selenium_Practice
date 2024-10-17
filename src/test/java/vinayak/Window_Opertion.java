package vinayak;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Opertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Vinayak Eclipse practice\\Test01\\driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://practice-automation.com/window-operations/");
		a.findElement(By.xpath("//button[@class='custom_btn btn_hover']/b[text()='New Tab']")).click();
		// a.findElement(By.xpath("//span[text='Reviews']")).click();
		String ParentWindowHandle = a.getWindowHandle();
		System.out.println(ParentWindowHandle);
		Set<String> windowHandles = a.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (!next.equals(ParentWindowHandle)) {
				a.switchTo().window(next);
				break;
			}

		}
		a.findElement(By.xpath("//span[text()='Reviews']")).click();

	}

}
