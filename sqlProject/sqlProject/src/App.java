import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import helpers.GeneralHelpers;

public class App {
    public static void main(String[] args) throws Exception {

        while(true){


            String userInput[] = GeneralHelpers.getUserInput();

    
            GeneralHelpers.createTable(userInput[2]);

            String joinedStrings = String.join("", userInput);
            if(joinedStrings.equalsIgnoreCase("clear")){
               GeneralHelpers.clearConsole();
            }  

            List<String> categorizedTokens = new ArrayList<>();
                for (String token : userInput) {
                String category = orderTokens(token);
                categorizedTokens.add(token + " (" + category + ")");
                System.out.println(category);

            }

            if(orderTokens(userInput[2]).equalsIgnoreCase("IDENTIFIER")){
                 GeneralHelpers.createTable(userInput[2]);
                }
        }


       
    }

    
    public static String orderTokens(String token) {

        if (token.equalsIgnoreCase("CREATE") || token.equalsIgnoreCase("TABLE")) {
            return "KEYWORD";
        }
        else if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return "IDENTIFIER";
        }
        else if (token.matches("\\d+")) {
            return "NUMBER";
        }
        else {
            return "UNKNOWN";
        }
}
        
}

