import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] str = new String[a+1];
        for (int i = 0; i <= a; i++) {
            str[i] = scanner.nextLine();
        }
        for (String s:str){
            if (s.length()>=11){
            int length = s.length()-2;
            String first = s.substring(0,1);
            String last = s.substring(length+1);
            String finish = first+length+last;
            System.out.println(finish);
            }else {
                System.out.println(s);
            }
        }
    }
}