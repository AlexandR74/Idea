package trainingFromOleg.trackerProject;
import java.util.Scanner;

public class ConsoleInput {


    public String ask (String question){
        System.out.println(question);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String num2 = String.valueOf(num);
        return  num2;   // невероятно много сущностей натворил :)
    }
}
