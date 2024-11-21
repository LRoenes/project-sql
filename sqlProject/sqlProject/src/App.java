import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import helpers.GeneralHelpers;

public class App {
    public static void main(String[] args) throws Exception {

        while(true){


            ArrayList<String> query = GeneralHelpers.getUserInput();

            System.out.println(query);
            GeneralHelpers.createTable(query);

           

            String joinedStrings = String.join("", query);
            if(joinedStrings.equalsIgnoreCase("clear")){
               GeneralHelpers.clearConsole();
            }  

            }

         
        }


       
}

  
        


