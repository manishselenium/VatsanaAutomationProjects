package UtilsOnFeed;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileInnerVoice {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "InnerVoiceConfig.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}

	
	
}
