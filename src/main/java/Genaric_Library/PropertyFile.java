package Genaric_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {
	
	public String getPropertydata(String key) throws Throwable {
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream(IPathConstant.propertyFIlePath);
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
