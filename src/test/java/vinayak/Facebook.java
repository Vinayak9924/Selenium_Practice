package vinayak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Vinayak Eclipse practice\\Test01\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver a = new ChromeDriver(options);
		a.manage().window().maximize();
		a.get("https://www.facebook.com/");
	    String currenturl=	a.getCurrentUrl();//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/a/div/div/div[1]/img
	    System.out.println(currenturl);
	   String Title= a.getTitle();//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/a/div/div
	   System.out.println(Title);
	  
	a.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
	a.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("test@gmail.com");
	a.findElement(By.xpath("//*[@id=\"u_0_5_2y\"]")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
