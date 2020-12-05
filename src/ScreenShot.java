


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


	
	public class ScreenShot {
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MONSTER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();


			 driver.get("http://google.com");
			 
			 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src,new File("C://Users//MONSTER//Desktop//screenshot.png"));
			 
			

		}
		
}
