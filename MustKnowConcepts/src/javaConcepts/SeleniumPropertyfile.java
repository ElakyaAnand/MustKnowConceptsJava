package javaConcepts;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SeleniumPropertyfile {
	
	static Logger logger=Logger.getLogger(SeleniumPropertyfile.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("This is the Debug Error");
		logger.info("This is the information");
		logger.error("Error message");
		logger.warn("Warning message");
		logger.fatal("Fatal message");
		

	}

}
