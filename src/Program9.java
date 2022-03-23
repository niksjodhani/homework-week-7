import java.util.Scanner;

public class Program9 {
    /*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
9. Same as above program-8 using switch statement.
 */


    public static void main(String[] args) {




            Scanner scan = new Scanner(System.in);
            char ch;
            System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
            ch = scan.next().charAt(0);


            switch (ch) {
                case 'A':
                    System.out.println("Ahemdabad");
                    break;
                case 'B':
                    System.out.println("Baroda");
                    break;
                case 'C':
                    System.out.println("Chennai");
                    break;
                case 'D':
                    System.out.println("Delhi");
                    break;
                case 'E':
                    System.out.println("Etawah");
                    break;
                case 'F':
                    System.out.println("Faridabad");
                    break;

                default:
                    System.out.print("Anyother Cityname Is Doesnot Exists");

            }


        }

}