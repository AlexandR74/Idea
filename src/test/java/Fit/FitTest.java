package fit;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double count = fit.manWeight(180);
        assertThat(count, closeTo(92.0, 0.1));
    }

    @Test
    public void manWeightZeroTet() {
        Fit fit = new Fit();
        double count = fit.manWeight(0);
        assertThat(count, closeTo(0, 0.1));
    }




    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double count = fit.womanWeight(170);
        assertThat(count, closeTo(69.0, 0.1));
    }

    @Test
    public void womanWeightZeroTest() {
        Fit fit = new Fit();
        double count = fit.womanWeight(0);
        assertThat(count, closeTo(0, 0.1));
    }


}