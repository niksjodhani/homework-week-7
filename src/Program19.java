import java.util.Scanner;
import java.util.Arrays;

public class Program19 {
    public static void main(String[] args) {
        System.out.println("Please enter array size : ");
        Scanner obj1 = new Scanner(System.in);
        int j = obj1.nextInt();
        Scanner obj = new Scanner(System.in);
        double avg = 0;
        double num[] = new double[j];//
        System.out.println("Please enter array number  : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = obj.nextInt();//user input
        }
        System.out.println("Original Array: " + Arrays.toString(num));//array list
        for (int i = 0; i < num.length; i++) {
            avg = (avg + num[i]) / num.length;

        }
        //avg = (num[0] + num[1] + num[2] + num[3] + num[4]) / 5;//Average calculation
        System.out.println("Average value of array elements: " + avg);
    }
}

