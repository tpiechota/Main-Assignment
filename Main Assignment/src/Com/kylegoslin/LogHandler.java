package Com.kylegoslin;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;


public class LogHandler {
	
	//Create logger
	static Logger logger = Logger.getLogger("Com.kylegoslin");
	
	//Initialize FileHandlers
	static private FileHandler txtFile;
	static private FileHandler xmlFile;
	
	//Initialize Formatters
	static private SimpleFormatter txtFormatter;
	static private XMLFormatter xmlFormatter;
	
	static public void Configure() throws IOException {
		
		// Set logger level (global)
		logger.setLevel(Level.INFO);
		
		// Create FileHandlers
		txtFile = new FileHandler("Log_file.txt");
		xmlFile = new FileHandler("Log_file.xml");
		
		// Create Formatters
		txtFormatter = new SimpleFormatter();
		xmlFormatter = new XMLFormatter();
		
		// Add Formatters to FileHandlers
		txtFile.setFormatter(txtFormatter);
		xmlFile.setFormatter(xmlFormatter);

	}
	
	

}
