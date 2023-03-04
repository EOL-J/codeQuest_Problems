package unfinished.anti_asteroid_weapon;
import java.util.Scanner;

public class Anti_Asteroid_Weapon {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int testCases = Integer.parseInt(scan.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] numOfAstroids = new String[scan.nextInt()];
                for (int i = 0; i < numOfAstroids.length; i++) {
                    numOfAstroids[i] = scan.nextLine();
                }
                for (int i = 0; i < numOfAstroids.length - 1; i++) {
                    if (numOfAstroids[i + 1].compareTo(numOfAstroids[i]) < 0) {
                        String temp = numOfAstroids[i + 1];
                        numOfAstroids[i + 1] = numOfAstroids[i];
                        numOfAstroids[i] = temp;
                    }
                }
                for (String element : numOfAstroids) {
                    System.out.println(element);
                }
            }
        }
    }
}