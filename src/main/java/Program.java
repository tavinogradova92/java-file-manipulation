package main.java;
import java.util.Scanner;
  
public class Program { 
  
    public static void main(String[] args) {
        
        System.out.println("Enter one of the following commands: ");
        System.out.println("1 - Open the list of files");
        System.out.println("2 - Choose files by their extensions");
        System.out.println("3 - Play with some Drakula staff");
        System.out.println("4 - Exit the program");
        Scanner scanchoice = new Scanner(System.in);
        System.out.println();
        int choiceentry = -1;
    
        while (choiceentry < 1 || choiceentry > 4) {
    
            System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
            
            if (scanchoice.hasNextInt()) {
                choiceentry = scanchoice.nextInt();
            }
                
    
            switch(choiceentry) {
                case 1:
                    System.out.println("Here are all the files: ");
                    break;
                case 2:
                    System.out.println("Here are the formats you may choose from: ");
                    break;
                case 3:
                    System.out.println("Here is what you can do with Drakula: ");
                    break;
                case 4:
                    System.out.println("You have just quit the program. I am sorry to see you go.");
                    break;
            }
    
        } 


    }
    
    

} 