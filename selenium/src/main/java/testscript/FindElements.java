package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base {
	public void findElements1()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msgob=driver.findElements(By.xpath("//input[@type='text']"));
		// the message 'Hello' will be displayed on the the field having this xpath
		for(WebElement msg1:msgob)
		{
		msg1.sendKeys("Hello");
     	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements messge=new FindElements();
		 messge.initialiseBrowser();
		 messge.findElements1();
		 
}
}
/*for each loop
for(data_type variable : array | collection){  
	//body of for-each loop */
