package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chech {
	public WebDriver driver;
	
	public void portl()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		WebElement Username=driver.findElement(By.xpath("//input[@id='text']"));
		Username.sendKeys("Anumol");
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Anumol123");
		WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
		login.click();
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chech potob=new chech();
		potob.portl();
	}

}
