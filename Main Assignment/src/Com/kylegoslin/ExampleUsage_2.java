package Com.kylegoslin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;

/***
*
* Example usage tests the logger applied to it.
*
* Author: Tomasz Piechota 
* Project: Java - Semester 4 - Main Assignment
* 
*/
public class ExampleUsage_2 {
	
	boolean testOK;
	boolean isNumber;
	String fName;

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	* Default constructor.
	* This is where Logger Initiator has to be pasted into.
	*/	
	public ExampleUsage_2(){
		
		/*** Logger StartUp - BEGIN ***/
		// This line has to be added to testing class for the Logger to work correctly!
		StartUp.config(this.getClass().getName().toString(), this.getClass().getPackage().getName().toString());
		/*** Logger StartUp - END ***/
		
		try{
			
			enterName(); 
			
		}catch (Error ex){
			
			testOK =  false;

			LogHandler.logger.log(Level.WARNING, "trouble processing input", ex);
			
		}
		
		LogHandler.logger.fine("done");
		
		System.out.println("First Name.......: " + fName);
		
		System.exit(0);

		
	}
	
	/**
	* Simple prompt asking for user name and tests user input. Logs messages and errors if occur.
	*/
	public void enterName(){
		
		do{// First Name BEGIN.
			
			System.out.print("ENTER FIRST NAME.......: ");
			
			testOK =  true;
			isNumber = true;
			
			try{
				
				fName = reader.readLine();
				
		    	// Validates if FirstName is a number.
				try{
		    		
		    		Integer.parseInt(fName);
		    		
		    		isNumber = true;
		    		
		    	}catch( Exception e){

		    		isNumber = false;

		    	}
		    	
				//Checks if the user entered any value and it is at least 3 characters long.
				if(fName.isEmpty() || fName.length() <= 3){
				
					testOK = false;
					
					LogHandler.logger.log(Level.SEVERE, "User input too short (min. 3 characters)");

					System.out.println("*** ERROR! TRY AGAIN (min. 3 characters) ***");
					System.out.println();
				
				}else if(isNumber == true){// If the input is a number testOK = false.
					
					testOK = false;
					
					LogHandler.logger.log(Level.WARNING, "User entered Integer value instead String/Char.");
					
					System.out.println("*** ERROR! NO NUMBERS ALLOWED! TRY AGAIN ***");
					System.out.println();
					
				}else if(fName.contains(" ")){// If the input contains spaces " " then testOK = false.
					
					testOK = false;
					
					LogHandler.logger.log(Level.WARNING, "User entered blank characters.");
					
					System.out.println("*** ERROR! NO SPACES ALLOWED! TRY AGAIN ***");
					System.out.println();
					
				}else{
					
					testOK = true;
					
				}
				
			}catch(Exception e){
				
				testOK = false;
				
				LogHandler.logger.log(Level.INFO, "trouble processing input", e);
				
				System.out.println("*** ERROR! TRY AGAIN ***");
				System.out.println();
				
			}
			
		}while(!testOK);// First Name END.
		
		
	}
	
	/**
	* main
	*/
	public static void main (String [] args){

		new ExampleUsage_2();
		
	}
	
}
