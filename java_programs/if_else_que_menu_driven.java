//menu driven banking system

import java.util.Scanner;

public class if_else_que_menu_driven {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int bal = 50000;
        System.out.println("---Menu Driven Banking System---");
        System.out.println("press any button to start ");
        System.out.println();
        System.out.println("1.check balance\n2.withdraw\n3.deposit\n");
        System.out.println("choose option , you want to do ");
        int a = S.nextInt();

        if (a == 1) {
            System.out.println("Your Balance is : 50000 ");
            return;
        }
        if (a == 2) {
            System.out.println("Enter Amount to Withdraw");
            int with = S.nextInt();
            if(with%100!=0){
                System.out.println("enter multiple of 100 or 500");
                return;
            }
            if(with>50000 || with<0)
            {
                System.out.println("enter valid amount");
                return;

            }
            bal = bal - with;
            System.out.print("your remaining balance is : ");
            System.out.print(bal);
            return;
        }
        if (a == 3) {
            System.out.println("Enter amount to deposit");
            int dep = S.nextInt();
            bal = bal + dep;
            System.out.print(" total balance is : ");
            System.out.print(bal);
        }

         else{
             System.out.println("invalid option");
         }
    }

}
