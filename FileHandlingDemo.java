import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Name: Jesan\n");
            writer.write("Roll No: 101\n");
            writer.write("Mark: 95.5\n");
            writer.close();

            System.out.println("Data written successfully.");

            // Reading from the file
            FileReader reader = new FileReader("student.txt");
            int ch;

            System.out.println("\nContents of the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}