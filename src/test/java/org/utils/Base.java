package org.utils;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Base {
		 
			public static WebDriver driver;
			/*
			 * To initialize the Webdriver
			 */
			public static void getDriver() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnakishore\\eclipse-workspace\\WikiMain\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().deleteAllCookies();
			}
			/*
			 * Enter the Url
			  */
			public static void getUrl(String url) {
				driver.get(url);
				}
			
			public static void maxi() {
				driver.manage().window().maximize();
			}
			
			/*  
			 * To get the title of the application
			  */
			public static String getTitle(){
				String title=driver.getTitle();
				return title;
			}
			/*  
			 * To get the current Url of the application
			  */
			public static String getCurrentUrl() {
				String currentUrl=driver.getCurrentUrl();
				return currentUrl;
			}
			/*
			 * Close the current browser
			 */
			public static void closeBrowser(){
				driver.close();
				}
			/* 
			 * To click button or link or radio button or checkbox
			 */
			public static void Click(WebElement element) {
				element.click();
			}
			/*
			 * To pass the values into textbox
			 */
			public void insertType(WebElement element, String value) {
				element.sendKeys(value);
			}
			public static void dblClick(WebElement element) {
				Actions a=new Actions(driver);
				a.doubleClick(element).perform();
			}
			
			public static void mouseClick(WebElement element) {
				Actions a=new Actions(driver);
				a.click(element).perform();
			
	}		
	}
