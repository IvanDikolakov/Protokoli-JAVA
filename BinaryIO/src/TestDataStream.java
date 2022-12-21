import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
    public static void main(String[] args) {
        try {
            try (
                    DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
            ) {
                output.writeDouble(85.5);
                output.writeDouble(185.5);
                output.writeDouble(105.25);
            }
            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            ) {
                while (true) {
                    System.out.println(input.readDouble());
                }
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
