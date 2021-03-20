package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */


        public static void main(String[] args) {
            String str1="Cat";
            String str2="Act";

            str1= str1.toLowerCase();
            str2=str2.toLowerCase();

            if (str1.length()==str2.length()){

                char[] charArray1= str1.toCharArray();
                char[] charArray2= str2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);
                boolean result=Arrays.equals(charArray1,charArray2);

                if (result){
                    System.out.println(str1+" and "+str2+ " are anagrams.");
                }
                else {
                    System.out.println(str1+" and "+str2+" :are not anagrams.");
                }
            }

    }
}
