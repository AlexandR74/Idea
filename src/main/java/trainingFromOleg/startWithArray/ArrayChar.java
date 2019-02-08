package trainingFromOleg.startWithArray;

public class ArrayChar {


    private char[] data;


    //constuctor
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */

    public boolean startWith(String prefix) {

        boolean result = true;
        char[] value = prefix.toCharArray(); //Метод toCharArray() создает из строки массив чаров (от англ. - char).

        //if prefix is empty return false
        if (value.length == 0) {
            return false;
        }

        if (data.length < value.length) {
            System.out.println("Warning!!! prefix > source word");
        }

        // compares items
        for (int item=0 ; item < value.length ; item++ ){

            //   System.out.println("data[item] = " + data[item] + " value [item] = " + value[item]);

            if ( value[item] != data[item]){
                result = false;
            }
        }

        return result;
    }

}

