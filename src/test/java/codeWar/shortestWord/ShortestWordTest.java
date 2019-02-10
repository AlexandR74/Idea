package codeWar.shortestWord;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ShortestWordTest {




    public class ShortestWordTestTest {
        @Test
        public void findShort() throws Exception {
            assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
            assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));

        }

            @Test
            public void test2() {
                ShortestWord shortestWord = new ShortestWord();
            int result = shortestWord.findShort("bitcoin take over the world maybe who knows perhaps");
            assertThat(result, is(3));

        }

    }
}