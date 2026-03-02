import java.io.IOException;
import java.util.Arrays;

public class SortArray {
    public static Integer[] sort(Integer[] args) {
        // your code here
        Arrays.sort(args);
        return args;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(SortArray.sort(new Integer[] { 4, 2, 1, 3 })));
    }
}