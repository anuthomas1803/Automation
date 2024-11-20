package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	//public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertob=new AlertHandling();
		alertob.initialiseBrowser();
		alertob.simplealert();
	alertob.confirmationalert();
		alertob.promptalert();
	}
	public void simplealert() //Java Script Alert Box
	{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement clicckelement=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	clicckelement.click();
	driver.switchTo().alert().accept();
	System.out.println("DisplayS Java Script Alert WindowT/F) : " +clicckelement.isDisplayed());
	}
	
	
	public void confirmationalert()//Java Script Confirm Box
	{
		WebElement confirmclick=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confirmclick.click();
	//	driver.switchTo().alert().accept();// FOR OK ,
		driver.switchTo().alert().dismiss(); // FOR CANCEL
		System.out.println("Displays Java Script Confirm  window(T/F) : " +confirmclick.isDisplayed());
		}
	public void promptalert() //Java Script PROMPT Alert Box
	{
		WebElement messageprompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		messageprompt.click();
		driver.switchTo().alert().sendKeys("hello"); //passing a message in an alert
		driver.switchTo().alert().accept();
		System.out.println("Displays Java Script PROMPT window(T/F) : " +messageprompt.isDisplayed());
	}

}
