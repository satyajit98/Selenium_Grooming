package com.basicProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox
{
	public static void main(String[] args)
	{
		String key = "webdriver.gecko.driver";
		String value = "./Softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
	}
}
