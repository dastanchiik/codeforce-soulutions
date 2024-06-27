import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        while (true) {
            if (a + b == c) {
                System.out.println("YES");
                break;
            } else if (a + b != c) {
                int temp = c;
                c = b;
                b = temp;
                count++;
                if (count == 3){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}