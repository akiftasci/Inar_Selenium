package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_and_Drag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "x");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);

	
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	
		Thread.sleep(3000);
		// driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));


		a.dragAndDrop(source, target).build().perform();

		
		driver.switchTo().defaultContent();



	}

}
