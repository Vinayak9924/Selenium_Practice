package vinayak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		ChromeDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://practice-automation.com/form-fields/");
		List<WebElement> findElements = a.findElements(By.xpath("//input/following-sibling::label"));
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			if (text.equals("Coffee")) {
				System.out.println(text );

			}

		}

	}

}
