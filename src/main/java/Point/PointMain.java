package Point;

public class PointMain {
    public static void main(String[] args) {
        Point a = new Point(0,1);
        Point b = new Point(2,5);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
