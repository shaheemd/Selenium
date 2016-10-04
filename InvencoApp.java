import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvencoApp {

	public static void main(String[] args) throws Exception {
		
		//declare variables
		WebDriver driver = new FirefoxDriver();
		driver.get("https://invencothick-nz-test.tms.invenco.com/");
		driver.findElement(By.id("username")).sendKeys("shaheemd");
		driver.findElement(By.id("password")).sendKeys("Sh@k312345");
		driver.findElement(By.xpath(".//*[@id='kc-login']")).click();
		//-------------------------------------------
		
		//Select a site
		
		//CSS Selector - (attribute) = tagname[attribute='value'] = a[data-ui-sref='sites.list']
		driver.findElement(By.cssSelector("a[data-ui-sref='sites.list']")).click();
		
		//CSS Selector - (attribute) = tagname[attribute*='value'] = a[data-ui-sref='sites.list']
		//		driver.findElement(By.cssSelector("a[data-ui-sref='sites.list']")).click();
				


				
				
		//driver.findElement(By.cssSelector("a[href*='/ics-tms-web/sites']")).click();
		
		
		
		//CSS Selector - ID  = #
		//driver.findElement(By.cssSelector("#sideBarSites")).click();  
		
		
		//Check stuffs
		//<p class="navbar-text navbar-brand-text" data-ng-bind="navTitle">Dashboard</p>
		// p 		- tag name
		// class 	- navbar-text navbar-brand-text
		// 
		
			//wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		driver.findElement(By.xpath(".//*[@id='mp-0BHkJEP7O']")).click();
		
		//String siteValue;
		
		try{
			//driver.findElement(By.xpath(".//*[@id='deviceListLastContact-1']")).click();
			WebElement a = driver.findElement(By.cssSelector("#deviceListLastContact-1"));
			System.out.println(a.getText());
			//System.out.println(siteValue);
		}catch(Exception e){
			System.out.println("Not Found");
		}
		
		
		
		

		//driver.quit();
		
	}
						
}
