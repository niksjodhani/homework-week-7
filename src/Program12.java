//this methode use only first cherctor chek what is it and display  it result

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//scanner object

        System.out.println("Enter any  character: ");
        char x = obj.next().charAt(0);//it will consider first letter of input

        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            System.out.println(x + "   First character is a Alphabet");
        } else if (x >= '0' && x <= '9')
        {
            System.out.println(x + "  First character  is a Number");
        } else {
            System.out.println(x + "   First character is a Symbol");
        }
    }
}




