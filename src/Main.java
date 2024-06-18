import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = k/n;
        int apple = k%n;
        int p = 0;
        int sum = k-(a*n);
        System.out.println(a);
        System.out.println(sum);
        if (apple == 0){
            p = 0;
        }else {
            p = n - apple;
        }
        System.out.println(p);
    }
}