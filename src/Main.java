import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = 3;
        int y = 5;
        int z = 12;
        long sum = 0;
        sum += (long) a * x;
        sum += (long) b * y;
        sum += (long) c * z;
        System.out.println(sum);
    }
}
