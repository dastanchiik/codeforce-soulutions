import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        final int length = 109;
        int distanceTraveled = v * t;
        int finalPosition = (distanceTraveled % length + length) % length + 1;
        System.out.println(finalPosition);
    }
}
