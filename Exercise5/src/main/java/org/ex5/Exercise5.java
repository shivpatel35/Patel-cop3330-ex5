package org.ex5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        //scanner declaration for integers
        Scanner firstNum = new Scanner(System.in);
        Scanner secondNum = new Scanner(System.in);

        //intialize integer variables for calculations and user input
        int fnum = 0;
        int snum = 0;
        int sum = 0;
        int dif = 0;
        int product = 0;
        int quotient = 0;

        //print statements ask for user input and store first and second number
        System.out.println("What is the first number?");
        fnum = firstNum.nextInt();
        System.out.println("What is the second number?");
        snum = secondNum.nextInt();

        //Calculations
        sum = fnum + snum;
        dif = fnum - snum;
        product = fnum * snum;
        quotient = fnum/snum;

        //Print statements for all calculations
        System.out.println(""+ fnum + " + " + snum + " = " + sum);
        System.out.println(""+ fnum + " - " + snum + " = " + dif);
        System.out.println(""+ fnum + " * " + snum + " = " + product);
        System.out.println(""+ fnum + " / " + snum + " = " + quotient);

    }
}
