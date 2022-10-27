/*
* Program that, when passed a decimal X, returns the value of X + XX + XXX + XXXX
* e.g. if X = 3 then the returned value should be 3 + 33 + 333 + 3333 = 3702
* */

public class Java {

    public static void main(String[] args) {
        System.out.println(sum(5.0)); // If num is 5, answer should be 6170 (5 + 55 + 555 + 5555)
        System.out.println(sum(3)); // If num is 3, answer should be 3702 (3 + 33 + 333 + 3333)

    }

    public static double sum(double num) {
        /*
         * If num is X and we are to return the value of X + XX + XXX + XXXX, that is
         * the equivalent of mulitplying num by 1, 11, 111 and 1111 respectively
         */
        return num + (num * 11) + (num * 111) + (num * 1111);
    }
}
