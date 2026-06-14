//find_largest_among_five_numbers

import java.util.Scanner;

public class if_que_find_largest_among_five_numbers {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("enter 5 numbers to check ,which one is larger");
        System.out.print("Enter first number : ");
        int a = S.nextInt();
        System.out.print("Enter second number : ");
        int b = S.nextInt();
        System.out.print("Enter third number : ");
        int c = S.nextInt();
        System.out.print("Enter fourth number : ");
        int d = S.nextInt();
        System.out.print("Enter fifth number : ");
        int e = S.nextInt();

        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("A is greater than all");
        }
        if(b>c && b>d && b>e && b>a)
        {
            System.out.println("B is greater than all");
        }
        if(c>a && c>b && c>d && c>e)
        {
            System.out.println("C is greater than all");
        }
        if(d>b && d>c && d>a && d>e)
        {
            System.out.println("D is greater than all");
        }
        if(e>b && e>c && e>d && e>a)
        {
            System.out.println("E is greater than all");
        }
    }
}
