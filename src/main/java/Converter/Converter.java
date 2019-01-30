package Converter;

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
        return (value/70);

    }

    /*
    Конвертируем рубли в доллары
    @param value рубли
    @return Доллары
     */

    public int rubleToDollar (int value){
        return (value/60);
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
