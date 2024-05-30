import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        int num = scanner.nextInt();
        for (int q:array){
            if (q == num){
                count++;
            }
        }
        System.out.println(count);
    }
}