package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dropdown d=new  Dropdown();
		d.initialiseBrowser();
		d.selectDropdown();
	}
public void selectDropdown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement selectColour= driver.findElement(By.xpath("//select[@id='single-input-field']"));
	//selectColour.click();
Select Selobj=new Select(selectColour);
	Selobj.selectByVisibleText("Yellow");   //SELECT BY VISIBLE TEXT :WITHOUT QUOTES
	//Selobj.selectByIndex(1); // SELECT BY INDEX
	//Selobj.selectByValue("Red"); //  SELECT BY value. value="Red"
}
}
