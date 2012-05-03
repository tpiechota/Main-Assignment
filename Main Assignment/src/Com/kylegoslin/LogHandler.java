package Com.kylegoslin;


import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 * <p>The LogHandler class creates logger, FileHandlers and formatters. 
 * It also sets logger level and converts epoch time to human readable 
 * version that is used to name each log file that is being created.</p>
 * 
 * <p>This is part of the error logging / warning logging tool that can be used with any application.</p>
 * 
 * @author Tomasz Piechota
 * @version 0.1 Build 0001 May 03, 2012.
 *
 */
public class LogHandler {
	
	// Initialize FileHandlers
	static private FileHandler txtFile;
	static private FileHandler xmlFile;
	
	// Initialize Formatters
	static private SimpleFormatter txtFormatter;
	static private XMLFormatter xmlFormatter;
	
	// Create Logger
	static Logger logger = Logger.getLogger("Com.kylegoslin");

	// Date and Time
	static long nowEpoch = System.currentTimeMillis();
	static Format nowFormatter = new SimpleDateFormat("ddMMyyyyHHmmssz");
	static String timeNow;
			
	static public void Config() throws IOException {
		
		// Set logger level (global)
		logger.setLevel(Level.ALL);
		
		// Assign converted epoch time to timeNow variable 
		timeNow = nowFormatter.format(nowEpoch);
		
		// Create FileHandlers
		txtFile = new FileHandler("Log_" + timeNow + ".txt");
		xmlFile = new FileHandler("Log_" + timeNow + ".xml");

		// Create Formatters
		txtFormatter = new SimpleFormatter();
		xmlFormatter = new XmlFormatter();	

		// Add Formatters to handlers
		txtFile.setFormatter(txtFormatter);
		xmlFile.setFormatter(xmlFormatter);

		// Add handlers to logger
		logger.addHandler(txtFile);
		logger.addHandler(xmlFile);
		
	}
	
}