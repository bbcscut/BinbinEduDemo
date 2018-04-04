package com.bbc.GameClickDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ElementExists {
	public boolean doesWebElementExist(WebDriver driver, By selector)
	{ 

	        try 
	        { 
	               driver.findElement(selector); 
	               return true; 
	        } 
	        catch (NoSuchElementException e) 
	        { 
	                return false; 
	        } 
	}
}
