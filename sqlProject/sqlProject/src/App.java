import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conditions.Cases;
import helpers.GeneralHelpers;

public class App {
    public static void main(String[] args) throws Exception {

        while(true){


            ArrayList<String> query = GeneralHelpers.getUserInput();
            
            Cases.checkAllCases(query);

            System.out.println(query);
            

            String joinedStrings = String.join("", query);
            if(joinedStrings.equalsIgnoreCase("clear")){
               GeneralHelpers.clearConsole();
            }  

            }

         
        }


       
}

  
        


