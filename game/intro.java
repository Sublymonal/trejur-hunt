package game;
import java.util.Scanner;

public class intro {
    Scanner scnr = new Scanner(System.in);
    
    public String start(){
    
    
    System.out.println("You fid trejur");
    System.out.println(
                        "Welcome to Trejur Island.\n" +
                        "Your mission is to find the treasure.\n" +
                        "The map's cryptic instructions emphasized the significance of this choice.\n" +
                        "Contemplating the possibilities,\n" + 
                        "they remembered the warnings of dire consequences for taking the wrong path.\n" +
                        "The treasure hunter stood at a crucial junction on Treasure Island, facing the first decision:\n" +
                        "Left or Right?");
                    
                       String pick = scnr.nextLine().toLowerCase();
                       return pick;
    }
    
    public String pickAgainMotherFucker(){
        String pick = scnr.nextLine().toLowerCase();
         return pick;
    }
     
}
