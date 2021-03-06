package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() {
		
		
		File src= new File("./Config/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

		
	}

		public String getbrowser() {
			
		return pro.getProperty("browser");
		}
		
		public String getURL() {
			
		return pro.getProperty("url");
		}
		
}
