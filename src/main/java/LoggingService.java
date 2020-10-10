package main.java;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.lang.SecurityException;
import java.io.IOException;
import java.util.logging.SimpleFormatter;
import java.text.SimpleDateFormat;  
import java.util.Date;

public abstract class LoggingService {
    
    public static void executeLogging(String args) {
        
        Logger logger = Logger.getLogger("MyLog");  
        // This block configure the logger with handler and formatter  
        boolean append = true;
        FileHandler fh;
    
        try {  
            
            fh = new FileHandler("./src/test/MyLogFile.log", append);  
            logger.addHandler(fh);  

            // Print a brief summary of the LogRecord in a human readable format.
			SimpleFormatter formatter = new SimpleFormatter();	
            fh.setFormatter(formatter);

            // Show the date and time in a friendly format
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date(); 
    
            // the following statement is used to log any messages  
            logger.info(dateFormatter.format(date) 
                        + " " 
                        + args);  
    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
     
    }
    
    }

