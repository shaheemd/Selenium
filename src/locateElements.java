import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locateElements {

	public static void main(String[] args) {
		/*Setting up a page*/
		String url = "https://invencothick-nz-test.tms.invenco.com/";
		//String url = "http://gmail.com/";
		
		
		/*Handler to the firefox browser*/
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		/*Login Page - https://invencothick-nz-test.tms.invenco.com/
		 * username - text box
		 * password - text box
		 * log in - button
		 * links - forget password, Privacy Policy, Terms, Help 
		 * 
		 * Additional Notes
		 * 
		 *  - Class locator not that useful on the login page (not unique)
		 * */
		
		
		
	
		//===================================		
		//username
		/*Xpath*/		//driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Username");
		/*CSS*/			driver.findElement(By.cssSelector("#username")).sendKeys("username");
		/*Class*/
		
		
		//===================================
		//password
		/*Xpath*/		//driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Password");
		/*CSS*/			driver.findElement(By.cssSelector("#password")).sendKeys("password");
		/*Class*/		//class name identical to username
		
		//===================================	
		//link - forget Password
		/*Xpath*/		//driver.findElement(By.xpath(".//*[@id='kc-form-options']/div/span")).click();
		/*CSS*/			//driver.findElement(By.cssSelector(".forgotPasswordLink>span>a")).click();		
		/*Class*/		//driver.findElement(By.className("forgotPasswordLink")).click();
		
		//===================================		
		//links-  privacy policy, terms and help are the same
		/*Xpath*/		//driver.findElement(By.xpath(".//*[@id='kc-content-wrapper']/footer/ul/li[3]/a")).click();
		/*CSS*/			//driver.findElement(By.cssSelector(".link-dark")).click();
		/*Class*/		//class name identical for all these links as well
		
		//===================================		
		//Log in button --- need to get my password working
		/*Xpath*/		//driver.findElement(By.xpath(".//*[@id='kc-login']")).click();
		/*CSS*/			//driver.findElement(By.cssSelector("#kc-login")).click();
		/*Class*/		//driver.findElement(By.className("btn btn-primary btn-shadow btn-block")).click();   --- NOT WORKING
		
		
		
		
		
		
		/*ID*/
		
		
		
		
		/*Partial link text*/
		
		
		
		/*Linked text*/
		
		
		/*Tag Name*/
		
		
		
		/*Class*/
		
		
		
		/*Name*/
		
		
	}

}
