package string.problems;

public class Permutation {



        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */

        static void printPermutations(String str, String ans){

            if (str.length() == 0){
                System.out.println(ans + "");
                return;
            }

            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                String restOfString = str.substring(0,i) + str.substring(i + 1);

                printPermutations(restOfString, ans + ch);
            }
        }

    public static void main(String[] args) {
        String s = "ABC";
        printPermutations(s, "");
    }
    }

