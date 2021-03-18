package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//
//        int number = scanner.nextInt();
//        int factorialOfNumber = factorial(number);
//        System.out.println("Factorial of this number is " + factorialOfNumber);
//    }
//    static int factorial(int n){
//        int outputResult;
//        if(n==1){
//            return 1;
//        }
//        outputResult = factorial(n-1) * n;
//        return outputResult;
//    }


    //
    public static long factorial(int f){
        long facNum = 1;

        for (int i = 1; i <= f; i++){
            facNum = facNum * i;
        }
        return facNum;
    }

    public static void main(String[] args) {
        int f = 5;
        System.out.println("Factorial of " +f+ " is " + factorial(f));
    }
}
