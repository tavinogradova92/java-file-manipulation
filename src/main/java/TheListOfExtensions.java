package main.java;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public abstract class TheListOfExtensions {
    
    public static void showListOfExtensions() {
          
            // Choice of a file type
            System.out.println();
            System.out.println("Choose which types of files you would like to see: ");
            System.out.println("1 - txt");
            System.out.println("2 - jpeg");
            System.out.println("3 - png");
            System.out.println("4 - jfif");
            Scanner scanchoice = new Scanner(System.in);
            System.out.println();
            int choiceentry = -1;
    
            while (choiceentry < 1 || choiceentry > 4) {
    
                System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
            
                if (scanchoice.hasNextInt()) {
                    choiceentry = scanchoice.nextInt();
                }
                
                //Creating a File object for directory
                File directoryPath = new File("./src/main/resources");
                
                
                switch(choiceentry) {
                    case 1:
                        long startTime = System.nanoTime();

                        FilenameFilter textFilefilter = new FilenameFilter() {
                            public boolean accept(File dir, String name) {
                                String lowercaseName = name.toLowerCase();
                                if (lowercaseName.endsWith(".txt")) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        };

                        //List of all the text files
                        String filesList[] = directoryPath.list(textFilefilter);
                        System.out.println("List of the text files: ");
                        for(String textFileName : filesList) {
                            System.out.println(textFileName);
                            
                            // Logging Service for the count of txt files
                            LoggingService.executeLogging(textFileName);
                        }
                        long endTime = System.nanoTime();

                        // get difference of two nanoTime values
                        long executionTime = (endTime - startTime) / 1000000;

                        LoggingService.executeLogging(" The function took "
                                                        + executionTime
                                                        + " ms to execute.");
                            break;

                    case 2:
                        long startTime2 = System.nanoTime();
                        
                        FilenameFilter jpegFilefilter = new FilenameFilter() {
                            public boolean accept(File dir, String name) {
                                String lowercaseName = name.toLowerCase();
                                if (lowercaseName.endsWith(".jpg") 
                                    || lowercaseName.endsWith(".jpeg")) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        };

                        //List of all the text files
                        String jpegFilesList[] = directoryPath.list(jpegFilefilter);
                        System.out.println("List of the jpeg files: ");
                        for(String jpegFileName : jpegFilesList) {
                            System.out.println(jpegFileName);

                            // Logging Service for the count of jpg files
                            LoggingService.executeLogging(jpegFileName);
                        }
                        long endTime2 = System.nanoTime();

                        // get difference of two nanoTime values
                        long executionTime2 = (endTime2 - startTime2) / 1000000;

                        LoggingService.executeLogging(" The function took "
                                                        + executionTime2
                                                        + " ms to execute.");
                            break;
                        
                    case 3:
                        long startTime3 = System.nanoTime();

                        FilenameFilter pngFilefilter = new FilenameFilter() {
                            public boolean accept(File dir, String name) {
                                String lowercaseName = name.toLowerCase();
                                if (lowercaseName.endsWith(".png")) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        };

                        //List of all the text files
                        String pngFilesList[] = directoryPath.list(pngFilefilter);
                        System.out.println("List of the png files: ");
                        for(String pngFileName : pngFilesList) {
                            System.out.println(pngFileName);

                            // Logging Service for the count of png files
                            LoggingService.executeLogging(pngFileName);
                        }
                        long endTime3 = System.nanoTime();

                        // get difference of two nanoTime values
                        long executionTime3 = (endTime3 - startTime3) / 1000000;

                        LoggingService.executeLogging(" The function took "
                                                        + executionTime3
                                                        + " ms to execute.");
                            break;
                    case 4:
                        long startTime4 = System.nanoTime();

                        FilenameFilter jfifFilefilter = new FilenameFilter() {
                            public boolean accept(File dir, String name) {
                                String lowercaseName = name.toLowerCase();
                                if (lowercaseName.endsWith(".jfif")) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        };

                        //List of all the text files
                        String jfifFilesList[] = directoryPath.list(jfifFilefilter);
                        System.out.println("List of the jfif files: ");
                        for(String jfifFileName : jfifFilesList) {
                            System.out.println(jfifFileName);

                            // Logging Service for the count of jfif files
                            LoggingService.executeLogging(jfifFileName);
                        }
                        long endTime4 = System.nanoTime();

                        // get difference of two nanoTime values
                        long executionTime4 = (endTime4 - startTime4) / 1000000;

                        LoggingService.executeLogging(" The function took "
                                                        + executionTime4
                                                        + " ms to execute.");
                            break;
            }
        
            
            // The return to the main function
            System.out.println();
            int choiceentry2 = -1;
            System.out.println("Enter 5 to return to the main menu.");
            Scanner scanchoice2 = new Scanner(System.in);

            if (scanchoice2.hasNextInt()) {
                choiceentry2 = scanchoice2.nextInt();
            }

            while (choiceentry2 != 5) {
                System.out.println("Incorrect number. Please try again.");
                Scanner scanchoice3 = new Scanner(System.in);

                if (scanchoice2.hasNextInt()) {
                    choiceentry2 = scanchoice3.nextInt();
                }
            }
            
            if (choiceentry2 == 5) {
                Program.startTheMainMenu();
            } 

        }    
    }
}
