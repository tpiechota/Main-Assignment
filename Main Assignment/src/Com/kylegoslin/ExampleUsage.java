package Com.kylegoslin;

public class ExampleUsage {
	
	/***
	 * 
	 * 
	 * Author: Tomasz Piechota 
	 * 
	 * 
	 ***/
	
	public ExampleUsage(){	

		/*** Logger StartUp - BEGIN ***/
		// This line has to be added to testing class for the Logger to work correctly!
		StartUp.config(this.getClass().getName().toString(), this.getClass().getPackage().getName().toString());
		/*** Logger StartUp - END ***/
		
		dupa();
		
	}
	
	public void dupa(){}
	
	public static void main (String [] args){
		
		new ExampleUsage(); // Main
		
	}

}
