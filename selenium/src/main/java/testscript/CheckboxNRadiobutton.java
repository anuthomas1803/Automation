package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxNRadiobutton extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxNRadiobutton box=new CheckboxNRadiobutton();
		box.initialiseBrowser();
		box.multiplecheckbox();
		//box.singlecheckbox();
		//box.radiobutton();

	}
	public void singlecheckbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxxpath=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkboxxpath.click();
		System.out.println(checkboxxpath.isSelected());
	}
	public void multiplecheckbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multicheckbox=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement multi:multicheckbox)
		{
			multi.click();  //System.out.println(checkboxxpath.isSelected());
			System.out.println(multi.isSelected());
		}
	
	}
	public void radiobutton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttonxpath=driver.findElement(By.id("inlineRadio2"));
		radiobuttonxpath.click();
		WebElement showselectedvalue=driver.findElement(By.id("button-one"));
	    showselectedvalue.click();
		System.out.println(radiobuttonxpath.isSelected());
	}
}
