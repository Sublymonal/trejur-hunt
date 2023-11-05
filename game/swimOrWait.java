package game;

import java.util.Scanner;

public class swimOrWait {
    public String action(String x) {
        
    Scanner scnr = new Scanner(System.in);

        if(x.equals("swim")){
            System.out.println(
                    "After careful consideration, the seeker decided to take the plunge and swim across the river.\r\n" + //
                    "The water was crystal clear, and as they swam, a shimmering school of friendly fish encircled the adventurer, \r\n" + //
                    "guiding them safely to the opposite bank.\r\n" + //
                    "\r\n" + //
                    "Emerging from the water, the treasure hunter felt relieved, \r\n" + //
                    "confirming that their choice to swim was indeed the correct and safe one.\r\n" + //
                    "\r\n" + //
                    "Advancing forward, the seeker found themselves in front of a door with three choices: blue, yellow, or red. \r\n" + //
                    "Remembering the importance of this decision, they paused to weigh the implications of each color. \r\n" + //
                    "Blue, Yellow, or Red?");

                    

                    
        
        }

        if(x.equals("wait")){
            System.out.println("\r\n" + //
                    "                            ,--.\r\n" + //
                    "                           {    }\r\n" + //
                    "                           K,   }\r\n" + //
                    "                          /  ~Y`\r\n" + //
                    "                     ,   /   /\r\n" + //
                    "                    {_'-K.__/\r\n" + //
                    "                      `/-.__L._\r\n" + //
                    "                      /  ' /`\\_}\r\n" + //
                    "                     /  ' /\r\n" + //
                    "             ____   /  ' /\r\n" + //
                    "      ,-'~~~~    ~~/  ' /_\r\n" + //
                    "    ,'             ``~~~  ',\r\n" + //
                    "   (                        Y\r\n" + //
                    "  {                         I\r\n" + //
                    " {      -                    `,\r\n" + //
                    " |       ',                   )\r\n" + //
                    " |        |   ,..__      __. Y\r\n" + //
                    " |    .,_./  Y ' / ^Y   J   )|\r\n" + //
                    " \\           |' /   |   |   ||\r\n" + //
                    "  \\          L_/    . _ (_,.'(\r\n" + //
                    "   \\,   ,      ^^\"\"' / |      )\r\n" + //
                    "     \\_  \\          /,L]     /\r\n" + //
                    "       '-_~-,       ` `   ./`\r\n" + //
                    "          `'{_            )\r\n" + //
                    "              ^^\\..___,.--`\r\n" + //
                    "\r\n" + //
                    "The seeker hesitated and decided to wait, hoping for the people help during this circumstance.\r\n" + //
                    "Unfortunately, the people seem to be unfriendly pirates and slaughtered the poor seekers life.\r\n" + //
                    "\r\n" + //
                    "GAME OVER.");
        }
        String pick = scnr.nextLine().toLowerCase();
        return pick;
    }
}
