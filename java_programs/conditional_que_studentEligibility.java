//Student scholarship eligibility


import java.util.Scanner;

public class conditional_que_studentEligibility {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Check your eligibility for Scholarship");
        System.out.print("Enter your marks : ");
        int marks = S.nextInt();
        System.out.print("Enter your attendance in percentage : ");
        float per = S.nextFloat();

        if (marks>=85 && per >=75) {
            System.out.println("you are eligible for your scholarship");
             }
            else if(marks>=95){
            System.out.println("you are eligible for your scholarship");
                }

        else{
            System.out.println("you are not eligible");
        }

    }
}
