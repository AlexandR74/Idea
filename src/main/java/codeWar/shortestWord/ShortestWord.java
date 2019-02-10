/**
 * Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 */


package codeWar.shortestWord;
import java.util.Arrays;

/**
 *  класс реализует задачу разбивая s на массив слов и вычисляя наменьшую длинну из ячейки массивов
 */
public class ShortestWord {

           public static int findShort(String s) {

            String[] ary = s.split(" ");
            int count =s.length();
               System.out.println(Arrays.toString(ary));
               System.out.println(" В начале count = s.length()" +count);
               System.out.println( "Входим в For");

            for ( int i = 0 ;  i < ary.length;  i++ ) {

                System.out.println("i = " +i);
                System.out.println("ary.length = "+ ary.length);
                System.out.println("Сравнение =  i < ary.length  " + ( i < ary.length));

                if ( ary[i].length() < count){

                    System.out.println("Сравниваем (ary[i].length() < count) = " + ( ary[i].length() < count));
                    count = ary[i].length();
                    System.out.println("count теперь  = "+ count);
                }
            }

            return count;
        }
    }

/**
 * Понравилось решение следующее
 *     public static int findShort(String s) {
 *         return Stream.of(s.split(" "))
 *           .mapToInt(String::length)
 *           .min()
 *           .getAsInt();
 *     }
 * }
 * Тоже непомешало было понять следующее
 * public static int findShort(String s) {
 *         int min = Integer.MAX_VALUE;
 *         for(String each : s.split(" "))
 *         {
 *         if(each.length() < min)
 *         min = each.length();
 *         }
 *          return min;
 *
 *
 */