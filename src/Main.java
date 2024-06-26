import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int sum1 = e - b;
        if (b == 2 && a == c && sum1 == 2 && e>b) {
            System.out.println("YES");
        } else if (b > 2 && sum1 == 1 && a == c && e > b) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
