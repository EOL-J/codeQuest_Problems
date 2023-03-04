package unfinished;
import java.util.Scanner;

public class anagram_checker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] str = input.nextLine().toUpperCase().split("\\|");
                String word1 = str[0];
                String word2 = str[1];
                boolean metCharacter;
                int countMetValues = 0;

                for (int firstLoop = 0; firstLoop < word1.length(); firstLoop++) {
                    metCharacter = false;
                    if (word1.equals(word2)) {
                        break;
                    }
                    for (int secondLoop = 0; secondLoop < word2.length(); secondLoop++) {
                        if (word1.substring(firstLoop, firstLoop + 1).equals(word2.substring(secondLoop, secondLoop + 1))) {
                            metCharacter = true;
                        }
                    }
                    if (metCharacter) {
                        countMetValues++;
                    }
                }

                if (countMetValues == word1.length()) {
                    System.out.println(word1 + "|" + word2 + " = ANAGRAM");
                } else {
                    System.out.println(word1 + "|" + word2 + " = NOT AN ANAGRAM");
                }
            }
        }
    }
}
