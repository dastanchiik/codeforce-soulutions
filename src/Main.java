import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        OptionalInt max = Arrays.stream(array).max();
        OptionalInt min = Arrays.stream(array).min();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max.getAsInt()) {
                array[i] = min.getAsInt();
            }
        }
        for (int r:array){
            System.out.print(r+" ");
        }
    }
}