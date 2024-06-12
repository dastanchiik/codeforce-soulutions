import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int f = sc.nextInt();
        int[] arr1 = new int[c];
        int[] arr2 = new int[f];
        for (int i = 0; i < c; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < f; i++) {
            arr2[i] = sc.nextInt();
        }
        method(arr1,arr2);
    }

    public static void method(int[] arr1, int[] arr2) {
        int l = 0;
        int r = 0;
        int index = arr1.length + arr2.length;
        int[] ans = new int[index];
        while (l < arr1.length || r < arr2.length) {
            if (r == arr2.length || l < arr1.length && arr1[l] < arr2[r]) {
                ans[l + r] = arr1[l];
                l++;
            } else {
                ans[l + r] = arr2[r];
                r++;
            }
        }
        for (int e:ans){
            System.out.print(e+" ");
        }
    }
}