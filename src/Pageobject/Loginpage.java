package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	By username=By.xpath(".//*[@id=login1]");
	//@FindBy(xpath=".//*[@id=login1]")
	//WebElement username;
	
	By password=By.name("passwd");
	//@FindBy(name="passwd")
	//WebElement password;
	
	By go=By.name("proceed");
	//@FindBy(name="proceed";
	//WebElement proceed;
	
	By home= By.linkText("Home");
	//@FindBy(linkText="Home")
	//WebElement home;
	
	public WebElement EmailId(){
		return driver.findElement(username);
		//return username;
		
	}
	public WebElement Password() {
		return driver.findElement(password);
		//return password;
	}
	public WebElement submit(){
		return driver.findElement(go);
		//return go;
	}
	public WebElement Home(){
		return driver.findElement(home);
		//return home;
	}
}
