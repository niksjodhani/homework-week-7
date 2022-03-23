import java.util.*;
//import java.util.Arrays;
// simple array additon program
public class Program18 {


    public static void main(String[] args) {
        System.out.println("Please enter array size : ");
        Scanner obj1 = new Scanner(System.in);
        int j =obj1.nextInt();
        Scanner obj = new Scanner(System.in);


        double sum = 0;
        double num[] = new double[j];//declare array
        System.out.println("Please enter array numbers : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = obj.nextInt();//user input
        }
        System.out.println("Original Array: " + Arrays.toString(num));//array list
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        //sum = num[1] + num[2] + num[3] + num[0];//sum of array numbers
        System.out.println("Sum of array numbers : " + sum);

    }
}

