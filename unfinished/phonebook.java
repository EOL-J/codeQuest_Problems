package unfinished;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String[] str = input.nextLine().toLowerCase().split(" ");
                String numbers = str[0];
                String methods = str[1].toUpperCase();
                
                if (methods.equals("PARENTHESES")) {
                    System.out.println()
                } else if (methods.equals("DASHES")) {
                    
                } else if (methods.equals("PERIODS")) {
                    
                }
            }
        }
    }
}