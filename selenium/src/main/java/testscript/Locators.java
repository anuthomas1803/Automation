package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	 public WebDriver driver;

	 public void idLocator()
	 {
		// WebElement ElementName= driver.findElement(By.Locator("attributevalue"));
		 WebElement messagefield= driver.findElement(By.id("single-input-field"));
		 WebElement entervalueA= driver.findElement(By.id("value-a")); 
		 WebElement entervalueB =driver.findElement(By.id("value-b"));
	     WebElement GetTotal=driver.findElement(By.id("message-two"));
	 }
	 public void nameLocator()	 
	 {
	 WebElement name1= driver.findElement(By.name("viewport"));
	 }
	 public void classLocator()	 
	 {
	 WebElement name2= driver.findElement(By.className("hearder-top"));
	 }
	 
	 //CSS SELECTOR
	 public void cssSelectr()	 
	 {
		//first combination: tag#id
	 WebElement css1= driver.findElement(By.cssSelector ("input#single-input-field"));
	 WebElement ShowMessage=driver.findElement(By.cssSelector("button#button-one"));
	    //second combination: tag.class
	 WebElement cssTagClass= driver.findElement(By.cssSelector ("ul.navbar-nav"));
	 WebElement ShowMessage1= driver.findElement(By.cssSelector("div.my-2"));
	    //tag and any attribute : tag[attribute=value]
	 WebElement tagAttribute=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	 WebElement tagAttribute2=driver.findElement(By.cssSelector("button[id=button-one]"));
	 WebElement tagAttribute3=driver.findElement(By.cssSelector("ul[class=navbar-nav]"));
	 WebElement tagAttribute4=driver.findElement(By.cssSelector("div[class=my-2]"));
	   //tag.class[attribute=value]
	 WebElement tagClas=driver.findElement(By.cssSelector("input.form-control[placeholder=Message]")); 
	 WebElement tagClas2=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));	 
	 }
	 
	 //XPATH
	 public void absolute_xpath()
	 {
		 WebElement abxpath1=driver.findElement(By.xpath("///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	 }
	 public void relative_xpath()
	 {
		 WebElement rpath1=driver.findElement(By.xpath("//input[@class='form-control']"));
	 }
	 
	 //DYNAMIC XPATH : contains and text
	 public void containsxpath()
	 {    // SYNTAX:  //tagname[contains(@attributetype,'value')]
		 WebElement enterMessage=driver.findElement(By.xpath("//input[contains(@placeholder,'Message']"));
	
		 WebElement enterMessage2=driver.findElement(By.xpath("//input[contains(@id,'single-input-field']"));
 
	 }
	
	 public void text()
	 {
		 // //tagname[text()='value']
		 WebElement entermessage3=driver.findElement(By.xpath("//button[text()='Show Message']"));
	 }
	 
	 public void axes()         
	 {
		// //tagnem[@attributetype='value']//parent::tagname --- xpath Axes method
		 
		 WebElement axesobsqlogo1=driver.findElement(By.xpath("//input[@placeholder='Message']//parent::div"));
		 WebElement axesxpath2=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));	 
	 }
	    // //tagname[@attributetype='attributevalue']
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locate=new Locators();
		locate.initialiseBrowser();
		locate.idLocator();
		locate.classLocator();
		locate.nameLocator();
		locate.cssSelectr();
		locate.relative_xpath();
		locate.containsxpath();
		locate.text();
		locate.axes();
	}

}
