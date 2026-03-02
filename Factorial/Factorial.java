public abstract class Factorial {

    public abstract long calculate(int n);

    public static Integer factorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return Integer.valueOf(result);
    }
}