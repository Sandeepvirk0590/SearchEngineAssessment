package com.sandeepkaur.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver wd;

	private final Browsers BROWSER = Browsers.CHROME;

	public void intialisation() {
		switch (BROWSER) {
		case CHROME:
			wd = new ChromeDriver();
			wd.get("https://www.google.com");
			break;
		case EDGE:
			wd = new EdgeDriver();
			wd.get("https://www.microsoft.com/edge");
			break;
		case FIREFOX:
			wd = new FirefoxDriver();
			wd.get("https://www.firefox.com");
			break;
		default:
			throw new IllegalArgumentException("Invalid browser!");
		}

		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void tearDown() {
		try {
			wd.quit();
		} catch (Exception e) {
			wd.quit();
		}

	}

}
