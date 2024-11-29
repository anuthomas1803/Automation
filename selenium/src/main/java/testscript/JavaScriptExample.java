package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {
public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExample  amazon=new JavaScriptExample();
		amazon.amazonlaunch();
	}
public void amazonlaunch()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor javascript=(JavascriptExecutor) driver; //addcast to ..
	javascript.executeScript("window.scrollBy(0,3000)", "");     //interface
	javascript.executeScript("window.scrollBy(0,-1000)", "");  
	WebElement searchproduct=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	javascript.executeScript("arguments[0].click();", searchproduct); //user when normal .click() doesnot work in some cases
	searchproduct.click();

}
}
