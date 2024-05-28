import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isValid(char[] walk) {
        int countN = 0;
        int countS = 0;
        int countW = 0;
        int countE = 0;
        for (char a: walk){
            if (a == 'n'){
                countN++;
            } else if (a == 's') {
                countS++;
            } else if (a == 'w') {
                countW++;
            } else if (a == 'e') {
                countE++;
            }
        }
        return walk.length == 10 && countN == countS && countE == countW;
    }
}