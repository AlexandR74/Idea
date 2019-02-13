package trainingFromOleg.turnArray;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TurnArrayTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        TurnArray turner = new TurnArray();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));

    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray2() {
        TurnArray turner = new TurnArray();
        int[] input = new int[]{4, 1, 5, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 5, 1, 4};
        assertThat(result, is(expect));

    }
}