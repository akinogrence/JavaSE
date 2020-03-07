import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {

    public static void main(String[] args) {

        File file = new File("test.txt");



        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not Fount" + file.toString());
        }

        System.out.println("Finished");
    }
}
