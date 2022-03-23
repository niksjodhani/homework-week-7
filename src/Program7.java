import java.util.Scanner;
// check commission and total salary
public class Program7 {

    public static void main(String[] args) {
        int salesid = 0;
        int salesamount = 0;
        int salary = 0;
        String name;
        System.out.println("Enter Sale Id==>");
        Scanner sc = new Scanner(System.in);
        salesid = sc.nextInt();
        System.out.println("Enter Seller's Name==>");
        Scanner sc1 = new Scanner(System.in);
       name = sc1.next();
        System.out.println("Enter Sale Amount==>");
        Scanner sc2 = new Scanner(System.in);
        salesamount = sc2.nextInt();
        System.out.println("Enter Basic Salary==>");
        Scanner sc3 = new Scanner(System.in);
        salary = sc3.nextInt();
        if (salesamount >= 50000)
        {
            int com= (salesamount * 35 )/ 100 ;
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission=="+com);
            System.out.println("total salary==" +( salary + com));
        }
        else if (salesamount < 50000 && salesamount >= 30000)
        {
            int com= (salesamount * 20 )/ 100 ;
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission=="+com);
            System.out.println("total salary==" +( salary + com));

        } else if (salesamount < 30000 && salesamount >= 20000)
        {
            int com= (salesamount * 10 )/ 100 ;
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission=="+com);
            System.out.println("total salary==" +( salary + com));


        } else if (salesamount < 20000 && salesamount >= 10000)
        {
            int com= (salesamount * 5 )/ 100 ;
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission=="+com);
            System.out.println("total salary==" +( salary + com));

        } else if (salesamount < 10000 && salesamount >= 1)
        {
            int com= (salesamount * 2 )/ 100 ;
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission=="+com);
            System.out.println("total salary==" +( salary + com));

        }else {
            System.out.println("Seller Name ==> "+name);
            System.out.println("Seller Id ==> "+salesid);
            System.out.println("this is basic salary==" + salary);
            System.out.println("total sale==>"+salesamount);
            System.out.println("this is commission==  0 ");
            System.out.println("total salary==" + salary );
            System.out.println("\"No Commission Focas on Sale\"");
        }
    }
}

