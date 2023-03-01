import java.util.Arrays;

public class practice31 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maxValue(arr));
    }
    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n)
            if (each > max)
                max = each;
        return max;

    }
    // public static int maxValue(int[] n) {

}


