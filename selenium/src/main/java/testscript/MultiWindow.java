package testscript;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
   public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiWindow multiob=new MultiWindow();
		multiob.window_handling();
	}

	public void window_handling()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement loginportal= driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		WebElement contctu= driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contctu.click(); //we can do this using navigate()
		String parent=driver.getWindowHandle(); //no set string because only one action
		System.out.println("parent window "+parent);
		Set<String> allwindow=driver.getWindowHandles();
		
		String title=" "; //
		System.out.println("All window "+allwindow); 
for(String temp:allwindow)
 {
	
	if(!temp.equals(parent)) //if(temp!=parent)
	 {
			System.out.println("Accept child from parent window " +temp);
			driver.switchTo().window(temp);
System.out.println(driver.getTitle());
title=driver.getTitle();
	 }
if(title.equals("WebDriver | Login Portal")) // when title 
{
WebElement Username=driver.findElement(By.xpath("//input[@id='text']"));
Username.sendKeys("Anumol");
WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
Password.sendKeys("Anumol123");
WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
login.click();
//driver.switchTo().alert().accept();
}
	if(title.equals("WebDriver | Contact Us"))
			 {
		 WebElement Firstname= driver.findElement(By.xpath("//input[@name='first_name']"));
		 Firstname.sendKeys("Anumol");
		 WebElement Lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
		 Lastname.sendKeys("Thomas");
		 WebElement emailid=driver.findElement(By.xpath("//input[@name='email']"));
		 emailid.sendKeys("anuthomasvaliyazhikathu@gmail.com");
		 WebElement commentbox=driver.findElement(By.xpath("//textarea[@class='feedback-input']"));
		 commentbox.sendKeys("Please respond at the earliest");
		 WebElement Submit=driver.findElement(By.xpath("//input[@type='submit']"));
		 Submit.click();
			 }
			 }
 }}
