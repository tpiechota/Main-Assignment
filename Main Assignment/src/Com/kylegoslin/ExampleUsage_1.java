package Com.kylegoslin;


/**
 *
 * Example usage tests the logger applied to it.
 *
 * Author: Tomasz Piechota 
 * Project: Java - Semester 4 - Main Assignment
 * 
 */
public class ExampleUsage_1 {
	
	/**
	* Default constructor.
	* This is where Logger Initiator has to be pasted into.
	*/
	public ExampleUsage_1(){	

		/*** Logger Initiator - BEGIN *****************************************************/
		/* This line has to be added to testing class for the Logger to work correctly! */
		Com.kylegoslin.StartUp.config(this.getClass().getName().toString(), this.getClass().getPackage().getName().toString());
		/*** Logger Initiator - END *******************************************************/
		
		exampleMethod();
		
	}
	
	/**
	* Prints out "Hello World!" to the console.
	*/
	public void exampleMethod(){
		
		System.out.println("Hello World!");
		
	}
	
	/**
	* Main
	*/
	public static void main (String [] args){
		
		new ExampleUsage_1(); // Main
		
	}

}
