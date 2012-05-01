package Com.kylegoslin;

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
		
	}
	
}
