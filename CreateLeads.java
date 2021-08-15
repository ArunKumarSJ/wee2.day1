package seleniumSample;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// method
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DEV");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("THALAPATHY");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("WELCOME");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AutoMation Tester");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/08/1996");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("11,400");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15,000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("87464");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@@@@");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NIL");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("249");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("984874652");
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("NIL");
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("NIL");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arun@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://..");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SAI");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("249/M");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("APK MAIN ROAD");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("MADURAI");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625012");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("625001");

		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(drop1);
		drpDwn1.selectByValue("LEAD_EMPLOYEE");

		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("CATRQ_AUTOMOBILE");

		WebElement drop3 = driver.findElementByName("industryEnumId");
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByValue("IND_AEROSPACE");

		WebElement drop4 = driver.findElementByName("ownershipEnumId");
		Select drpDwn4 = new Select(drop4);
		drpDwn4.selectByValue("OWN_SCORP");

		WebElement drop5 = driver.findElementByName("generalStateProvinceGeoId");
		Select drpDwn5 = new Select(drop5);
		drpDwn5.selectByValue("IN");

		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn6 = new Select(drop6);
		drpDwn6.selectByValue("CAN");

		driver.findElementByName("submitButton").click();
		
		String title1 = "View Lead| opentaps CRM";

		String homeTitle = driver.getTitle();
		if (title1.equals(homeTitle)) {
			System.out.println("In home page");
		} else {
			System.out.println("not in home page");
		}


	}

}
