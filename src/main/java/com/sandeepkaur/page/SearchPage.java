package com.sandeepkaur.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sandeepkaur.base.BaseClass;

public class SearchPage extends BaseClass {

	public SearchPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(name = "q")
	WebElement searchBox;

	@FindBy(xpath = "//span[text()='Sponsored']")
	WebElement firstResult;

	public void search(String searchTerm) {
		searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.RETURN);
	}

	public String getFirstResult() {
		return firstResult.getText();
	}

}
