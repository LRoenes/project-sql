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

    public static String createTable(String nameOftable){
        
        System.out.println();
        System.out.println(nameOftable);

        return "";

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
