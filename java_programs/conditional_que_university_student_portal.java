//Que...University Student Portal

import java.util.Scanner;


public class conditional_que_university_student_portal {
    public static void main(String[] args) {
        Scanner S= new Scanner (System.in);

        String u = "a";
        String p = "9";

        System.out.println("\n   login portal\n");

        System.out.print("Enter your username : ");
        String un = S.next();
        System.out.print("Enter password : ");
        String pw = S.next();

        if(un.equals(u) && pw.equals(p)){
            System.out.println("login successful");
        }
        else if(un.equals(u)){
            System.out.println("incorrect password");
            return;
        }
        else {
            System.out.println("username not found");
            return;
        }

        System.out.println("Main Menu \n1.check result\n2.fee payment\n3.scholarship\n4.exit");
        int mm = S.nextInt();
        switch(mm){
            case 1 :
                System.out.print("input percentage : ");
                float per = S.nextFloat();
                if(per >=90 && per<=100)
                {
                    System.out.println("you got Grade 'A'");
                    System.out.println("well done");
                }
                else if(per >=80 && per<90)
                {
                    System.out.println("you got Grade 'B'");
                    System.out.println("nice");
                }
                else if(per >=70 && per<80)
                {
                    System.out.println("you got Grade 'C'");
                    System.out.println("fair");
                }
                else if(per >=60 && per<70)
                {
                    System.out.println("you got Grade 'D'");
                    System.out.println("you should have do more practise");
                }
                else if(per>=1 && per<60)
                {
                    System.out.println("come with your parents");
                }
                else {
                    System.out.println("invalid percentage");
                    System.out.println("write correct");
                }
                break;

            case 2:
                System.out.println("total course payment : 100000 ");
                System.out.println("You paid : 45000");
                System.out.print("How much you want to paid : ");
                int pd=S.nextInt();
                System.out.println("minimum amount you can paid : 10000");
                if(pd<=55000 && pd>=10000)
                {
                    int rn = (100000-45000)-pd;
                    System.out.println("remaining amount,you have to paid : "+rn);
                }
                else{
                    System.out.println("enter valid balance to paid");
                }
                break;

            case 3:
                System.out.println("\nEnter your total marks and attendance percentage to check your eligibility for Scholarship");
                System.out.print("Enter percentage : ");
                float pe=S.nextFloat();
                System.out.print("Enter marks : ");
                int m = S.nextInt();
                if(m <=100 && m>=90 && pe<=100 && pe>=90)
                {
                    System.out.println("you are qualified");
                }
                else if(m <=100 && m>=90 || pe<=100 && pe>=90 )
                {
                    System.out.println("you are qualified");
                }
                else if(pe<=100 && pe>=95)
                {
                    System.out.println("you are qualified");
                }
                else if(m <=100 && m>=95  )
                {
                    System.out.println("you are qualified");
                }
                else {
                    System.out.println("you are not qualified");
                }
                break;

            case 4:
                System.out.println("you are logged out from the portal");
                break;
            default:
                System.out.println("chose invalid option");
        }

    }
}
