import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(process(ints)));
    }

    public static int[] process(int[] arr) {
        if (arr.length < 3) return new int[0];
        int upperBound = Math.min(arr.length, 7);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        return Arrays.copyOfRange(arr, 2, upperBound);
    }
}
