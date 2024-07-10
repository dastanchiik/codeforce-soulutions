import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Example.txt");
        writer.write(" Salem!!! ");
        writer.write(" Dostor ");
        writer.close();
        FileReader reader = new FileReader("Example.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.contains("Salem")){
            System.out.println(line.substring(line.length()/2));
            }
        }
        reader.close();
    }
}
