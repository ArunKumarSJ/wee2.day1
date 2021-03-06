package seleniumSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("  https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Arun");
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		driver.findElement(By.name("UserEmail")).sendKeys("sarvaarunkumar@gmail.com");
		WebElement drop1 =driver.findElement(By.name("UserTitle"));
		Select drpDwn1=new Select(drop1);
		drpDwn1.selectByValue("Others_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("accenture");
		WebElement drop2 =driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2=new Select(drop2);
		drpDwn2.selectByValue("250");
		WebElement drop3 =driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3=new Select(drop3);
		drpDwn3.selectByValue("CA");
		WebElement drop4 =driver.findElement(By.name("CompanyState"));
		Select drpDwn4=new Select(drop4);
		drpDwn4.selectByValue("NL");
		driver.findElement(By.name("UserPhone")).sendKeys("9244223846");
		driver.findElement(By.className("checkbox-ui-label")).click();
		driver.close();
		
	}

}
