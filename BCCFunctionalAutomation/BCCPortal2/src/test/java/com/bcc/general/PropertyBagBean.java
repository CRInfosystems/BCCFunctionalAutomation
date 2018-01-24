package com.bcc.general;

import java.io.IOException;
import java.util.Properties;

import com.bcc.utils.TestUtils;

public class PropertyBagBean {
	
	private static final String DEFAULT_RESOURCE_PATH = "/opt/bcc/tests/datafiles";
	private static final String CONFIG_PROPERTY_PATH = "/Config.properties";
	
	private static final String[] PAGE_OBJECTS = { "COMMON_OBJECTS_FILE", "ACCOUNTS_PAGE_OBJECTS_FILE", "WASTE_PAGE_OBJECTS_FILE" , "PARKING_PAGE_OBJECTS_FILE" , "FOI_PAGE_OBJECTS_FILE" , "COMPLAINTS_PAGE_OBJECTS_FILE" , "FEEDBACK_PAGE_OBJECTS_FILE" ,  "RENEWALS_PAGE_OBJECTS_FILE" , "CONCENSSIONARY_PAGE_OBJECT_FILE" };
	
	private static final String SERVER_DATA_PATH = "SERVER_DATA_PATH";
	
	public static final String DOCUMENT_FILE_PATH = "DOCUMENT_FILE_PATH";
	
	private Properties properties = new Properties();
	private Properties pagesProps = new Properties();
	
	private PropertyBagBean() {
		
		String resourcePath = System.getProperty("resource.path");

		try {
			
			if(resourcePath != null && !resourcePath.isEmpty()){
				properties.load(TestUtils.getFileStream(resourcePath + CONFIG_PROPERTY_PATH));
			}else{
				properties.load(TestUtils.getFileStream(DEFAULT_RESOURCE_PATH + CONFIG_PROPERTY_PATH));
			}
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
		
		for (String pageObj : PAGE_OBJECTS) {
			
			try {
				
				if(resourcePath != null && !resourcePath.isEmpty()){
					pagesProps.load(TestUtils.getFileStream(resourcePath + getConfigProperty(pageObj)));
				}else{
					properties.load(TestUtils.getFileStream(DEFAULT_RESOURCE_PATH + CONFIG_PROPERTY_PATH));
				}
				
			} catch (IOException e) {
				throw new ExceptionInInitializerError(e);
			}
		}
	}
	
   private static class SingletonHolder { 
		private static final PropertyBagBean INSTANCE = new PropertyBagBean();
	}
	
	public static PropertyBagBean getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	
	public String getConfigProperty(String key) {
		return properties.getProperty(key).trim();
	}
	
	public String getDataFile(String key) {
		return getConfigProperty(SERVER_DATA_PATH) + getConfigProperty(key);
	}
	
	public String getDataFileParent() {
		return getConfigProperty(SERVER_DATA_PATH);
	}
	
	public String getPageProperty(String key) {
		return pagesProps.getProperty(key).trim();
	}
}
