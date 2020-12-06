package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class Assignment1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONSTER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	//true
	
	driver.findElement(By.id("checkBoxOption1")).click();
	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	//false
	
	driver.findElements(By.cssSelector("input[value='checkbox']")).size();
	
}
}
