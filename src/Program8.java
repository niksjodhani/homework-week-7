import java.util.Scanner;

public class Program8 {
    /*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */


        Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            Program8 cn = new Program8();
            cn.AtoF();


        }

        public void AtoF() {
            char ch;
            System.out.println("Enter any alphabet 'A'TO'F' : ");
            ch = scan.next().charAt(0);
            if (ch == 'A') {
                System.out.println("Ahemdabad");
            } else if (ch == 'B') {
                System.out.println("Baroda");
            } else if (ch == 'C') {
                System.out.println("Chennai");
            } else if (ch == 'D') {
                System.out.println("Delhi");
            } else if (ch == 'E') {
                System.out.println("Etawah");
            } else if (ch == 'F') {
                System.out.println("Faridabad");
            } else {
                System.out.print("Anyother Cityname Is Doesnot Exists");
            }


        }

    }