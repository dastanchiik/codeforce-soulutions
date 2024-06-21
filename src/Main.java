import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        method(a);
    }
    public static void method(int a){
        if (a <= 1) {
            System.out.println(0);
            return;
        }
            if (a % 2 == 0) {
                System.out.println(a / 2);

            } else if (a % 2 == 1) {
                System.out.println(a);
            }
    }
}
