package model;

import java.util.ArrayList;

public class Tokenizer {
    
   public static ArrayList<String> tokenizeUserInput(String command){

    ArrayList<String> tokens = new ArrayList<>();   
    String regex = "\\s+|,|\\(|\\)";

    for(String token: command.split(regex)){
        if(!tokens.equals("")){

        tokens.add(token);
            
        }


    }

    return tokens; 

   } 


}
