package TextFileReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

    public static void main(String[] args) {
        String fileLocalString = "./TextFileReader/source.txt";
        System.out.println(System.getProperty("user.dir"));
        //(BufferedReader reader = new BufferedReader(new FileReader(fileLocalString))) 
        try (BufferedReader reader = new BufferedReader(new FileReader("./TextFileReader/source.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occurred during reading the file");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
