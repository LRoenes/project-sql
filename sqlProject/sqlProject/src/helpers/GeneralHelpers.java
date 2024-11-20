package helpers;

import java.io.File;
import java.util.Scanner;

public class GeneralHelpers {
    
    static Scanner myScanner = new Scanner(System.in);

    public static String[] getUserInput(){

        String userInput = myScanner.nextLine();
        String[] splitedUserInput = userInput.split("[\\s,()]+");
         return splitedUserInput;

    }

    public static void createTable(String nameOftable){
        
        String fileName = nameOftable + ".cvs";
        String path = "src/myTables/";
        File directory = new File(path);
        System.out.println("HOLIII!");

        try {
          
            File myTable = new File(directory+"\\"+fileName);
            new File(myTable.getParent()).mkdirs();
            if (myTable.createNewFile()) {

                System.out.println("Your table has been created succesfully!");
                getUserInput();
                
            }else{

                System.out.println("An error has ocurred while creating your table");
                getUserInput();


            }
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }

                
        

        //trabajar aqui
        
    }

    
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void CreateFiles(String[] args) throws Exception {
    

        System.out.print("Insert your file name: ");

        String fileName = myScanner.nextLine() + ".cvs";

        String path = "src/myTables/";

        File myPath = new File(path);

        try {
          
            File myTable = new File(path+fileName);

            if (myTable.createNewFile()) {

                System.out.println("YIPIEEE");
                
            }else{

                System.out.println("Nooooo");


            }
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }



    public static void closeProgram(){

        myScanner.close();
        
    }



  

}
