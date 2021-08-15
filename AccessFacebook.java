package seleniumSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessFacebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title1= "Facebook – log in or sign up";

		String homeTitle = driver.getTitle();
		if(title1.equals(homeTitle)) {
			System.out.println("Facebook page");
		}
		else {
			System.out.println("not in Facebook page");
		}
		
		driver.findElementByLinkText("Create New Account").click();
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("Deva");
		driver.findElement(By.name("reg_email__")).sendKeys("9244223846");
		driver.findElement(By.id("password_step_input")).sendKeys("arun63");
		
		WebElement drop1 =driver.findElement(By.id("day"));
		Select drpDwn1=new Select(drop1);
		drpDwn1.selectByIndex(6);
		
		WebElement drop2 =driver.findElement(By.id("month"));
		Select drpDwn2=new Select(drop2);
		drpDwn2.selectByValue("7");

		WebElement drop3 =driver.findElement(By.id("year"));
		Select drpDwn3=new Select(drop3);
		drpDwn3.selectByValue("1996");
		 driver.findElement(By.className("_5k_3")).click();
		}

}
