import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringSearch {

    public static void search(String pattern, String fileName) throws FileNotFoundException {
        try {
            File file = new File(fileName + ".txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                if (line.toLowerCase().indexOf(pattern.toLowerCase()) != -1) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file found...");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner word = new Scanner(System.in);

        System.out.println("Enter file: ");
        String fileName = word.nextLine();

        System.out.println("Enter searchword: ");
        String searchword = word.nextLine();

        search(searchword, fileName);

    }

}