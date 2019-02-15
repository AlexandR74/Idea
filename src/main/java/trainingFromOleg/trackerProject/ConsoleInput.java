package trainingFromOleg.trackerProject;
import java.util.Scanner;

public class ConsoleInput {


    public String ask(String question) {
        System.out.println(question);
        Scanner in = new Scanner(System.in);

        if (question == "Введите пункт меню :  "){

            if (in.hasNextInt()) {
                int mInt = Integer.valueOf(in.nextInt());
                if (mInt>-1 && mInt<7){
                    return mInt;
            }
        }
            return
        }



        return question;
    }
}