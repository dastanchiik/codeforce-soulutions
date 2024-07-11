import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
    try {
        FileWriter fileWriter = new FileWriter("text.txt");
        FileReader file = new FileReader("text.txt");
    }catch (FileNotFoundException e){
        System.out.println(e.getMessage());
    } finally {
        System.out.println("done");
    }
    }
}
