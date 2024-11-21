package helpers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import model.Tokenizer;

public class GeneralHelpers {
    
    static Scanner myScanner = new Scanner(System.in);

    public static ArrayList<String> getUserInput(){

        myScanner.useDelimiter(";");
        String userInput = myScanner.next();
        ArrayList<String> splitedUserInput = Tokenizer.tokenizeUserInput(userInput);
         return splitedUserInput;

    }

    public static void createTable(ArrayList<String> splittedQuery){
        
        String fileName = splittedQuery.get(2) + ".cvs";
        String path = "src/myTables/";
        File directory = new File(path);

        try {
            
            File myTable = new File(directory+"\\"+fileName);
            new File(myTable.getParent()).mkdirs();
            if (myTable.createNewFile()) {

                String headers = "";

                for(int i = 3; i<splittedQuery.size(); i++){

                    if(i + 1 == splittedQuery.size()){

                        headers = headers + splittedQuery.get(i);

                    }else{

                        headers = headers + splittedQuery.get(i) + ",";

                    }

                }

                FileWriter writer = new FileWriter(myTable);
                writer.write(headers);
                writer.close();
                //To do: Create properties

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




    public static void closeProgram(){

        myScanner.close();
        
    }



  

}


