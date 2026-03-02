public class IterativeFactorial extends Factorial {

    @Override
    public long calculate(int n) {
       
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}