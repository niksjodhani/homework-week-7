import java.util.Scanner;

// to check the number is odd or even
public class Program1 {


    public static void main(String[] args) {
        int i = 1;
        System.out.println("enter any number and press enter to check number is odd or even");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        if ((n % 2) == 0) {//this condition is even then

            System.out.print(n + " is even number ");

        } else {// if number is odd then
            System.out.println(n + " is odd number ");


        }

    }


}



