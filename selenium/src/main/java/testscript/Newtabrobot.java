package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtabrobot {
	public WebDriver driver;
	
	public void newtab() throws AWTException
	{
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/"); 
	
	
     Robot r = new Robot();        
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_T);
     r.keyRelease(KeyEvent.VK_CONTROL);  
     r.keyRelease(KeyEvent.VK_T);
  
 }
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Newtabrobot robo=new Newtabrobot();
		robo.newtab();
	}

}
