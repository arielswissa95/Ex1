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
            int v2 = Ex1.number2Int(s2);//טעות אין B ובסיס
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));

        }



        @Test
         void testIsNumber(){
            assertTrue(Ex1.isNumber("1"));
            assertFalse(Ex1.isNumber("b"));
            assertFalse(Ex1.isNumber("t"));
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
             assertFalse(Ex1.isNumber("BbA"));
            assertFalse(Ex1.isNumber("11289b7"));
            assertTrue(Ex1.isNumber("AbB"));
            assertTrue(Ex1.isNumber("1011b2"));
            assertTrue(Ex1.isNumber("EFbG"));


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
            assertEquals("",Ex1.int2Number(5,20));
            assertEquals("",Ex1.int2Number(-3,5));
            assertEquals("",Ex1.int2Number(5,1));

            assertEquals("101b2",Ex1.int2Number(5,2));
            assertEquals("BbG",Ex1.int2Number(11,16));
            assertEquals("BbC",Ex1.int2Number(11,12));



            // implement this test
        }

       @Test
       void equalsTest(){
        assertTrue(Ex1.equals("1000b2","10b8"));
        assertTrue(Ex1.equals("FbG","15"));
        assertFalse(Ex1.equals("BbG","12"));
        assertFalse(Ex1.equals("b","12"));
        assertFalse(Ex1.equals("BbG","b"));
        assertFalse(Ex1.equals(null,"12"));
        assertFalse(Ex1.equals("5","2 b3"));
        assertFalse(Ex1.equals("7",""));






       }
      @Test
      void WhatTheBaseTest(){
            assertEquals(10,Ex1.WhatTheBase("A"));
          assertEquals(-1,Ex1.WhatTheBase("a"));
          assertEquals(-1,Ex1.WhatTheBase("1"));
          assertEquals(-1,Ex1.WhatTheBase("-2"));
          assertEquals(-1,Ex1.WhatTheBase("0"));
          assertEquals(-1,Ex1.WhatTheBase("T"));
          assertEquals(16,Ex1.WhatTheBase("G"));
          assertEquals(2,Ex1.WhatTheBase("2"));
          assertEquals(8,Ex1.WhatTheBase("8"));


      }
     @Test
     void isExistTest(){
            char[] arr={};
         char[] arr1={'5'};
         char[] arr2={'A','B','8'};
         char[] arr3={'5','6','7'};
         char[] arr4={'A'};
         assertTrue(Ex1.isExist('B',arr2));
         assertFalse(Ex1.isExist('G',arr3));
         assertFalse(Ex1.isExist('8',arr4));
         assertTrue(Ex1.isExist('5',arr1));
         assertFalse(Ex1.isExist('5',arr));
     }
     @Test
     void indexTest(){
         char[] arr={};
         char[] arr1={'7','8'};
         char[] arr2={'a','g','R','8'};
         char[] arr3={'5','6','7'};
         char[] arr4={'A'};
         assertEquals(0,Ex1.index('a',arr2));
         assertEquals(-1,Ex1.index('G',arr3));
         assertEquals(-1,Ex1.index('8',arr4));
         assertEquals(1,Ex1.index('8',arr1));
         assertEquals(-1,Ex1.index('5',arr));
        }
     @Test
     void int2StringBaseTest(){

         assertEquals("B",Ex1.int2StringBase(11));
         assertEquals("A",Ex1.int2StringBase(10));
         assertEquals("G",Ex1.int2StringBase(16));
         assertEquals("2",Ex1.int2StringBase(2));
         assertEquals("9",Ex1.int2StringBase(9));


     }





    @Test
    void maxIndexTest() {
            // implement this test
        String[]arr6={"12","10011b2","1FbG","E4bG"};

        assertEquals(3,Ex1.maxIndex(arr6));

        String[]arr={"5b8","1011b2"};
            assertEquals(1,Ex1.maxIndex(arr));
            String[]arr1={"10","5b8","1011b2"};
            assertEquals(2,Ex1.maxIndex(arr1));
            String[]arr2={"c","g","t"};
            assertEquals(-1,Ex1.maxIndex(arr2));
            String[]arr3={};
            assertEquals(-1,Ex1.maxIndex(arr3));
            String[]arr4={"A","B","C"};
            assertEquals(-1,Ex1.maxIndex(arr4));
            String[]arr5={"A","BbG","CbG"};
            assertEquals(2,Ex1.maxIndex(arr5));



    }

    }
