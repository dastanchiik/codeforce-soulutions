import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max1 = Math.max(a,b);
        int max2 = Math.max(c,max1);
        if (a < 94 || b < 94 || c < 94 ){
            System.out.println("Error");
        } else if (a > 727 || b > 727 || c > 727) {
            System.out.println("Error");
        }else {
            System.out.println(max2);
        }
    }
}