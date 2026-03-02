public class Digitlen {
    public static int digitlen(long number) {
        // your code here
        int i = String.valueOf(Math.abs(number)).length();
        return i;
    }

    public static void main(String[] args) {
        System.out.println(Digitlen.digitlen(-998989888));
    }
}