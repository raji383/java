import java.io.*;
import java.util.Arrays;

public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        // your code here
        Integer[] res = new Integer[arr.length];
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < rotationCount) {
                end = arr.length - 1 - i;
                res[i] = arr[arr.length - 1 - i];
            }
        }
        for (int i = rotationCount; i <= end; i++) {
            res[i] = arr[i - rotationCount];
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(RotateArray.rotate(new Integer[] { 4, 2, 1, 3 }, 1)));
    }
}