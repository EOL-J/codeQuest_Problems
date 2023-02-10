import java.util.Scanner;

public class im_board {
  public static void main(String[] args) {
    try(Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for(int testcase = 0; testcase < testCases; testcase++) {
        int lines = input.nextInt();
        String output = "";
        for(int row = 0; row < lines; row++) {
          output = "";
          for(int column = 0; column < lines; column++) {
            output += "# ";
          }
          System.out.println(output);
        }
      }
    }
  }
}
