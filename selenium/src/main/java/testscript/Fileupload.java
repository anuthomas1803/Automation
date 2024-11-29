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

public class Fileupload {
public WebDriver driver;
public void uploadfile() throws AWTException
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement selectpdf= driver.findElement(By.xpath("//a[@id='pickfiles']"));
	selectpdf.click();
	StringSelection select= new StringSelection("C:\\Users\\Mike\\Downloads\\JAVA (2)"); //a class to upload pdf
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null); 
	                  //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
Robot robot=new Robot(); //now we need to paste
robot.delay(500); //to create a delay for uploading. necessary only when some sites need time to upload. sometimes, need time to uploading.
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V); //cntn space
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_ENTER); //cntn space
robot.keyRelease(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_T); 
robot.keyRelease(KeyEvent.VK_CONTROL); //cntn space
robot.keyRelease(KeyEvent.VK_T);
}

public void fileupploadSendKeys() //paste using sendkeys
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement selectpdf= driver.findElement(By.xpath("//a[@id='pickfiles']"));
	selectpdf.click();	
	selectpdf.sendKeys("C:\\Users\\Mike\\Downloads\\JAVA (2)");
}

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
	Fileupload uploadobj=new Fileupload();
	uploadobj.uploadfile();
	uploadobj.newtab();
	//uploadobj.fileupploadSendKeys();
}

}
