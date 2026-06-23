package TextFileReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

    public static void main(String[] args) {
        String fileLocalString = "Source.txt";
        System.out.println(System.getProperty("user.dir"));
        //(BufferedReader reader = new BufferedReader(new FileReader(fileLocalString))) 
        try {
            FileReader fr = new FileReader(fileLocalString);
            BufferedReader reader = new BufferedReader(fr); 
            String lines;
            while ((lines = reader.readLine()) != null) {
                System.out.println(lines);
                
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occurred during reading the file");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
