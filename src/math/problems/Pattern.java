package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:

        100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...

        */

        printPattern();

    }

    public static void printPattern(){
        int num = 100;

        System.out.print(num);

        for (int i = 0; i < 4; i++){

            for (int n = 0; n < 10; n++){

                num -= 1+i;
                System.out.print("," + num);
            }
        }
    }
}
