package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver; // driver is the object created
public void initialiseBrowser()
{
driver= new ChromeDriver();
driver.get("https://selenium.qabible.in/index.php");
driver.manage().window().maximize(); //t0 maximize
}
public void QuitClose()
{
driver.close();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base obj=new Base();
obj.initialiseBrowser();
obj.QuitClose();
	}

}
