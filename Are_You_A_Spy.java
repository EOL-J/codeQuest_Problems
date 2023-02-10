import java.util.Scanner;

public class Are_You_A_Spy {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] line = input.nextLine().split("\\|");
                String firstPhrase = line[0].toLowerCase();
                String secondPhrase = line[1].toLowerCase();
                boolean valid = true;
                
                for (int i = 0; i < secondPhrase.length(); i++) {
                    char chr = secondPhrase.charAt(i);
                    if (firstPhrase.indexOf(chr) < 0) {
                        valid = false;
                        break;
                    }    
                }
                if (valid) {
                    System.out.println("That's my secret contact!");
                } else {
                    System.out.println("You're not a secret agent!");
                }
            }
        }
    }
}