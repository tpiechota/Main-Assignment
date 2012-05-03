package Com.kylegoslin;

public class ExampleUsage_1 {
	
	/***
	 * 
	 * Author: Tomasz Piechota 
	 * Project: Java - Semester 4 - Main Assignment
	 * 
	 ***/
	
	public ExampleUsage_1(){	

		/*** Logger StartUp - BEGIN ***/
		// This line has to be added to testing class for the Logger to work correctly!
		Com.kylegoslin.StartUp.config(this.getClass().getName().toString(), this.getClass().getPackage().getName().toString());
		/*** Logger StartUp - END ***/
		
		exampleMethod();
		
	}
	
	public void exampleMethod(){
		
		System.out.println("Hello World!");
		
	}
	
	public static void main (String [] args){
		
		new ExampleUsage_1(); // Main
		
	}

}
