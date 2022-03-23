
import java.util.Scanner;
public class Program16 {
    // check number is “POSITIVE”, “NEGATIVE” or “ZERO”

        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.println("Please enter number: ");
            double a;
            a = obj.nextDouble();
            //condition for positive number
            if (a > 0) {
                System.out.println("This is positive number");
            }
            //condition for negative number
            else if (a < 0) {
                System.out.println("This is negative number");
            }
            //for ZERO
            else {
                System.out.println("It's a ZERO");
            }
        }

    }

