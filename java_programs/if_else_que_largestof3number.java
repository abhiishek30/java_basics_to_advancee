//find largest among three number

import java.util.Scanner;

public class if_else_que_largestof3number {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        System.out.print("Enter first number : ");
        int a = S.nextInt();
        System.out.print("Enter second number : ");
        int b = S.nextInt();
        System.out.print("Enter third number : ");
        int c = S.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is greater");
        }
        if(b>c && b>a)
        {
            System.out.println("B is greater");
        }
        else {
            System.out.println("C is greater");
        }
    }
}
