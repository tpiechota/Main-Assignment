package Com.kylegoslin;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class LogHandler {
	
	// Create logger
	static Logger logger = Logger.getLogger("Com.kylegoslin");
	
	// Initialize FileHandlers
	static private FileHandler txtFile;
	static private FileHandler xmlFile;
	
	// Initialize Formatters
	static private SimpleFormatter txtFormatter;
	static private XMLFormatter xmlFormatter;
	
	// Date and Time
	static long nowEpoch = System.currentTimeMillis();
	static Format nowFormatter = new SimpleDateFormat("ddMMyyyyHHmmssz");
	static String timeNow;
	
	static public void Configure() throws IOException {
		
		// Set logger level (global)
		logger.setLevel(Level.INFO);
		
		// Assign converted epoch time to timeNow variable 
		timeNow = nowFormatter.format(nowEpoch);
		
		// Create FileHandlers
		txtFile = new FileHandler("Logging_" + timeNow + ".txt");
		xmlFile = new FileHandler("Logging_" + timeNow + ".xml");
		
		// Create Formatters
		txtFormatter = new SimpleFormatter();
		xmlFormatter = new XMLFormatter();
		
		// Add Formatters to FileHandlers
		txtFile.setFormatter(txtFormatter);
		xmlFile.setFormatter(xmlFormatter);
		
		// Add FileHandlers to Logger
		logger.addHandler(txtFile);
		logger.addHandler(xmlFile);		

	}	

}
