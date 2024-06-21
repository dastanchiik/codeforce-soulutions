import java.util.Objects;

public class Shark extends Animal{
    private int speed;

    public Shark(String name, int age) {
        super(name, age);
    }

    public Shark(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Shark{" +
                super.toString()+
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shark shark = (Shark) o;
        return speed == shark.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
