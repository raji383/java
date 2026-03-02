public class CountChar {
    public static int count(String s, char c) {
        // your code here
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(CountChar.count("Hello World !", ' '));
    }
}