//check triangle validation


import java.util.Scanner;

public class conditional_que_triangleValidation {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Check Triangle Validation by entering sides ");
        System.out.print("Enter first Side of Triangle : ");
        float fs = S.nextFloat();
        System.out.print("Enter second Side of Triangle : ");
        float ss = S.nextFloat();
        System.out.print("Enter third Side of Triangle : ");
        float ts = S.nextFloat();

        if(fs==ss && ss==ts && ts==fs) {
            System.out.println("equilateral triangle");
           }
        else if(fs==ss && ss != ts || fs != ss && fs==ts || fs!=ss && ss == ts){
            System.out.println("isosceles triangle");
           }
        else{
            System.out.println("scalene triangle");
        }
    }
}
