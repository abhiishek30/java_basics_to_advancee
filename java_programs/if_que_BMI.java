//CALCULATE BMI

import java.util.Scanner;

public class if_que_BMI {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Calculate your BMI ");
        System.out.print("Enter Your Body Weight in kg : ");
        float a=S.nextFloat();
        System.out.print("Enter your height in meters : ");
        float b = S.nextFloat();

        float bmi= a/(b*b);
        System.out.println(bmi);

        if(bmi<18.5)
        {
            System.out.println("You are underweight");
        }
        if(bmi>=18.5 && bmi<=24.9)
        {
            System.out.println("You are normal");
        }
        if(bmi>=25 && bmi<=29.9)
        {
            System.out.println("You are class I obesity");
        }
        if(bmi>=30 && bmi<=39.9)
        {
            System.out.println("You are class II obesity ");
        }
        if(bmi>=40)
        {
            System.out.println("you are class III obesity,SAVE YOURSELF");
        }
    }
}
