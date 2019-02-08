package codeWar.divSeven;

public class DivSeven {

    public static long[] seven(long m) {
        int i=0;
        long[] result = {0,0};


        System.out.println(m);
        while (m>6) {
            System.out.println("m%7 = "+ m%7);
            System.out.println("m>6" + true);
            if (m % 7 == 0) {
                result[0]++;
                System.out.println(" m%7 ==0  => result[0]++="  + result[0]  );
            }
            m = (m / 10 - (m % 10 * 2));

            System.out.println( "m = (m / 10 - (m % 10 * 2)); =" +m);
            if (m>6){
                result[1]=m;
            }
            System.out.println("result[1]=m;  " +result[1] );
        }
        return result;

        }

    }

