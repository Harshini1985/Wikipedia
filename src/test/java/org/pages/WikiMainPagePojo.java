package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdef.Hooks;
import org.utils.Base;

public class WikiMainPagePojo extends Base{
	public WikiMainPagePojo(){
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(id="searchInput")
private WebElement txtSearch;

@FindBy(id="searchButton")
private WebElement btnSearch;

@FindBy(xpath="//a[text()='Commons']")
private WebElement lnkCommons;

@FindBy(xpath="//span[text()='Help']")
private WebElement lnkHelp;

public WebElement getTxtSearch() {
	return txtSearch;
}

public WebElement getBtnSearch() {
	return btnSearch;
}

public WebElement getLnkCommons() {
	return lnkCommons;
}

public WebElement getLnkHelp() {
	return lnkHelp;
}




}
