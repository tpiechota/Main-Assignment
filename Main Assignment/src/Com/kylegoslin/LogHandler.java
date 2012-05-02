package Com.kylegoslin;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
		logger.setLevel(Level.INFO);
		
		// Assign converted epoch time to timeNow variable 
		timeNow = nowFormatter.format(nowEpoch);
		
		// to be uncommented when finished
		//fileTxt = new FileHandler("Logging_" + timeNow + ".txt");
		//fileXML = new FileHandler("Logging_" + timeNow + ".xml");
		
		// to be removed when finished
		txtFile = new FileHandler("Logging.txt");
		xmlFile = new FileHandler("Logging.xml");

		// Create Formatters
		txtFormatter = new SimpleFormatter();
		xmlFormatter = new XmlFormatter();	

		// Add Formatters to handlers
		xmlFile.setFormatter(xmlFormatter);
		txtFile.setFormatter(txtFormatter);
		
		// Add handlers to logger
		logger.addHandler(xmlFile);
		logger.addHandler(txtFile);
	}
	
}