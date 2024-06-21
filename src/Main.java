import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mod1 = a%10;
        int mod2 = (a/10)%10;
        int mod3 = (a/100)%10;
        int mod4 = (a/1000)%10;
        if (mod1 == mod4 && mod2 == mod3){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
