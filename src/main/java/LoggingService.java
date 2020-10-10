package main.java;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.lang.SecurityException;
import java.io.IOException;
import java.util.logging.SimpleFormatter;

public abstract class LoggingService {
    
    public static void executeLogging() {
        
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
    
            // the following statement is used to log any messages  
            logger.info("My first log");  
    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
     
    }
    
}
