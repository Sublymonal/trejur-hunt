package game;
import java.util.Scanner;



class Main {
public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
   
    intro introInstance = new intro();
    String direction = introInstance.start();
    
    // input output test
    // System.out.println(direction);
   
    while(!(direction.equals("left"))&&!(direction.equals("right"))){
        
        moron errorInstance = new moron();
        System.out.println("Do you want to go LEFT or RIGHT");
        direction = introInstance.pickAgainMotherFucker();
        
    }

    leftOrRight lrInstance = new leftOrRight();
    String action = lrInstance.direction(direction);

    while(!(action.equals("swim"))&&!(action.equals("wait"))){

        moron errorInstance = new moron();
        System.out.println("Do you want to go SWIM or WAIT");
        action = introInstance.pickAgainMotherFucker();
    }

    swimOrWait swInstance = new swimOrWait();
    String color = swInstance.action(action);

    while(!(color.equals("blue"))&&!(color.equals("yellow"))&&!(color.equals("red"))){
        moron errorInstance = new moron();
        System.out.println("Do you want to go to the BLUE, YELLOW, or RED door");
        color = introInstance.pickAgainMotherFucker();
    }
    
    colorPick colorInstance = new colorPick();
    String fuck = colorInstance.color(color);

}
}
                    
                        
                        
    
    
    




