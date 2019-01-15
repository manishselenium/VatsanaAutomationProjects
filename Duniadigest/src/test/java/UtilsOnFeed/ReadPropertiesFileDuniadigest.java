package UtilsOnFeed;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileDuniadigest {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "DuniadigestConfig.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}

	
	
}
