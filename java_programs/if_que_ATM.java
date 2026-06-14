//make ATM machine

import java.util.Scanner;


public class if_que_ATM {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int bal=50000;
        int total_bal;
        int withdraw;
        System.out.println("Your card is processing....");
        System.out.println(" chose option \n 1.check balance \n 2.withdraw money \n 3.change pin");
        int a=S.nextInt();
        if(a==1) {
            System.out.print("your balance is : ");
            System.out.print(bal);
        }
        if(a==2){
            System.out.print("enter money to withdraw : ");

            int b=S.nextInt();
            if(b%100!=0)
            {
                System.out.println("Enter multiple of 100/500");
                return;
            }

            if(b<=100 || b>=50000){
                System.out.println("enter valid numbers");
                return;
            }
            System.out.print("Total balance left : ");
             bal= bal - b;
            System.out.print(bal);
        }
        if(a==3)
        {
            System.out.print("Enter current four digit pin : ");
            int c=S.nextInt();
            System.out.print("now,enter new 4 digit pin : ");
            int d=S.nextInt();
            System.out.println("your pin has been changed");
        }
        if(a<1 || a>3) {
            System.out.println("invalid option");
        }

    }
}
