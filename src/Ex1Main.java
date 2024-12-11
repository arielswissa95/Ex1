/* */
import java.util.Arrays;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {

        //לתקן

        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            int v,u;
            if (!num1.equals("quit")) {
                // add your code here
                 v=Ex1.number2Int(num1);
                if(!Ex1.isNumber(num1)){
                    System.out.println("num1= "+num1+" is number: False , value: "+v);
                    System.out.println("ERR: num1 is in the wrong format! ("+num1+")");
                    continue;// מדלג על שאר  קוד

                }

                else {
                System.out.println("num1= "+num1+" is number: True , value: "+v);
                }
            }
            else {
                continue;
            }

            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2=sc.next();
            if (!num2.equals("quit")) {
                // add your code here
                 u=Ex1.number2Int(num2);
                if(!Ex1.isNumber(num2)){
                    System.out.println("num2= "+num2+" is number: False , value: "+u);
                    System.out.println("ERR: num2 is in the wrong format! ("+num2+")");
                    continue;
                }

                else {
                    System.out.println("num2= "+num2+" is number: True , value: "+u);
                }

            }
            else {
                continue;
            }
            System.out.println("Enter a base for output: (a number [2,16]");
            String base=sc.next();

          //  int integetBase=Ex1.WhatTheBase(base);
            //לבדוק אם אפשר לקבל בסיס אות
            //if(integetBase>9)
              //  base=String.valueOf(integetBase) ;

            //integetBase!=-1 &&
            int baseInt=Integer.parseInt(base);
            if( baseInt<17 && baseInt>1){ // בודק אם הבסיס תקין
                int numBase1=Ex1.number2Int(num1);//NUM1 בבסיס10
                int numBase2=Ex1.number2Int(num2);//NUM2 בבסיס 10
                int sum = numBase2 + numBase1;//חיבור
                int Multiplication = numBase2*numBase1;//כפל

                String sumBase;
                String multiplicationBase;

                if (baseInt != 10) {
                     sumBase= Ex1.int2Number(sum,baseInt);
                     multiplicationBase=Ex1.int2Number(Multiplication,baseInt);

                }
                else {
                    sumBase =String.valueOf(sum) ;
                    multiplicationBase=String.valueOf(Multiplication) ;
                }
                String[]arr1={num1,num2,sumBase ,multiplicationBase};
                int max=Ex1.maxIndex(arr1);

              //  if()

                System.out.println(num1+" + "+num2 +" = "+sumBase );
                System.out.println(num1+" * "+num2 +" = "+multiplicationBase );
                System.out.println("Max number over "+Arrays.toString(arr1)+" is: "+arr1[max] );


            }
            else{
                System.out.println("ERR: wrong base, should be [2,16], got ("+base+")");


            }








        }
        System.out.println("quiting now...");
    }
}
