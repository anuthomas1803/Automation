package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Addition extends BaseAuto {

		public void twoinputFields()   
		{
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
			Addition messg=new Addition();
			messg.initialiseBrowser();
			messg.twoinputFields();
		}

	}

}
