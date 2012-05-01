package Com.kylegoslin;

import java.lang.reflect.Method;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class XmlFormatter extends XMLFormatter {
	
	// Create StringBuffer
	StringBuffer sb = new StringBuffer();
	
	// Initialize bugID
	private int bugID;
	
	public String format(LogRecord record) {
		
		try {			
			
			// Get methods from testing class using Reflections
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

}
