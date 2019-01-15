package UtilsOnFeed;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileHealthiastic {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "HollywoodpieConfig.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}
}
