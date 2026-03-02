public class Factorial {
    public static Integer factorial(Integer n) {
        // your code here
        Integer num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(3));
    }
}