package uz.pdp;

public class ExampleFactorial {
    public static void main(String[] args) {
        System.out.println(calFactorial1(5));
        System.out.println(calFactorialWithRec(5));

    }

    public static long calFactorial1(int number) {
        long res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }


    public static long calFactorialWithRec(int number) {
            if (number < 2) {
                return 1;
            }
            return (number * calFactorialWithRec(number - 1));
    }
}
