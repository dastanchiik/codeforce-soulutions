import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long s = sc.nextLong();
        long res = a + 1;
        long[] arr = new long[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long x = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            while (x >= s) {
                if (x >= s) {
                    res = Math.min(res, i - l + 1);
                }
                x -= arr[l];
                l++;
            }
        }
        if (res == a + 1) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}