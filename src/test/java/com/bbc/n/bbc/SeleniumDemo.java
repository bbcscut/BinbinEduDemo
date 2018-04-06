package com.bbc.n.bbc;


import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class SeleniumDemo {

	
	public void FireFoxDemo() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\plugin\\geckodriver.exe");
	System.setProperty("webdriver.firefox.bin", "D:\\1 software\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();  
        
        driver.get("https://www.baidu.com");  
        
        
        Thread.sleep(2);  
       WebElement searchbar = driver.findElement(By.xpath(".//*[@id='kw']"));  
        searchbar.sendKeys("helloworld");
         Dimension dimension = new Dimension(300, 500);
         driver.manage().window().setSize(dimension);
        driver.close();
	}
	
     @Test
	  public void ChromeDemo() throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver", "D:\\plugin\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
        
        driver.get("https://www.baidu.com");  
       Thread.sleep(2);  
       WebElement searchbar = driver.findElement(By.xpath(".//*[@id='kw']"));  
        searchbar.sendKeys("t");
        System.out.println("I love you");
		   
	  
	  }
	  
	
	  public void IEDemo() throws InterruptedException {
		  System.setProperty("webdriver.ie.driver", "C:\\Program Files\\internet explorer\\IEDriverServer.exe");
//		  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		  caps.setCapability("ignoreZoomSetting", true);

//		  WebDriver ieWeb = new InternetExplorerDriver(caps);
		  WebDriver driver = new InternetExplorerDriver();
		  //ieWeb.get("https://www.baidu.com");
		  
		 
//		  ieWeb.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
//		  JavascriptExecutor js = (JavascriptExecutor) ieWeb;
//		  js.executeScript("window.open('http://www.jd.com');"); 
//		  ieWeb.get("www.jd.com");
//		  Thread.sleep(3000);
		  //ieWeb.quit();
		  
		  String baseUrl = "https://www.baidu.com/";
		   driver.get(baseUrl);
		   driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		 
		   Set<String> tabs = driver.getWindowHandles();
		   driver.getWindowHandle();
		   tabs.iterator().next();
		   //driver.switchTo().window(newTab);
		   driver.get("https://www.jd.com");
		   }
	
}
