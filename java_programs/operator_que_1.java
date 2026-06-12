
//write the following equation : v2-u2/2as.

import java.util.Scanner;

public class operator_que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the third equation of motion :) ");
        System.out.print("enter the value of v :");
        float v = sc.nextInt();
        System.out.print("enter the value of u :");
        float u = sc.nextInt();
        System.out.print("enter the value of a :");
        float a = sc.nextInt();
        System.out.print("enter the value of s :");
        float s = sc.nextInt();
        System.out.print("Ans is : ");
        float x = (v*v - u*u);
        float y = (2*a*s);
        float eq = x/y; ;
        System.out.println(eq);
    }
}
