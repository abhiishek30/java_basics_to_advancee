//check eligibility

import java.util.Scanner;

public class ifstate_que_check_eligibility {
    public static void main (String[] args){
        Scanner S = new Scanner(System.in);
        System.out.print("enter your age : ");
        int a = S.nextInt();
        if(a>=18)
        {
            System.out.println("you are eligible to vote");
        }
        if(a<=18){
            System.out.println("you are not eligible");
        }
    }
}
