import java.io.*;
import java.util.Arrays;

public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        // your code here
        Integer[] res = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - 1 - i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(ReverseArray.reverse(new Integer[] { 4, 2, 1, 3 })));
    }
}