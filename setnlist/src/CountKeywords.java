import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountKeywords {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Java source file: ");

        String filename = input.nextLine();

        System.out.println(String.format("The selected file is %s", filename));

        File file = new File(filename);

        try {
            InputStream inputs = new FileInputStream(String.format("src/%s", file));

            System.out.println("The number of keywords in " + filename + " is " + countKeywords(inputs));

        } catch (Exception e) {
            throw new FileNotFoundException(String.format("The file %s is not found!", filename));
        }
    }

    private static int countKeywords(InputStream in) {
        String[] keywordString = {"hello", "salad", "hugs", "tree", "friend"};
        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));

        int count = 0;

        Scanner input = new Scanner(in);
        while (input.hasNext()) {
            String word = input.next();
            if (keywordSet.contains(word))
                count++;
        }
        return count;
    }
}
