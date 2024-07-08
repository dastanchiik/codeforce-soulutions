import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        int[] arr = new int[a + 1];
        for (int i = 0; i <= a; i++) {
            arr[i] = i;
        }
        for (int w : arr) {
            count += w;
        }
        System.out.println(count);
    }
}
