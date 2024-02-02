package com.sandeepkaur.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sandeepkaur.base.BaseClass;
import com.sandeepkaur.page.SearchPage;

public class SearchPageTest extends BaseClass {

	SearchPage searchPage;

	@BeforeMethod
	public void launch() {
		intialisation();
		searchPage = new SearchPage();
	}

	@Test
	public void validateSearchTermIsWorkingOrNot() {

		String expectedResult = "Sponsored";
		searchPage.search("Women bags");
		Assert.assertEquals(searchPage.getFirstResult(), expectedResult, "Result does not match!");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
