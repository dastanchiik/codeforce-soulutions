import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.println(maxIndex);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
