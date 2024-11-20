package testscript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop extends Base {
	
	public void draggdrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		// xpath of the item that is to be dragged from the list
		WebElement dragdrop1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		//Actions: inbuilt class for drag and drop
		Actions actions= new Actions(driver); //object creation
		actions.moveToElement(dragdrop1); // move to the item to be dragged
		actions.doubleClick(dragdrop1).perform(); //double click the item to be dragged
		//destination to which the element is to be dragged
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		//drag and drop
		actions.dragAndDrop(dragdrop1,destination).build().perform();
	}
	public static void main(String args[])

	{
		DragnDrop dragob=new DragnDrop();
		dragob.initialiseBrowser();
		dragob. draggdrop();
	}
	}
	
