package trainingFromOleg.trackerProject;
import java.util.Scanner;
import java.io.*;
public class ConsoleInput {


    public String ask(String question) {
        System.out.println(question);
        Scanner in = new Scanner(System.in);

        String key = in.nextLine();


        return key;
    }

}

