import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONSTER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fProcess.aspx");
			driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
			driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
			driver.findElement(By.className("button")).click();
	}
	}
