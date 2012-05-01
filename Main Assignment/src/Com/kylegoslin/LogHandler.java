package Com.kylegoslin;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class LogHandler {
	
	//Create logger
	static Logger logger = Logger.getLogger("Com.kylegoslin");
	
	//Initialize FileHandlers
	static private FileHandler txtFile;
	static private FileHandler xmlFile;
	
	//Initialize Formaters
	static private SimpleFormatter txtFormatter;
	static private SimpleFormatter xmlFormatter;
	
	

}
