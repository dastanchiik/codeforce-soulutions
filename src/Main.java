import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int max = Math.max(a, c);
        int max1 = Math.max(b, e);
        int min = Math.min(a, c);
        int min1 = Math.min(b, e);
        if (max - min <= 2 && max1 - min1 == 2) {
            System.out.println("YES");
        } else if (max - min == 2 && max1 - min1 <= 2) {
            System.out.println("YES");
    } else System.out.println("NO");
    }
}
