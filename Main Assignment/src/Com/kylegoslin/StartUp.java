package Com.kylegoslin;


import java.io.IOException;
import java.util.logging.Level;


/**
 * <p>The StartUp class starts up / initializes logging application.</p>
 * 
 * <p>This is part of the error logging / warning logging tool that can be used with any application.</p>
 * @author Tomasz Piechota
 * @version 0.1 Build 0001 May 03, 2012.
 *
 */
public class StartUp {
	
	// Variables
	static String className;
	static String packageName;
	
	/**
	 * This method takes class name and package name from Logger Initiator placed in testing class.
	 *  
	 * @param cn className - stores class name of the testing class
	 * @param pn packageName - stores package name of the testing class
	 */
	public static void config(String cn, String pn){
		
		className = cn;
		packageName = pn;
		
		try {
			
			LogHandler.Config();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			LogHandler.logger.log(Level.SEVERE, "This is a severe level message!");

			throw new RuntimeException("File could not be created!");
			
		}
		
		// Set logger level and messages for each level
		LogHandler.logger.setLevel(Level.ALL);
		
		LogHandler.logger.severe("Severe Message");
		LogHandler.logger.warning("Warning Message");
		LogHandler.logger.info("Info Message");
		LogHandler.logger.fine("Fine Message");
		LogHandler.logger.finer("Finer Message");
		LogHandler.logger.finest("Finest Message");
		
		LogHandler.logger.log(Level.SEVERE, "This is a severe level message!");
		LogHandler.logger.log(Level.WARNING, "This is a warning level message!");
		LogHandler.logger.log(Level.INFO, "This is a info level message!");
		LogHandler.logger.log(Level.FINE, "This is a fine level message!");
		LogHandler.logger.log(Level.FINER, "This is a finer level message!");
		LogHandler.logger.log(Level.FINEST, "This is a finest level message!");
		
	}
	
	// Getters and Setters
	
	/**
	 * Returns class name of the testing class
	 * @return className - testing class name
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Sets className variable with the name provided by Logger Initiator
	 * @param className testing class name
	 */
	public void setClassName(String className) {
		StartUp.className = className;
	}

	/**
	 * Returns package name of the testing class
	 * @return packageName - testing class package name
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * Sets packageName variable with the name provided by Logger Initiator
	 * @param packageName testing class package name
	 */
	public static void setPackageName(String packageName) {
		StartUp.packageName = packageName;
	}

}