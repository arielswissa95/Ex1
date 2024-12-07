import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        //i add
    //“b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, “”, null

        @Test
        public void testIsNumber(){
           assertFalse(Ex1.isNumber("b2"));
            assertFalse(Ex1.isNumber("0b1"));
            assertFalse(Ex1.isNumber("123b"));
            assertFalse(Ex1.isNumber("1234b11"));
            assertFalse(Ex1.isNumber("3b3"));
            assertFalse(Ex1.isNumber("-3b5"));
            assertFalse(Ex1.isNumber("3 b4"));
            assertFalse(Ex1.isNumber("GbG"));
            assertFalse(Ex1.isNumber(null));
            assertFalse(Ex1.isNumber(""));

        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {

           // implement this test
        }
        @Test
        void maxIndexTest() {
            // implement this test
        }

        // Add additional test functions - test as much as you can.
    }
