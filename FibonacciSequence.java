/*
* Program that calculates the sum of all the first 100 even numbers in the Fibonacci Sequence.
* The Fibonacci Sequence is a sequence of numbers starting with 0 and 1 where each following number
* is the sum of the 2 previous e.g. 0,1,1,2,3,5,8...
* */

import java.math.BigInteger;

public class Java {

    public static void main(String[] args) {
        BigInteger[] fibonacci = new BigInteger[300]; // Array of BigIntegers for storing first 300 fibonacci numbers
        BigInteger[] evenNumbers = new BigInteger[100]; // Array of BigIntegers for storing first 100 even fibonacci
                                                        // numbers
        BigInteger result = BigInteger.ZERO; // BigInteger for storing the sum of first 100 even fibonacci numbers
        int index = 0; // for indexing 100 even fibonacci numbers

        fibonacci[0] = BigInteger.ONE; // first number in sequence must be one
        fibonacci[1] = BigInteger.ONE; // second number in sequence must be one

        // Starting at index 2 (or 3rd number in sequence), calculate what the other
        // numbers will be
        // If this number is even, add it to the evenNumbers array
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
            if (fibonacci[i].mod(BigInteger.TWO) == BigInteger.ZERO) {
                evenNumbers[index] = fibonacci[i];
                index++;
            }
        }

        // Print out the array of BigIntegers that show the first 100 even fibonacci
        // numbers
        System.out.println("EVEN NUMBERS");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(i + 1 + ":  " + evenNumbers[i]);
        }

        // Calculate the sum of all the even fibonacci numbers
        for (int i = 0; i < evenNumbers.length; i++) {
            result = result.add(evenNumbers[i]);
        }

        // Printing out result
        System.out.println("\nSUM OF EVEN NUMBERS: " + result);
    }
}
