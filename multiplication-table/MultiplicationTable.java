public class MultiplicationTable {
    public static void generate(int num) {
        // your code here
        System.out.println(String.format("%d x 1 = %d", num, num));
        System.out.println(String.format("%d x 2 = %d", num, num * 2));
        System.out.println(String.format("%d x 3 = %d", num, num * 3));
        System.out.println(String.format("%d x 4 = %d", num, num * 4));
        System.out.println(String.format("%d x 5 = %d", num, num * 5));
        System.out.println(String.format("%d x 6 = %d", num, num * 6));
        System.out.println(String.format("%d x 7 = %d", num, num * 7));
        System.out.println(String.format("%d x 8 = %d", num, num * 8));
        System.out.println(String.format("%d x 9 = %d", num, num * 9));
        System.out.println(String.format("%d x 10 = %d", num, num * 10));
    }

    public static void main(String[] args) {
        MultiplicationTable.generate(5);
    }
}