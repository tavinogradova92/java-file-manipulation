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
                        }
                            break;

                    case 2:

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
                        }
                            break;
                        
                    case 3:
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
                        }
                            break;
                    case 4:
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
                        }
                            break;
            }
        
            
            // The return to the main function
            System.out.println();
            int choiceentry3 = -1;
            System.out.println("Enter 5 to return to the main menu.");
            Scanner scanchoice1 = new Scanner(System.in);

            if (scanchoice.hasNextInt()) {
                choiceentry3 = scanchoice1.nextInt();
            }

            while (choiceentry != 5) {
                System.out.println("Incorrect number. Please try again.");
                Scanner scanchoice4 = new Scanner(System.in);

                if (scanchoice.hasNextInt()) {
                    choiceentry = scanchoice4.nextInt();
                }
            }
            
            if (choiceentry == 5) {
                Program.startTheMainMenu();
            } 

        }    
    }
}
