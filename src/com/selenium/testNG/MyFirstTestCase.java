/**
 * 
 */
package com.selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Shame
 *
 */

public class MyFirstTestCase {
	
	@Test
	public void GoogleTitleVerifty(){
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
