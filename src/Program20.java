import java.util.Scanner;

// verify number is specific or not
public class Program20 {
    public static void main(String[] args) {
        int number[] = {200, 201, 203, 301, 302, 401, 501};
        System.out.println("specific value is  ==>  200,201, 203, 301, 302, 401,501");
        Scanner sc = new Scanner(System.in);
        System.out.println("input number==>");
        int a = sc.nextInt();
        int find = 0;

        for (int i = 0; i < number.length; i++) {
            if (a == number[i]) {
                find = a;
                break;
            
            }
        }

        if (find == 0) {
            System.out.println("\"number is not specific==> " + a);
        } else {
            System.out.println("number is specific==> " + find);

        }

    }
}


