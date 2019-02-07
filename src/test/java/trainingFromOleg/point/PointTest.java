package trainingFromOleg.point;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTo() {

        Point a = new Point(0,1);
        Point b = new Point(2,5);

        double result = a.distanceTo(b);
        assertThat(result, closeTo(4.4,0.1));
    }


    @Test
    public void distanceTo2() {

        Point a = new Point(-1,1);
        Point b = new Point(-2,5);

        double result = a.distanceTo(b);
        assertThat(result, closeTo(4.1,0.1));
    }

    @Test
    public void distanceTo3() {

        Point a = new Point(0,0);
        Point b = new Point(0,0);

        double result = a.distanceTo(b);
        assertThat(result, closeTo(0,0.1));
    }
}