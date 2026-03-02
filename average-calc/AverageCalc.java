public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step == 0) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        if (step < 0) {
            for (int i = start; i >= end; i += step) {
                sum += i;
                count++;
            }
        } else {

            for (int i = start; i <= end; i += step) {
                sum += i;
                count++;
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        System.out.println(AverageCalc.average(10, 1, -2));
    }
}