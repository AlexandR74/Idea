/**
 * task from codewar project
 *
 * description of the task - write a method that writes that you play codeWar.banjo,
 *  if your name starts with a large or small letter R.
 */


package codeWar.Banjo;


/**
 * class Banjo  has only one method to solve the problem.
 */

public class Banjo {

    /**
     *
     * checks if the name starts with R,
     * or with r, then displays the text
     * according to the conditions
     */
    public  String areYouPlayingBanjo(String name) {
        if (name.startsWith("R"))return name +" plays codeWar.banjo";
        if (name.startsWith("r"))return name +" plays codeWar.banjo";

        return name + " does not play codeWar.banjo";
    }
}



// best solution
//return name.matches("[Rr].*") ? name + " plays codeWar.banjo" : name + " does not play codeWar.banjo";
