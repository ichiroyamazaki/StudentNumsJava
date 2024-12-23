package StudentNums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class StudentNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first word: ");
            String word1 = input.nextLine();

            System.out.print("Enter the second word: ");
            String word2 = input.nextLine();

            if (word1.length() < 2) {
                System.out.println("The first word must be at least 2 characters long!");
                continue;
            }

            String sub = word1.substring(word1.length() - 2); // Get the last 2 characters of word1
            String patternString = "[a-zA-Z]*" + sub; // Regex pattern for rhyming
            Pattern pattern = Pattern.compile(patternString);

            Matcher matcher = pattern.matcher(word2);

            if (matcher.matches()) {
                System.out.println(word2 + " rhymes with " + word1);
                break;
            } else {
                System.out.println("I'm not sure! Sorry!");
            }
        }

        input.close();
    }
}
