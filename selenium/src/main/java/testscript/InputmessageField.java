package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputmessageField extends Base{

	public void showMessage()
	{
	WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	// xpath of inputform is to be inspected from homepage as the link in baseclass  of the homepage.
	inputform.click();
	WebElement entrMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	entrMessage.sendKeys("Welcome"); // Entermessage xpath : //input[@id='single-input-field']
	 WebElement clckshowMsg=driver.findElement(By.xpath("//button[@id='button-one']"));
	 clckshowMsg.click();
	}
	public void twoinputFields()   
	{
	// WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	// inputform.click();
	WebElement entervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	entervalueA.click();
	entervalueA.sendKeys("25");
	WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	entervalueB.click();
	entervalueB.sendKeys("100");
	WebElement Gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
	Gettotal.click();
	}       
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputmessageField messg=new InputmessageField();
		messg.initialiseBrowser();
		messg.showMessage();
		messg.twoinputFields();
	}

}
