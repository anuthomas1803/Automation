package testscript;

public class NavigationCommands extends Base {

	public void NavigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/"); //goes to amazon page
		driver.navigate().back(); //goes back to obsqura page from amazon page
		driver.navigate().forward();//goes forward to amazon page from obsqura page 
		driver.navigate().refresh(); // to refresh page
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigate=new NavigationCommands();
		navigate.initialiseBrowser();
		navigate.NavigateCommands();
	
	}
	

}
