package testscript;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling extends Base{
	
//READ A FULL TABLE (CURRENT TABLE)
	
	public void Full_Table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
 WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
 System.out.println(table.getText());		
	}
	
	public void Table_Row()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		 System.out.println(row.getText());
	}
public void Select_ParticularElements()
	{
	     driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
		 WebElement tabledata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		 System.out.println(tabledata.getText());
	}
	
	public void Search_ParticularElements()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String POSITION="Accountant";
		 List<WebElement> particularelmt=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
for(WebElement element:particularelmt)
{
if(element.getText().equalsIgnoreCase(POSITION))
{
	System.out.println("Search result is " +element.getText());
}
}
 }
	
	public void Get_ParticularColumn()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		 List<WebElement> getcolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		 System.out.println("NAME LIST IS");
		 for(WebElement item:getcolumn)
		 {
				System.out.println(item.getText());
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TableHandling  tablehandle= new  TableHandling();
		 tablehandle.initialiseBrowser();
		 /*tablehandle.Full_Table();
		System.out.println("######################################################");
		 tablehandle.Table_Row();
		 System.out.println("######################################################"); 
	tablehandle.Select_ParticularElements(); 
		System.out.println("######################################################");*/
		 tablehandle.Search_ParticularElements();
		 	System.out.println("######################################################");   
		 //tablehandle.Get_ParticularColumn();
	}

}
