import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Person>people = new ArrayList<>();
        System.out.println("1 --> Create new Person\n2 --> find person by id\n3 --> get All people\n4 --> delete all people");
        int a = sc.nextInt();
        int id = 0;
        while (true){
            if (a==1){
                id++;
                System.out.print("Enter name:");
                String name = sc.next();
                System.out.print("Enter age:");
                int age = sc.nextInt();
                Person person = new Person(id,name,age);
                people.add(person);
                System.out.println("1 --> Create new Person\n2 --> find person by id\n3 --> get All people\n4 --> delete all people");
                a = sc.nextInt();
            } else if (a == 2) {
                int b = sc.nextInt();
                for (Person person:people){
                    if (person.getId() == b){
                        System.out.println(person);
                    }
                }
                System.out.println("1 --> Create new Person\n2 --> find person by id\n3 --> get All people\n4 --> delete all people");
                a = sc.nextInt();
            } else if (a == 3) {
                for (Person person:people){
                    System.out.println(person);
                }
                System.out.println("1 --> Create new Person\n2 --> find person by id\n3 --> get All people\n4 --> delete all people");
                a = sc.nextInt();
            } else if (a == 4) {
                people.clear();
                System.out.println("data is successfully cleared!!!\n\n\n");
                System.out.println("1 --> Create new Person\n2 --> find person by id\n3 --> get All people\n4 --> delete all people");
                a = sc.nextInt();
            }
        }
    }
}