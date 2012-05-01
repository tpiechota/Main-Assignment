package Com.kylegoslin;

import java.lang.reflect.Method;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class XmlFormatter extends XMLFormatter {
	
	// Create StringBuffer
	StringBuffer sb = new StringBuffer();
	
	// Initialize bugID
	private int bugID;
	
	// Create objects className and packageName
	// This will allow dynamic access to testing class name and package name
	StartUp className = new StartUp();
	StartUp packageName = new StartUp();
	
	public String format(LogRecord record) {
		
		try {			
			
			// Get methods from testing class using Reflection
			Class<?> myClass = Class.forName("ExampleUsage");
			Method m[] = myClass.getDeclaredMethods();
			
			bugID = 0;
			
			for(int i = 0; i < m.length; i++){				
				
				sb.append("<record>\n");
				
				sb.append("<bugID>" + bugID + "</bugID>\n");
				sb.append("<message>" + bugID + "</message>\n");
				sb.append("<Time_Epoch)>" + bugID + "</Time_Epoch>\n");				
				sb.append("<class>" + bugID + "</class>\n");
				sb.append("<package>" + bugID + "</package>");
				sb.append("<method>" + bugID + "</method>\n");
				
				sb.append("</record>\n");
				
				bugID++;
		 		   
		 	}		
			
		} catch (ClassNotFoundException e){
			
			e.printStackTrace();
			
		}
		
		return null;
				
	}
	
	
	// This method is called just after the handler using this formatter is created
	public String getHead(Handler h){
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n"
			+ "<!DOCTYPE log SYSTEM \"logger.dtd\">\n"
			+ "<log>\n";
			
	}

	
	// This method is called just after the handler using this formatter is closed
	public String getTail(Handler h){
		
		return "</log>\n";
		
	}

}
