import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouse gezdirilerek çýkan sekmeler içim kullanýlýr
public class ActionsDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\MONSTER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

	}

}
