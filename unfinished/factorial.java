/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import java.util.*;

class test2 {
  public static void RecursiveMethod(int Num){
    
    return newTotal;
  }
  
  public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            int testCases = Integer.parseInt(Scanner.nextLine());
            
            
            for (int i = 0; i < testCases; i++){
              int Year = Scanner.nextInt();
              if (Year%2 == 0){
                Combinations.add(Year + " Yang");
              } else {
                Combinations.add(Year + " Yin");
              }
              String ElementCoordinate = Elements[(int) ((Year-4)%10)/2];
              String AnimalCoordinate = Animals[(Year-4)%12];
              Combinations.set(i, Combinations.get(i)+" "+ElementCoordinate+" "+AnimalCoordinate);
            }
            
            for (int i = 0; i < Combinations.size(); i++){
              System.out.println(Combinations.get(i));
            }
        }
    }
}