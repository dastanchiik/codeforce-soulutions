import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Person> personMap = new HashMap<>();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            Integer st = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            String str1 = scanner.nextLine();
            Person person = new Person(str, str1);
            personMap.put(st, person);
        }
        for (int i = 0; i < b; i++) {
            Integer num = scanner.nextInt();
            System.out.println(personMap.get(num));
        }
    }
}

class Person {
    private String fio;
    private String address;

    public Person(String fio, String address) {
        this.fio = fio;
        this.address = address;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return fio + " " + '(' + address + ')';
    }
}
