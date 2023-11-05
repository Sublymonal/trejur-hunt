package game;

import java.util.Scanner;

public class leftOrRight {
    public String direction(String x){

        Scanner scnr = new Scanner(System.in);
        if (x.equals("left")){

            System.out.println(
                    "After careful consideration, the seeker bravely opted for the left route. As they walked,\r\n" + //
                    "the path took on an enchanting ambiance, filled with ethereal glows and a sense of mystery.\r\n" + //
                    "They encountered the glade where the treasure awaited, affirming that their decision to turn left was indeed a safe and rewarding choice.\r\n" + //
                    "\r\n" + //
                    "Their journey continued, and they encountered a wide river blocking their way.\r\n" + //
                    "Remembering the map's guidance to swim, but sees a boat of people heading towards the seeker.\r\n" + //
                    "The treasure hunter pondered the risks.\r\n" + //
                    "Swim or Wait?");
    
                   
            
        }

        if (x.equals("right")){
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
        String pick = scnr.nextLine().toLowerCase();
        return pick;
    }
}
