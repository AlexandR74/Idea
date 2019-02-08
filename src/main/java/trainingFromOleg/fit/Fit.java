/**
 * The task of the training project from Oleg Aryukov
 */

package trainingFromOleg.fit;


public class Fit {


    public double manWeight(double height) {

     /*
    Идеальный вес для мужчины.
    @param height Рост.
    @return идеальный вес.
     */

        if (height != 0.0) {
            return ((height - 100) * 1.15);
        }
        return 0;
    }

    /*
    Идеальный вес для женщины.
    @param height Рост.
    @return идеальный вес.
     */

    public double womanWeight(double height) {

        if (height != 0.0) {
            return ((height - 110) * 1.15);
        }
        return 0;
    }
}
