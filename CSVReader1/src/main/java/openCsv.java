import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class openCsv {

    public static void main(String[] args) {

        String csvFileName = "src/main/resources/Persons.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] fields = line.split(csvSplitBy);

                Person person = new Person(fields[0], Integer.parseInt(fields[1]), fields[2]);

                System.out.println(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}