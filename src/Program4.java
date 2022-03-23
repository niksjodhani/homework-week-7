import java.util.Scanner;

public class Program4 {


//    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//    If the parameter is not in that range return false.
//    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.*/
// check days how many days in month

    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any year:");
        int year;
        year = sc1.nextInt();

        if (year > 1 && year < 9999) {
            if (year % 4 == 0 && year % 100 != 0) {

                System.out.println(year + " is a leap year.");

            } else if (year % 400 == 0) {

                System.out.println(year + " is not a leap year.");
                year = 1;
            } else {

                System.out.println(year + " is not a leap year.");
                year = 2;
            }

            Scanner scan = new Scanner(System.in);
            System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
            int month;
            month = scan.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("\n 31 Days in this Month");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("\n 30 Days in this Month");
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
                        System.out.println(" 29  Days in this Month");
                        break;

                    } else
                        System.out.println("28  Days in this Month");
                    break;

                default:
                    System.out.println("\n Please enter Valid Number between 1 to 12");
            }
        } else
            System.out.println("enter valid year");
    }


}