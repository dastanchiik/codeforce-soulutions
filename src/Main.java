import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            count1 += a;
            count2 += b;
        }
        if (count1 > count2){
            System.out.println(1);
        } else if (count2 == count1) {
            System.out.println("DRAW");
        }else {
            System.out.println(2);
        }
    }
}
