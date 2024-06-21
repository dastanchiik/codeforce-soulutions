public class Whale extends Animal{
    private int weight;

    public Whale(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Whale{" +
                super.toString()+
                "weight=" + weight +
                '}';
    }
}
