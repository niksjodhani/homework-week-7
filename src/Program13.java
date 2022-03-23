import java.util.Scanner;

public class Program13 {

// ccheck the weeks days
    public static void main(String[] args) {
        int week;
        System.out.println("enter any number 1 to 7 to check which is week days ==>");
        Scanner obj = new Scanner(System.in);
        week = obj.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");//Monday ..if enter 1
                break;
            case 2:
                System.out.println("Tuesday");//Tuesday ..if enter 2
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");//Saturday.. if enter 6
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");//for all other numbers

        }
    }
}

