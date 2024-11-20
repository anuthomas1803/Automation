package testscript;

public class BrowserCommands extends Base {

	public void BrowserCommands()
	{
		String title=driver.getTitle(); // to print the title of the current page . Objectname.methodNAme();
		System.out.println(title);
		String url=driver.getCurrentUrl();// to get the URL
		System.out.println(url);
		String pagesource=driver.getPageSource();  // to get the URL
		System.out.println(pagesource); // to get the HTML code
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser= new BrowserCommands();
		browser.initialiseBrowser();
		browser.BrowserCommands();	
		
		
		
	}

}
//All values in Selenium is considered as String