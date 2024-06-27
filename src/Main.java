import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int placeFirst = 0;
        int placeSecond = 0;
        if (a % 2 == 1 && b % 2 == 1) {
            placeFirst = 2;
        } else if (a % 2 == 0 && b % 2 == 0) {
            placeFirst = 2;
        } else if ((a % 2 == 0 && b % 2 == 1) || (a % 2 == 1 && b % 2 == 0)) {
            placeFirst = 1;
        }
        if (c % 2 == 1 && e % 2 == 1) {
            placeSecond = 2;
        } else if (c % 2 == 0 && e % 2 == 0) {
            placeSecond = 2;
        } else if ((c % 2 == 0 && e % 2 == 1) || (c % 2 == 1 && e % 2 == 0)) {
            placeSecond = 1;
        }

        if (placeFirst == placeSecond){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
