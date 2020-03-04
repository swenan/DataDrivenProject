package com.w2a.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	private static final Logger log = Logger.getLogger(BankManagerLoginTest.class);

	@Test
	public void loginAsBankManager() throws InterruptedException {

		log.debug("Indise LoginTest..!!!");
		click("bmloginbtn");
		Assert.assertTrue(isElementPresent(By.cssSelector(objrepo.getProperty("addCustbtn"))), "Login not Successfull");
		log.debug("Login successfully executed..!!!");
		Assert.fail("Login not Successfull");

	}

}
