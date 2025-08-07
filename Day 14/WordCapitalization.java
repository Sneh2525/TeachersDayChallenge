import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String word = scn.nextLine().trim();

            if (word.length() > 0) {
                String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                System.out.println(capitalizedWord);
            } else {
                System.out.println(word);
            }
        }
    }
}