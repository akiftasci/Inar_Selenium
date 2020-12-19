package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Homepage;
import Pageobject.Loginpage;

public class Loginapp {
	@Test
	public void Login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONSTER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Loginpage rd=new Loginpage(driver);
		rd.EmailId().sendKeys("hi");
		rd.Password().sendKeys("hi2");
		rd.submit().click();
		rd.Home().click();
		
		Homepage rh= new Homepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
	}

}
