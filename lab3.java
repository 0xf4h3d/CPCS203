import java.io.*;
import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        File inputFile = new File("file1.txt");
        File outputFile = new File("file2.txt");

        if (!inputFile.exists()) {
            System.out.println("Input file does not exist. Program will exit.");
            return;
        }

        try {
            Scanner input = new Scanner(inputFile);
            PrintWriter output = new PrintWriter(outputFile);

            while (input.hasNext()) {
                String word = input.next();
                if (word.matches("\\d+")) {
                    output.println(word);
                }
            }

            input.close();
            output.close();

            Scanner file2Input = new Scanner(outputFile);
            while (file2Input.hasNextLine()) {
                String line = file2Input.nextLine();
                try {
                    int num = Integer.parseInt(line);
                    if (isPrime(num)) {
                        System.out.print(num + " ");
                    }
                } catch (NumberFormatException e) {
                }
            }

            file2Input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
