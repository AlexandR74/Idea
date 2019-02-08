package codeWar.divSeven;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.Test;




public class DivSevenTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new long[] {7, 2}, DivSeven.seven(49));
        assertArrayEquals(new long[] {35, 1}, DivSeven.seven(371));
        assertArrayEquals(new long[] {42, 1}, DivSeven.seven(483));
    }
}