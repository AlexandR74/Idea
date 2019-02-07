package trainingFromOleg.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is; // что он делает?
import static org.junit.Assert.*;


    public class CalculatorTest  {
        @Test
        public void whenAddOnePlusOneThenTwo()  {
            Calculator calc = new Calculator();
            calc.add(1D, 1D);
            double result = calc.getResult();
            double expected = 2D;
            assertThat(result, is(expected));
        }

        @Test
        public void whenFiveSubstrThreeIsTwo()  {
            Calculator calc = new Calculator();
            calc.subtract(5D, 3D);
            double result = calc.getResult();
            double expected = 2D;
            assertThat(result, is(expected));
        }

        @Test
        public void whetTenDivTwoIsFive()  {
            Calculator calc = new Calculator();
            calc.div(10D, 2D);
            double result = calc.getResult();
            double expected = 5D;
            assertThat(result, is(expected));
        }

        @Test
        public void whetTenDivZeroIsZero()  {
            Calculator calc = new Calculator();
            calc.div(10D, 0D);
            double result = calc.getResult();
            double expected = 0D;
            assertThat(result, is(expected));
        }


        @Test
        public void whenFiveMultipleTwoisTen()  {
            Calculator calc = new Calculator();
            calc.multiple(5D, 2D);
            double result = calc.getResult();
            double expected = 10D;
            assertThat(result, is(expected));
        }
    }