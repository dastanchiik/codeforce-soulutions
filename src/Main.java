import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            String number = scanner.next();
            int countLine = 0;
            for (int j = 0; j < number.length(); j++) {
                char[] c = number.toCharArray();
                for (char q : c) {
                    if (q == '1') {
                        countLine++;
                    }
                    if (countLine > 3){
                        countLine = 0;
                    }
                }
            }
            if (countLine >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}