package unfinished;
import java.util.Scanner;

public class autocorrect {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine())
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] line = input.nextLine().split(" ");
                int wordDictionary = Integer.parseInt(line(0));
                String[] dictionary = new String[wordDictionary];
                for (int index = 0; index < wordDictionary; index++) {
                    dictionary[index] = input.nextLine();
                }
                int numMispelled = Integer.parseInt(line(1));
                String[] mispelled = new String[numMispelled];
                for (int index = 0; index < numMispelled; index++) {
                    mispelled[index] = input.nextLine();
                }
                /*
                 * Pre-condition: There are mispelled words and dictionary words still in their original value 
                 * Post-condition: Mispelled words are corrected and printed on the display
                */
                

            }
        }
    }
}