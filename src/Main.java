import java.util.Scanner;

public class Main {
    private static int[] a = new int[0];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        a = new int[c];
        for (int i = 0; i < c; i++) {
            a[i] = sc.nextInt();
        }
    }
    public static void method(int l,int r){
        if (l<r){
            int x = a[(l+r)/2];
            int i = l;
            int j = r;
            while (i <= j){
                while (a[i]<x){
                    i++;
                }
                while (a[j]> x){
                    j--;
                }
            }
            i++;
            j++;
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        method(l,r);
        method(l,r);
    }
}