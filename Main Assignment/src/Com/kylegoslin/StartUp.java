package Com.kylegoslin;

import java.util.logging.Level;

public class StartUp {
	
	// Variables
	static String className;
	static String packageName;

	// This method takes class name and package name from testing class
	public static void config(String cn, String pn){
		
		className = cn;
		packageName = pn;
		
		//Test to be removed when finished
		System.out.println(className);
		System.out.println(packageName);
		
		
		// Set logger level and messages for each level
		LogHandler.logger.setLevel(Level.ALL);
		LogHandler.logger.severe("Severe Error Message");
		LogHandler.logger.warning("Warning Message");
		LogHandler.logger.info("Error Message");
		
	}
	
	
	// Getters and Setters
	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		StartUp.className = className;
	}

	public static String getPackageName() {
		return packageName;
	}

	public static void setPackageName(String packageName) {
		StartUp.packageName = packageName;
	}
	
}
