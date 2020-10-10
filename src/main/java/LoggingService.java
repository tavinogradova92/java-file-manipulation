package main.java;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.lang.SecurityException;
import java.io.IOException;

public abstract class LoggingService {
    
    public static void executeLogging() {
         
    
        try {  
            Logger logger = Logger.getLogger("MyLog");  
            // This block configure the logger with handler and formatter  
            boolean append = true;
            FileHandler fh = new FileHandler("./src/test/MyLogFile.log", append);  
            logger.addHandler(fh);  
    
            // the following statement is used to log any messages  
            logger.info("My first log");  
    
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
     
    }
    
}
