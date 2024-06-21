import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int first = a/1000;
        int second = a%1000;
        int ff = first%10;
        int fs = (first/10)%10;
        int ft = (first/100)%10;
        int sf =  second%10;
        int ss = (second/10)%10;
        int st = (second/100)%10;
        int sum1 = ff+fs+ft;
        int sum2 = sf+ss+st;
        if (sum1==sum2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
