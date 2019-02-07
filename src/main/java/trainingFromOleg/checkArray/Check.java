package trainingFromOleg.checkArray;

/*
Класс Check проверяет мбулеан масив на однородность
 */


public class Check {

    public boolean mono(boolean[] data) {

        boolean result = true;      // тригер
        boolean temp = data[0];     // первый элемент массива

        for (int i = 1; i < data.length ; i++) {

            if (temp != data[i]){
                result  = false;
            }

        }
        return result;
    }
}

