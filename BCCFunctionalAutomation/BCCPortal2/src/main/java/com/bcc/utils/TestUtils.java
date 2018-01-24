package com.bcc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import au.com.bytecode.opencsv.CSVReader;

public class TestUtils {

	private static final Logger LOG = Logger.getLogger(TestUtils.class.getName());
	
	public static List<String[]> dataList(String fileName) {
		
		CSVReader reader = null;
		List<String[]> dataRows = new ArrayList<String[]>();
		try {
			reader = new CSVReader(new FileReader(fileName));
			//inputStream = new FileInputStream(new File(path));
			
			if (reader != null) {
				dataRows = reader.readAll();
			}
		} catch (FileNotFoundException e) {
			LOG.error("CSV file could not be found", e);
		} catch (IOException e) {
			LOG.error("Error while reading csv file", e);
		} finally {
			try {
				if (reader != null) 
					reader.close();
			} catch (IOException e) {
				LOG.error("Error while closing reader", e);
			}
		}
		return dataRows;
	}
	
	public static FileInputStream getFileStream(String path) {
		FileInputStream inputStream = null;
		try {
			LOG.debug("Reading... " + path);
			inputStream = new FileInputStream(new File(path));
		} catch (Exception ex) {
			LOG.error("Error reading... " + path);
			LOG.error(ex.getMessage(), ex);
		}
		return inputStream;
	}
	
}
