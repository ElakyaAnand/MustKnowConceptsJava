package javaConcepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SeleniumBasicConfigurator {

	static Logger logger=Logger.getLogger(SeleniumBasicConfigurator.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("This is the Debug Error");
		logger.info("This is the information");
		logger.error("Error message");
		logger.warn("Warning message");
		logger.fatal("Fatal message");
		
		
	}

}
