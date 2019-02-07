package trainingFromOleg.turnArray.converter;

import org.junit.Test;
import trainingFromOleg.converter.Converter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void when70RuToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void testMinusCount() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(-1);
        assertThat(result, is(0));
    }


    @Test
    public void when60RuToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void testMinusount() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(-1);
        assertThat(result, is(0));
    }

    @Test
    public void whenDollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollatToRuble(1);
        assertThat(result, is(60));
    }

    @Test
    public void whenEuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}