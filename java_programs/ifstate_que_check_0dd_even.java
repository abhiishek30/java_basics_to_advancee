//Que..check even or odd

import java.util.Scanner;

public class ifstate_que_check_0dd_even {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter number to check even or odd : ");
        int a=S.nextInt();
        if(a%2==0)
        {
            System.out.println("number is even");
        }
        if(a%2!=0) {
            System.out.println("number is odd");
        }
    }
}
