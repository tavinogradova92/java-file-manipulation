package main.java;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public abstract class TextManipulation {
    
    public static void showTextProperties() {

        System.out.println("");
        System.out.println("The information about the Dracula novel: ");
        System.out.println("");

        //Creating a File object for the text
        File textPath = new File("./src/main/resources/Dracula.txt");

        // Logging file's name and size
        System.out.println("Name: " + textPath.getName());
        System.out.println("Size: " + textPath.length() + " bytes");
        
    }

    public static void countTheLines() {
   
        // Counting the number of lines
        try {
            File textPath = new File("./src/main/resources/Dracula.txt");
            FileInputStream fis = new FileInputStream(textPath);
            byte[] byteArray = new byte[(int)textPath.length()];
            fis.read(byteArray);
            String data = new String(byteArray);
            String[] stringArray = data.split("\r\n");
            System.out.println("Number of lines in the file are: " + stringArray.length);
        }

        catch(Exception err) {
            System.out.println(err);
        }
        
    }

    static int countOccurences(String str, String word) {

        // split the string by spaces in a 
        String a[] = str.toLowerCase().split(" "); 
  
        // search for pattern in a 
        int count = 0; 
        for (int i = 0; i < a.length; i++) { 
            // if match found increase count 
            if (word.equals(a[i])) 
                count++; 
        } 
        return count;
    }

    public static void countOccurences() {
        
        try {
            System.out.println("Search if the word of your choice exists in the file.");
            System.out.println("Enter the word you'd like to search for:");
    
            Scanner scanWord = new Scanner(System.in);
            if (scanWord.hasNext()) {
                String word = scanWord.next().toLowerCase();
                String path = "./src/main/resources/Dracula.txt";
                String str = Files.readString(Paths.get(path));
                System.out.println("The word \"" + word + "\" appears in Dracula " + countOccurences(str, word) + " times.");
            }   
        } catch (IOException err) {
            err.printStackTrace();
        }
        
    }


    public static void returnToTheMainMenu() {

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
