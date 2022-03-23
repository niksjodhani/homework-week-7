import java.util.Scanner;

public class Program10 {


    //calculater
    public static void main(String[] args) {
        char sign;

        double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.print("hellow i am simple calculater");
        System.out.println(" i have 4 option \"+,-,*,/\"");
        System.out.println("enter numerical value and press enter");//enter valid value
        System.out.println("Enter first number:");
        number1 = input.nextDouble();//input first value

        System.out.println("Enter second number:");


        number2 = input.nextDouble();//input second value

        System.out.print("Enter the mathematical operator \"+,-,*,/\" to be used and press enter to see your result = ");

        sign = input.next().charAt(0);//input opraters
        // if else conditin use to check what you doing with two number
        if (sign == '+') {//if select + then run this condition
            result = number1 + number2;
            System.out.println(number1 + "" + "+" + number2 + "" + "=" + "" + "" + result);

        } else if (sign == '-') {//if select - then run this condition
            result = number1 - number2;
            System.out.println(number1 + "" + "-" + number2 + "" + "=" + "" + "" + result);


        } else if (sign == '/') {//if select / then run this condition
            result = number1 / number2;
            System.out.println(number1 + "" + "/" + number2 + "" + "=" + "" + "" + result);

        } else if (sign == '*') {//if select * then run this condition
            result = number1 * number2;
            System.out.println(number1 + "" + "*" + number2 + "" + "=" + "" + "" + result);


        } else

            System.out.println("your input is not valid please chek it and retry");


    }
}


