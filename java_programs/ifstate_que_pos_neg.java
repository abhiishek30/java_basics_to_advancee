//que...check no is positive,negative or zero


import java.util.Scanner;

public class ifstate_que_pos_neg {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("enter a number : ");
        int a = S.nextInt();
        if(a>0){
            System.out.println("number is positive");
        }
            if(a<0) {
                System.out.println("number is negative");
            }
                if(a==0) {
                    System.out.println("number is neither negative nor positive,zero");
                }
    }
}
