import java.util.Scanner;
//check the number is odd or even
public class Program6 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();//user input


            if ((n % 2) == 0) {//condition
                System.out.println("");
                System.out.print(n+" is even number  " );

            } else {
                System.out.println(n+" is odd number " );


            }

        }


    }


