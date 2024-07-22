import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Animals>animals = new LinkedList<>();
        for (int i = 1; i < 51; i++) {
            Cat cat = new Cat("F"+i,i);
            Dog dog = new Dog("D"+i+10,i+1);
            animals.add(cat);
            animals.add(dog);
        }
        int countPlace = 5;
        for (int i = 0; i < animals.size(); i++) {
            animals.remove(countPlace);
        }
        int countDog = 0;
        for (int i = 1; i < animals.size()+1; i++) {
        for (Animals animal:animals){
            if (animal.equals(new Dog()) && countDog<3){
                countDog++;
            }
            else if (countDog >= 3) {
                countDog=0;
            }
            if (countDog==3){
                Mouse mouse = new Mouse("MO"+i,i);
                animals.add(mouse);
            }
        }
        }
        System.out.println(animals);
    }
}