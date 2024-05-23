import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(upAndLow(scanner.next()));
    }
    public static String upAndLow(String word){
        int length = word.length()/2;
        String first = word.substring(0,length);
        String second = word.substring(length);
        String up = first.toUpperCase();
        String low = second.toLowerCase();
        String sum = up+low;


        System.out.println();
        return sum;
    }
}