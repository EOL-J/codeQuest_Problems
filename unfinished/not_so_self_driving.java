package unfinished;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class not_so_self_driving {
    public static void main (String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                NumberFormat df = new DecimalFormat(".00");
                String[] elements = input.nextLine().split(":");
                double speed = Double.parseDouble(elements[0]);
                double distance = Double.parseDouble(elements[1]);
                if (speed >= 0.00 && speed <= 200.00 && distance >= 1.00 && distance <= 400.00) {
                    if (distance/speed <= 1.00) {
                        System.out.println("SWERVE");
                    } else if (distance/speed <= 5.00) {
                        System.out.println("BRAKE");
                    } else {
                        System.out.println("SAFE");
                    }
                }
            }
        }
    }    
}
