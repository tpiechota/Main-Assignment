package Com.kylegoslin;

import java.lang.reflect.Method;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class XmlFormatter extends XMLFormatter {

	// Create StringBuffer
	StringBuffer sb = new StringBuffer(1000);
	
	// Initialize bugID
	int bugID;	
	
	// Create objects className and packageName
	// This will allow dynamic access to testing class name and package name
	StartUp className = new StartUp();
	StartUp packageName = new StartUp();	
	
	// This method is called for every log records 
	public String format(LogRecord record) {
		
		try {			
			
			// Get methods from testing class using Reflection
			Class<?> myClass = Class.forName(className.getClassName());
			Method m[] = myClass.getDeclaredMethods();
			
			for(int i = 0; i < m.length; i++){		 		   
				
				sb.append("<record>\n");
				sb.append("<bugId>" + bugID + "</bugId>\n");
				sb.append("<message>" + formatMessage(record) + "</message>\n");
				sb.append("<millis>" + record.getMillis() + "</millis>\n");				
				sb.append("<messsageType>" + record.getLevel() + "</messsageType>\n");
				//sb.append("<method>" + m[i].toString() + "</method>\n");
				sb.append("<class>" + className.getClassName() + "</class>\n");
				sb.append("<package>" + packageName.getPackageName() + "</package>\n");
				sb.append("</record>\n");
				
				bugID++;
		 		   
		 	}		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
		
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