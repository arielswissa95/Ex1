/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */

import javax.management.StringValueExp;
import java.util.Arrays;

public class Ex1 {
    static String numb;
  /**
     * function that accepts a string that defines the base (2-9 OR A-G) and returns the base in an INTEGER,
     * i.e: for string "1" the function returns 1 (int) for string "A" the function returns 10 (int). if the base in invalid return -1 (int)
     * @param a
     * @return int representation of a string.
     */
    public static int WhatTheBase(String a){
        char c=a.charAt(0);

        char [] arr = {'2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};

        for(int i = 0 ; i < arr.length ; i++){
            if(c==arr[i])
                return i + 2;
        }
        return  -1;
    }
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
        public static int number2Int(String num) {
            int ans = -1;
            numb=num;
            if(!isNumber(num)) // Checks if it is in a valid format
                return ans;
            num=numb;//If "numb" was updated in "isNumber" then I update "num"
            String [] arr=num.split("b");//Builds an array that divides the String by "b"
            int base;

             base= WhatTheBase(arr[1]); //"base" gets the base in INT
           ans= Integer.parseInt(arr[0],base); //"ans" gets "num" in base 10 by using the Integer.parseInt() function.

            return ans;
        }




    /**
     *
     * @param a is char that I want to check if is exists in the arr array
     * @param arr is char array
     * @return True if 'a' exists in arr and False otherwise
     */
        public static boolean isExist(char a,char[] arr){
            boolean b=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==a)
                    return true;
            }
            return b;
        }


    /**
     *
     * @param c is the char that I want to find his index
     * @param arr is char array that I check what the index of 'c' in arr
     * @return the index of 'a' in arr if is not exist return -1 .
     */
        public static int index(char c,char[]arr){
            int r=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==c)
                    return i;
            }
            return r;
        }


        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;

            if(a==null)
                return false;
            else if (a=="") {
                return false;
            }
            if (!a.contains(String.valueOf('b'))) {//Checks if "b" exists in String "a".
                a=a+"bA";

                //Changes the value and adds "b"+ Base("A") to it to perform functions on it.
                numb=a;

            }

            char [] arr1=a.toCharArray();// Converts a String "a" to an array of Char
            String [] arr=a.split("b");//Builds an array that divides the String by "b"
            if(a.equals("b")){ //Checks if "b" exists in "a"
                return false;
            }

             if (arr[0]=="") {
                return false;
            }
            else if (arr.length!=2 ) { //Checks if a base exists
                return false;
            }
            else if (Arrays.asList(arr1).contains(" ")) { //Checks if there is a space in the input.
                return false;
            }
            else if (arr[0]==arr[1]) {
                return false;
            }
            else if (arr[1].length()!=1) {
                return false;

             }




            char[] existForValue={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};
            char[] existForBase={'2','3','4','5','6','7','8','9','A','B','C','D','E','F','G'};

            // Checks if all existing indexes are numbers and letters allowed to be used according to the format

            for (int i=0;i<arr[0].length();i++){
               char c=arr[0].charAt(i);

               if (!isExist(c,existForValue))//Checks if "c" exists in the "existForValue".
                   return false;
            }

            for (int i=0;i<arr[1].length();i++){
                char c=arr[1].charAt(i);

                if (!isExist(c,existForBase))//Checks if "c" exists in the "existForBase".
                    return false;
            }

            //לבדוק אם אפשר למחוק
            //char [] valurChar=arr[0].toCharArray();
            char base=arr[1].charAt(0);// Assuming that there is only one element in the base
            //if(isExist(base,valurChar)) // בודק אם קיים הבסיס בערך
              //  return false;

            int baseIndex=index(base,existForValue);// Returns the index of the base
            int valueIndex;
            for(int i=0;i<arr[0].length();i++){
                valueIndex=index(arr[0].charAt(i),existForValue);// Returns the index of the value
                if(valueIndex>=baseIndex) //Checks if a value (arr[0]) has a value greater than or equal to the base
                    return false;
            }
            return ans;
        }


    /**
     *
     * @param a is base in Int
     * @return A-G if a>9 else return a
     */
        public static String int2StringBase(int a){
        if(a==10)
            return "A";
        else if (a==11) {
            return "B";

        } else if (a==12) {
            return "C";
        } else if (a==13) {
            return "D";

        } else if (a==14) {
            return "E";
        } else if (a==15) {
            return "F";
        }
        else if(a==16){
            return "G";
        }
        return String.valueOf(a);
        }

        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = "";
            if(num<0|| base<2||base>16)// Checks if it is in format
                return ans;

            //Converts "num" in base 10 to "base" and if there are letters it converts them to uppercase
           String a= Integer.toString(num, base).toUpperCase() ;

           ans=a+"b"+int2StringBase(base); //Chain "b" and the base in the desired form

            return ans;
        }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        int index=-1;
        // add your code here
        for(int i=0;i<arr.length;i++){

            if(isNumber(arr[i])){ //
                if(ans<number2Int(arr[i])){ // find the maximum in "arr"
                    ans=number2Int(arr[i]);// Updating the value of the maximum
                    index=i; //Updating the index of the maximum
                }
            }

        }

        return index;
    }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            int a=number2Int(n1);
            int b=number2Int(n2);
            if(a==-1 ||b==-1)//Checks if the values are in the format
                ans= false;

            else if(a!=b)
                ans= false;


            return ans;
        }


}
