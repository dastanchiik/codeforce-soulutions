import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            Random random = new Random();
            int r = random.nextInt(10,100);
            int lowerBound;
            int upperBound;
            if (firstNumber < secondNumber) {
                lowerBound = firstNumber;
                upperBound = secondNumber;
            } else {
                lowerBound = secondNumber;
                upperBound = firstNumber;
            }
            int randomNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            System.out.println("Случайное число: " + randomNumber);
            scanner.close();
        }
    }