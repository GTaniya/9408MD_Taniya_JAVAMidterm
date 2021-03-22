package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String enterString = "mom";
        StringBuffer buffer = new StringBuffer(enterString);
        buffer.reverse();

        String data = buffer.toString();

        if (enterString.equals(data)){
            System.out.println("This String is Palindrome");
        }else{
            System.out.println("This String is not Palindrome");
        }

    }
}
