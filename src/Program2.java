import java.util.Scanner;

public class Program2 {
// simple program of check leapyear

    public static void main(String[] args) {

        System.out.println("This program calculates leap year.");
        System.out.println("Enter the year in \"yyyy\"formet=> ");
        Scanner sc = new Scanner(System.in);
        // year to be checked
        int year = sc.nextInt();

        // if the year is divided by 4
        if (year % 4 == 0) {

            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}



