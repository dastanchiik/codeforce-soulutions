import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i = 0; i < a; i++) {
            String numbers = scanner.nextLine();
            int num = Integer.parseInt(numbers.replace(" ", ""));
            int b = (num / 100) % 10;
            int c = (num / 10) % 10;
            int d = num % 10;
            int sum = b + c + d;
            if (sum >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}