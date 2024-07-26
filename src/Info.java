public class Info <T,U>{
    private T name;
    private U age;

    public Info(T name) {
        this.name = name;
    }

    public Info() {
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name=" + name +
                '}';
    }
}
