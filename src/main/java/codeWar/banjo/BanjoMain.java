/**
 * task from the codewars project
 */


package codeWar.banjo;


/**
 * The banjo class is determined by the initial
 * letters in the name of whether you play
 * the banjo (if the name starts with R r then you play)
 */


public class BanjoMain {


    public static void main(String[] args) {

        Banjo name  = new Banjo();

        String a = name.areYouPlayingBanjo("Runner");

        System.out.println(a);
    }
}
