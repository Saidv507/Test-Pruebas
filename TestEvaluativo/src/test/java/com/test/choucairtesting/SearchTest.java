package com.test.choucairtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchTest {
 private WebDriver driver;
 By sLinkLocator = By.linkText("Empleos");
 By tpalabraclave = By.id("search_keywords");
 By tubicacion = By.id("search_location");
 By busquedaBtnLocator = By.className("search_submit");
 By panelsearchLocator = By.className("search_jobs");
 
 @Before
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/Chrome Driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.choucairtesting.com/");
 }
 
 @Test
 public void testbusqueda() throws InterruptedException  {
	 driver.findElement(sLinkLocator).click();
     Thread.sleep(2000);
	 if(driver.findElement(panelsearchLocator).isDisplayed()) { 
			driver.findElement(tpalabraclave).sendKeys("Analista");
			driver.findElement(tubicacion).sendKeys("Panama");
			
			driver.findElement(busquedaBtnLocator).click();
		  }

 }
}
