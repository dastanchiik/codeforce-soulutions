import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        if (a % 2 == 1 && c % 2 == 1 && b % 2 == 0 && e % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
