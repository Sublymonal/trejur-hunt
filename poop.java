import java.util.Scanner;



class Main {
public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);

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
   
    while(!(pick.equals("left"))&&!(pick.equals("right"))){
        
        System.out.println("youre a fucking moron");
        pick = scnr.nextLine().toLowerCase();
    
    }
    if (pick.equals("left")){

        System.out.println(
                "After careful consideration, the seeker bravely opted for the left route. As they walked,\r\n" + //
                "the path took on an enchanting ambiance, filled with ethereal glows and a sense of mystery.\r\n" + //
                "They encountered the glade where the treasure awaited, affirming that their decision to turn left was indeed a safe and rewarding choice.\r\n" + //
                "\r\n" + //
                "Their journey continued, and they encountered a wide river blocking their way.\r\n" + //
                "Remembering the map's guidance to swim, but sees a boat of people heading towards the seeker.\r\n" + //
                "The treasure hunter pondered the risks.\r\n" + //
                "Swim or Wait?");

                pick = scnr.nextLine().toLowerCase();

                        while(!(pick.equals("swim"))&&!(pick.equals("wait"))){
                
                        System.out.println("youre a fucking moron");
                        pick = scnr.nextLine().toLowerCase();
            
                        }

                        if(pick.equals("swim")){
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

                                    pick = scnr.nextLine().toLowerCase();

                                    while(!(pick.equals("blue"))&&!(pick.equals("yellow"))&&!(pick.equals("red"))){
                                        System.out.println("youre a fucking moron");
                                        pick = scnr.nextLine().toLowerCase();
                                    }

                                    if(pick.equals("blue")){
                                        System.out.println("\r\n" + //
                                                "                   (    )\r\n" + //
                                                "                  ((((()))\r\n" + //
                                                "                  |o\\ /o)|\r\n" + //
                                                "                  ( (  _')\r\n" + //
                                                "                   (._.  /\\__\r\n" + //
                                                "                  ,\\___,/ '  ')\r\n" + //
                                                "    '.,_,,       (  .- .   .    )\r\n" + //
                                                "     \\   \\\\     ( '        )(    )\r\n" + //
                                                "      \\   \\\\    \\.  _.__ ____( .  |\r\n" + //
                                                "       \\  /\\\\   .(   .'  /\\  '.  )\r\n" + //
                                                "        \\(  \\\\.-' ( /    \\/    \\)\r\n" + //
                                                "         '  ()) _'.-|/\\/\\/\\/\\/\\|\r\n" + //
                                                "             '\\\\ .( |\\/\\/\\/\\/\\/|\r\n" + //
                                                "               '((  \\    /\\    /\r\n" + //
                                                "               ((((  '.__\\/__.')\r\n" + //
                                                "                ((,) /   ((()   )\r\n" + //
                                                "                 \"..-,  (()(\"   /\r\n" + //
                                                "                  _//.   ((() .\"\r\n" + //
                                                "          _____ //,/\" ___ ((( ', ___\r\n" + //
                                                "                           ((  )\r\n" + //
                                                "                            / /\r\n" + //
                                                "                          _/,/'\r\n" + //
                                                "                        /,/,\"\r\n" + //
                                                "            \r\n" + //
                                                "            \r\n" + //
                                                "            \r\n" + //
                                                "            The seeker decided to test fate and open the blue door. \r\n" + //
                                                "            As the door swung open, a menacing growl echoed from within, \r\n" + //
                                                "            and a ferocious horde of beasts leaped forth, \r\n" + //
                                                "            overwhelming the treasure hunter and leading to an abrupt \r\n" + //
                                                "            and unfortunate end to their quest.\r\n" + //
                                                "            \r\n" + //
                                                "            GAME OVER.");

                                    }
                                    if(pick.equals("yellow")){
                                        System.out.println("\r\n" + //
                                                "  ▓██   ██▓ ▒█████   █    ██     █     █░ ██▓ ███▄    █  ▐██▌    \r\n" + //
                                                "   ▒██  ██▒▒██▒  ██▒ ██  ▓██▒   ▓█░ █ ░█░▓██▒ ██ ▀█   █  ▐██▌    \r\n" + //
                                                "    ▒██ ██░▒██░  ██▒▓██  ▒██░   ▒█░ █ ░█ ▒██▒▓██  ▀█ ██▒ ▐██▌    \r\n" + //
                                                "    ░ ▐██▓░▒██   ██░▓▓█  ░██░   ░█░ █ ░█ ░██░▓██▒  ▐▌██▒ ▓██▒    \r\n" + //
                                                "    ░ ██▒▓░░ ████▓▒░▒▒█████▓    ░░██▒██▓ ░██░▒██░   ▓██░ ▒▄▄     \r\n" + //
                                                "     ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒    ░ ▓░▒ ▒  ░▓  ░ ▒░   ▒ ▒  ░▀▀▒    \r\n" + //
                                                "   ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░      ▒ ░ ░   ▒ ░░ ░░   ░ ▒░ ░  ░    \r\n" + //
                                                "   ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░      ░   ░   ▒ ░   ░   ░ ░     ░    \r\n" + //
                                                "   ░ ░         ░ ░     ░            ░     ░           ░  ░       \r\n" + //
                                                "   ░ ░                                                           \r\n" + //
                                                "\r\n" + //
                                                "            As the door swung open, it revealed a passage to a room filled \r\n" + //
                                                "            with ancient artifacts and the sought-after treasure. \r\n" + //
                                                "            The room was safe and filled with riches, marking the choice \r\n" + //
                                                "            of the yellow door as a successful and rewarding decision.");
                                    }
                                    if(pick.equals("red")){
                                        System.out.println("\r\n" + //
                                                "               (  .      )\r\n" + //
                                                "           )           (              )\r\n" + //
                                                "                 .  '   .   '  .  '  .\r\n" + //
                                                "        (    , )       (.   )  (   ',    )\r\n" + //
                                                "         .' ) ( . )    ,  ( ,     )   ( .\r\n" + //
                                                "      ). , ( .   (  ) ( , ')  .' (  ,    )\r\n" + //
                                                "     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )\r\n" + //
                                                "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\r\n" + //
                                                "\r\n" + //
                                                "    As the door creaked open, a fiery inferno erupted from within, consuming the treasure hunter.\r\n" + //
                                                " \r\n" + //
                                                "    GAME OVER.");
                                    } 
                        }
                        if(pick.equals("wait")){
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
    }
    if (pick.equals("right")){
        System.out.println("                                                                                                                                                                                                                                                                               \r\n" + //
                "                                                                  ░░  ░░░░░░                                                                          \r\n" + //
                "                                                        ░░░░░░░░░░░░░░▓▓▒▒░░░░░░░░  ░░░░                                                              \r\n" + //
                "                                                    ░░▒▒▓▓▓▓▒▒▓▓▒▒▒▒░░░░░░░░░░░░░░░░                                                                  \r\n" + //
                "                                                  ▒▒▒▒██▓▓▓▓▒▒▓▓▓▓░░▒▒░░▒▒░░▓▓░░░░    ░░░░░░                                                          \r\n" + //
                "                                              ░░▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░                                                                    \r\n" + //
                "                                              ▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒░░░░░░    ░░░░                                                          \r\n" + //
                "    Hole ->                                  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒░░▒▒░░░░    ░░░░                                                          \r\n" + //
                "                                              ░░▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓░░░░▒▒░░                                                                \r\n" + //
                "                                                ▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░░░                                                                  \r\n" + //
                "                                                  ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒░░▓▓░░  ░░                                                            \r\n" + //
                "                                                      ░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░▒▒▒▒░░░░                                                              \r\n" + //
                "                                                            ░░░░▓▓▓▓▒▒▓▓▓▓▓▓▒▒░░▒▒░░░░░░                                                              \r\n" + //
                "                                                                          ░░     \r\n" + //
                "                                                                              \r\n" + //
                "    After a moment of deliberation, the seeker decided to venture right. \r\n" + //
                "    This path seemed ominous, with thick undergrowth and a sense of foreboding. \r\n" + //
                "    The decision to take this route turned out to be perilous as the unsuspecting adventurer fell into a concealed pit, abruptly ending their journey.\r\n" + //
                "    \r\n" + //
                "    GAME OVER.");
    }
    

    }
}