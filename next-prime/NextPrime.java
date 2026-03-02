public class NextPrime {
    public static boolean is(Integer n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer nextPrime(Integer n) {
        // your code here
        Integer num = n + 1;
        while (!is(num)) {
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(3));
    }
}