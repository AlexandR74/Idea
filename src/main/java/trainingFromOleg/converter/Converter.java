package trainingFromOleg.converter;

/*
Конвертер валют
 */


public class Converter {
    /*
    Конвертируем рубли в евро.
    @param value рубли.
    @return Евро.
     */

    public int rubleToEuro (int value){
        if(value >0) {
            return (value / 70);
        }
        return 0;
    }

    /*
    Конвертируем рубли в доллары
    @param value рубли
    @return Доллары
     */

    public int rubleToDollar (int value){
        if(value >0) {
            return (value / 60);
        }
        return 0;
    }

    /*
    Конвертируем доллары в рубли
    @param value доллары.
    @return рубли.
     */
    public int dollatToRuble (int value) {
        return (value*60);
    }

    /*
    конвертируем доллары в евро
    @param value доллары.
    @value рубли.
     */
    public int euroToRuble (int value) {
        return (value*70);
    }

}
/*Где проврека на валидность входных данных?
  допустим я на вход в любой из методов где делится подам 0, что тогда будет?
*/