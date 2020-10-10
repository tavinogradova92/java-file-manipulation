package main.java.services;
import main.java.*;
import java.io.File;
import java.util.Scanner;

public abstract class TheListOfFiles {
    
    public static void showListOfFiles() {

            long startTime = System.nanoTime();
          
            //Creating a File object for directory
            File directoryPath = new File("./src/main/resources");
            //List of all files and directories
            String contents[] = directoryPath.list();
            System.out.println("");
            System.out.println("Here are all the files: ");
            System.out.println("");

            StringBuilder contentsString = new StringBuilder();

            for(int i = 0; i < contents.length; i++) {
                contentsString.append(contents[i] + ", ");
                System.out.println(contents[i]);
            }

            long endTime = System.nanoTime();

            // get difference of two nanoTime values
            long executionTime = (endTime - startTime) / 1000000;
            
            // Logging Service for the count 
            
            LoggingService.executeLogging(contentsString
                                        + "The function took "
                                        + executionTime
                                        + " ms to execute.");

            // The return to the main function
            System.out.println();
            int choiceentry = -1;
            System.out.println("Enter 5 to return to the main menu.");
            Scanner scanchoice = new Scanner(System.in);

            if (scanchoice.hasNextInt()) {
                choiceentry = scanchoice.nextInt();
            }

            while (choiceentry != 5) {
                System.out.println("Incorrect number. Please try again.");
                Scanner scanchoice2 = new Scanner(System.in);

                if (scanchoice.hasNextInt()) {
                    choiceentry = scanchoice2.nextInt();
                }
            }
            
            if (choiceentry == 5) {
                Program.startTheMainMenu();
            } 

            
    }
}