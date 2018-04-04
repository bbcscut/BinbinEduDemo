package com.bbc.GameClickDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
	public void testClickGame() {
    	System.setProperty("webdriver.chrome.driver", System.getenv("DRIVER_HOME")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ElementExists eExists = new ElementExists();
		driver.get("http://wap.jue-huo.com/app/html/game/1to50/1to50.html#");
		driver.manage().window().maximize();
		int n = 1;
		try {
		loop1:for(n=1;n<=25;n++) {
			if(eExists.doesWebElementExist(driver, By.xpath(".//*[@id='grid']/div["+n+"]/span"))){
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id='grid']/div["+n+"]/span")).click();
				
			}else {
				n++;
				driver.findElement(By.xpath(".//*[@id='grid']/div["+n+"]/span")).click();
			}
			
			
			if (n == 25) {
				n = 0;
				continue loop1;
			}
		}
		}catch (NoSuchElementException e) {
			
		}
		}
	}

