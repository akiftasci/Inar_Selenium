
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OnClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONSTER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Assert.assertEquals(driver.findElement(By.className("login_info")).getText(),"Welcome, Tester! | Logout");

		List<WebElement> products = driver.findElements(By.xpath("//input[contains(@type,'checkbox')])"));

		for(int i=0;i<products.size();i++){
			
		}
	
	}
}