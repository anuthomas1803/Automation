package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample
{
 public WebDriver driver;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/guru99home/");
WebElement iframe=driver.findElement(By.xpath("//iFrame[@id='a077aa5e']")); //id="a077aa5e" xpath of the iframe.(the child page to which we need to go)
driver.switchTo().frame(iframe);
WebElement jmtr=driver.findElement(By.xpath("//img[@src='Jmeter720.png']")); // the xpath of the image that denotes the child page we need to go
jmtr.click();
	}

}
