package Fit;

public class Fit {

    /*
    Идеальный вес для мужчины.
    @param height Рост.
    @return идеальный вес.
     */

    public double manWeight(double height) {

        if (height != 0) {
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

        if (height != 0) {
            return ((height - 110) * 1.15);
        }
        return 0;
    }

}
