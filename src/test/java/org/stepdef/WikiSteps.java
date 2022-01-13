package org.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.WikiMainPagePojo;
import org.utils.Base;

import cucumber.api.java.en.*;

public class WikiSteps extends Base{
	@Given("User launch the browser and navigates to main page")
	public void user_launch_the_browser_and_navigates_to_main_page() throws InterruptedException {
		getUrl("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(2000);
		maxi();
	}
	
	@Then("User should be able to view the main page")
	public void user_should_be_able_to_view_the_main_page() {
		WebElement authMsg = driver.findElement(By.xpath("//div[@id='mp-welcome']"));
		Assert.assertTrue("Message is not displayed",authMsg.isDisplayed());
	}
	
	
	@When("User enters search keyword in the search field")
	public void user_enters_search_keyword_in_the_search_field() throws InterruptedException {
		Thread.sleep(3000);
		WikiMainPagePojo w=new WikiMainPagePojo();
		insertType(w.getTxtSearch(),"School");
	}
	
	@When("User clicks on the magnify image")
	public void user_clicks_on_the_magnify_image() {
		WikiMainPagePojo w=new WikiMainPagePojo();
		Click(w.getBtnSearch());
		 
	}
	@Then("User validates the relevant search results")
	public void user_validates_the_relevant_search_results() {
		WebElement authMsg = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
		Assert.assertTrue("Message is not displayed",authMsg.isDisplayed());
	}
		
	
	@When("User clicks on the Commons Link in the main page")
	public void user_clicks_on_the_Commons_Link_in_the_main_page() {
		WikiMainPagePojo w=new WikiMainPagePojo();
		Click(w.getLnkCommons());
		 
	}
		
	@Then("User should be able to navigate to Wikimedia Commons")
	public void user_should_be_able_to_navigate_to_Wikimedia_Commons() {
			WebElement authMsg = driver.findElement(By.xpath("//div[text()='Wikimedia Commons']"));
			Assert.assertTrue("Message is not displayed",authMsg.isDisplayed());
		}

		

	@When("User clicks on the help link in the main page")
	public void user_clicks_on_the_help_link_in_the_main_page() {
		WikiMainPagePojo w=new WikiMainPagePojo();
		Click(w.getLnkHelp());
		 	
	}
	
	@Then("User should be able to navigate to the help page")
	public void user_should_be_able_to_navigate_to_the_help_page() throws InterruptedException {
		WebElement authMsg = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
		Assert.assertTrue("Messgae is not displayed",authMsg.isDisplayed());
		Thread.sleep(3000);
	}


}
