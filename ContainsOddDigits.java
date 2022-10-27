/*
* Program that takes a positive integer and returns true if the decimal representation of that number contains
* NO odd digits. Otherwise returns false.
* */

public class Java {

    public static void main(String[] args) {
        System.out.println(containsOddDigits(2)); // returns false as is even digit
        System.out.println(containsOddDigits(1)); // returns true as is odd digit
        System.out.println(containsOddDigits(2468024)); // returns false as it contains even digit
        System.out.println(containsOddDigits(2468124)); // returns true as it contains odd digit

    }

    public static boolean containsOddDigits(int num) {
        String num_str = String.valueOf(num); // convert int to String

        /*
         * Iterating through the characters in the string, checking if they are an odd
         * digit, returning true if so
         */
        for (int i = 0; i < num_str.length(); i++) {
            char digit = num_str.charAt(i);
            if (digit == '1' || digit == '3' || digit == '5' || digit == '7' || digit == '9') {
                return true;
            }
        }
        /*
         * if statement is not completed, no odd digits are found, therefore return
         * false
         */
        return false;
    }
}
