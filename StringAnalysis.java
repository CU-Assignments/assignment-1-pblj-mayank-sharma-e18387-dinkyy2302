import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            } else if (Character.isDigit(ch)) digits++;
            else if (!Character.isWhitespace(ch)) specialChars++;
        }

        System.out.println("Vowels: " + vowels +
                           " Consonants: " + consonants +
                           " Digits: " + digits +
                           " Special Characters: " + specialChars);
        scanner.close();
    }
}
