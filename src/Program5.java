import java.util.Scanner;

// input name and id and salary and get its hra,ta,ta,da,and pf and gross salary
public class Program5 {

    public static void main(String[] args) {
        String name;
        int id = 0;
        double hra = 0;
        double ta = 0;
        double da = 0;
        double pf = 0;

// simple print
        System.out.println("please enter employee id  = ");
        Scanner sc1 = new Scanner(System.in);
        id = sc1.nextInt();//enter employee id
        System.out.println("Please Enter Name = ");
        Scanner sc2 = new Scanner(System.in);
        name = sc2.next();//input name
        System.out.println("please enter Basic salary = ");
        Scanner sc = new Scanner(System.in);//input basic salary
        double salary = sc.nextDouble();


        System.out.println("|       SALARY SLIP             |");
        System.out.println("|                               |");
        System.out.println("| Employee Id         :" + id + "       |");
        System.out.println("| Name                :" + name + "    |");

        System.out.println("|                               |");

        System.out.println("| Basic salary       :" + salary + "  |");
        double har = salary * 10 / 100;
        System.out.println("| HRA 10%            :" + har + "   |");
        ta = salary * 8 / 100;
        System.out.println("| TA 8%              :" + ta + "   |");
        da = salary * 9 / 100;

        System.out.println("| DA 9%              :" + da + "   |");
        pf = salary * 20 / 100;
        System.out.println("| PF-20&             :" + pf + "   |");
        System.out.println("|_______________________________|");
        double tem = (har + ta + da - pf);

        double total = salary + tem;


        System.out.println("| Gross Salary        :" + total + "  |");
        System.out.println("|===============================|");

    }


}