import java.util.Scanner;

public class Program3 {

    // marksheet program
    // IF YOU INPUT ANY WRONG IN MARKS THEN IT GIVE YOU MESSAGES
    // AND NOT RUN PROGRAM

    public static void main(String[] args) {
        String name;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("Please Enter Name = ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();//input name
        System.out.println("please enter Roll number = ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();//enter Roll number
        System.out.println("please enter math marks = ");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();// enter math marks
        // if number is inbeetwen 0 to 100 then
        if (b >= 0 && b <= 100) {//asking second science marks
            System.out.println("please enter Science marks = ");
            Scanner sc3 = new Scanner(System.in);
            c = sc3.nextInt();

            if (c >= 0 && c <= 100) {// if number is inbeetwen 0 to 100 then
                System.out.println("please enter English marks = ");
                Scanner sc4 = new Scanner(System.in);//asking English  marks
                d = sc4.nextInt();

                if (d >= 0 && d <= 100) {//if number is inbeetwen 0 to 100 then
                    System.out.println("________________________________");

                    System.out.println("|       Mark Sheet              |");
                    System.out.println("|_______________________________|");

                    System.out.println("| Name :                    " + name + " |");
                    System.out.println("| Roll No:                   " + a + " |");
                    System.out.println("|_______________________________|");
                    System.out.println("| Subjects :              Marks |");
                    System.out.println("|_______________________________|");
                    System.out.println("| Math :                    " + b + "  |");
                    System.out.println("| Science :                 " + c + "  |");
                    System.out.println("| English :                 " + d + "  |");
                    System.out.println("|_______________________________|");
                    int total = b + c + d;

                    System.out.println("| Total :                   " + total + " |");
                    System.out.println("|_______________________________|");
                    int per = total * 100 / 300;
                    System.out.println("| Percentage :               " + per + " |");
                    if (b >= 35 && c >= 35 && d >= 35) {

                        System.out.println("| Result :                 Pass |");
                    } else {
                        System.out.println("| Result :                 fail |");

                    }
                    if (per >= 80) {
                        System.out.println("| Grade :                    A+ |");
                    } else if (per >= 60 && per < 80) {
                        System.out.println("| Grade :                     A |");

                    } else if (per >= 50 && per < 60) {
                        System.out.println("| Grade :                     B |");

                    } else if (per >= 35) {
                        System.out.println("| Grade :                     C |");
                    }

                    System.out.println("|_______________________________|");


                } else {
                    System.out.println("INVALID INPUT ENGLISH MARKS");
                    System.out.println("Enter valid 0 to 100 number and try agin");//COMENT
                }
            } else {
                System.out.println("INVALID INPUT  SCIENCE MARKS");
                System.out.println("Enter valid 0 to 100 number and try agin");
            }
        } else {//if number is  100+ then give error
            System.out.println("INVALID INPUT MATH MARKS");
            System.out.println("please enter valid 0 to 100 number and try agin");

        }


    }
}





