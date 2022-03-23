import java.util.Scanner;
import java.util.Arrays;
// array program
// uesr should be able to select  size of array   and short by numeric and alphabetic
public class Program17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size : ");
        int j=sc.nextInt();
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[j];
        String[] words = new String[j];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter number ==>");
            numbers[i] = input.nextDouble();//user input
        }

        Program17 xyz = new Program17();//object calling
        xyz.number1(numbers);//method calling via object
        System.out.println("Please enter array Strings : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter alphabetical value ==>");
            words[i] = input.next();//user input
        }
        xyz.word1(words);

    }

    //method for numeric array
    public void number1(double number[]) {
        System.out.println("Original Array: " + Arrays.toString(number));//array list
        Arrays.sort(number);
        System.out.println("Sorted Array:" + Arrays.toString(number));//array list once sorted
    }

    //method for string array
    public void word1(String word[]) {
        System.out.println("Original Array: " + Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Sorted Array:" + Arrays.toString(word));
    }

}


