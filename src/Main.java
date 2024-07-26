import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        MyFunction function = new MyFunction() {
            @Override
            public void calculate(int a, int b) {
                int sum = a +b;
                System.out.println(sum);
            }
        };
        function.calculate(10,10);
        MyFunction function1 = (a,b) -> System.out.println(a+b);
        function1.calculate(10,10);
    }
    public static <T> void method(T a){
        System.out.println(a);
    }
}