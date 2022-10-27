/*
* Program that will take in 2 sorted arrays of integers are return an array of numbers that appear in both
* with no value appearing in the final array more than once
* */

import java.util.HashSet;
import java.util.Set;

public class Java {

    public static void main(String[] args) {
        // creating sorted arrays for testing purposed
        int[] array1 = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int[] array2 = { 0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10 };

        // Running the function and returning an array that is iterated through and
        // displayed for confirmation that the function works
        Integer[] answer = removeDuplicates(array1, array2);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    // The Function In Question:
    public static Integer[] removeDuplicates(int[] array1, int[] array2) {

        // Initalising and populating HashSets from the 2 inputted arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            set2.add(array2[i]);
        }

        /*
         * Choosing the smallest of the 2 sets to complete a retainAll function on as
         * they are sorted arrays (no point in iterating through the largest set as it
         * holds more values that won't be in the smallest set).
         * 
         * Creating and returning a new Integer array based on this that contains numbers shared by
         * each set. Returning null for other exceptions I.e. empty arrays
         */
        if (set1.size() <= set2.size()) {
            set1.retainAll(set2);
            Integer[] commonNumbers = set1.toArray(new Integer[0]);
            return commonNumbers;
        }
        if (set2.size() <= set1.size()) {
            set2.retainAll(set1);
            Integer[] commonNumbers = set2.toArray(new Integer[0]);
            return commonNumbers;
        }
        return null;
    }

}