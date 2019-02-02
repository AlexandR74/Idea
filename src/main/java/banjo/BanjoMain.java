package banjo;



import java.sql.SQLOutput;

public class BanjoMain {
    public static void main(String[] args) {

        Banjo name  = new Banjo();

        String a = name.areYouPlayingBanjo("Runner");

        System.out.println(a);
            }
}
