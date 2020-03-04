package com.w2a.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {

		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties objrepo = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\ObjRepo.properties");
		objrepo.load(fis);
		System.out.println(objrepo.getProperty("bmloginbtn"));
	}

}
