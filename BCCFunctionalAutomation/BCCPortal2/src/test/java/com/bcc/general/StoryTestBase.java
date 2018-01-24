package com.bcc.general;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.Format;

import com.bcc.utils.TestUtils;

public abstract class StoryTestBase extends JUnitStory{
	
	protected PropertyBagBean propertyBag = PropertyBagBean.getInstance();
	
	private String dataFile;
	
    @Override
	public Configuration configuration() {
		
		Configuration config = new MostUsefulConfiguration();
		config.useStoryLoader(
				new LoadFromClasspath(this.getClass().getClassLoader()))
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withReporters(new StoryReporterBase())
						        .withDefaultFormats()
								.withFormats(Format.HTML, Format.XML, Format.CONSOLE )
								);
		

		             
								//.withRelativeDirectory("jbehave-report"));
		
		PropertyBagBean propertyBag = PropertyBagBean.getInstance();
		URL dataURL = null;
		try {
			String file = propertyBag.getDataFileParent();
			dataURL = new URL("file://" + file);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		config.useStoryParser(new RegexStoryParser(new ExamplesTableFactory(new LoadFromRelativeFile(dataURL) )));
        
        return config;
	}
	
	public List<String[]> getData(String fileName) throws IOException {
		List<String[]> rows = TestUtils.dataList((propertyBag.getDataFile(fileName)));
		if (!rows.isEmpty()) {
			rows.remove(0); //assume the first row is an header
		}
		return rows;
	}
	
	public String getDataFileName() {
		return dataFile;
	}

}
