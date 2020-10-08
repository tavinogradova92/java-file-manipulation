package main.java;
import java.io.File;

public abstract class TheListOfFiles {
    
    public static void theListOfFiles() {
          
            //Creating a File object for directory
            File directoryPath = new File("./src/main/resources");
            //List of all files and directories
            String contents[] = directoryPath.list();
            System.out.println("Here are all the files: ");

            for(int i = 0; i < contents.length; i++) {
                System.out.println(contents[i]);
             }
    }
}
