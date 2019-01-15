package UtilsOnFeed;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileGeeksmate {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "GeeksmateConfig.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}

	
	
}
