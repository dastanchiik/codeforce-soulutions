import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 --> Создать Акулу\n2 --> создать Кита\n3 --> Посчитать Акулы\n4 --> Посчитать Китов");
        int a = sc.nextInt();
        Animal[] animals = new Animal[100];
        int countShark = 0;
        int countWhale = 0;
        for (int i = 0; true; i++) {
            if (a == 1){
                Shark shark = new Shark(sc.next(), sc.nextInt(), sc.nextInt());
                animals[i] = shark;
                System.out.println("1 --> Создать Акулу\n2 --> создать Кита\n3 --> Посчитать Акулы\n4 --> Посчитать Китов");
                a = sc.nextInt();
            } else if (a == 2) {

                Whale whale = new Whale(sc.next(), sc.nextInt(), sc.nextInt());
                animals[i] = whale;
                System.out.println("1 --> Создать Акулу\n2 --> создать Кита\n3 --> Посчитать Акулы\n4 --> Посчитать Китов");
                a = sc.nextInt();
            } else if (a == 3) {
                for (Animal animal:animals){
                    if (animal instanceof Shark){
                        countShark++;
                    }
                }
                System.out.println(countShark);
                countShark = 0;
                System.out.println("1 --> Создать Акулу\n2 --> создать Кита\n3 --> Посчитать Акулы\n4 --> Посчитать Китов");
                a = sc.nextInt();
            } else if (a == 4) {
                for (Animal animal:animals){
                    if (animal instanceof Whale){
                        countWhale++;
                    }
                }
                System.out.println(countWhale);
                countWhale = 0;
                System.out.println("1 --> Создать Акулу\n2 --> создать Кита\n3 --> Посчитать Акулы\n4 --> Посчитать Китов");
                a = sc.nextInt();
            }
        }

    }
}
